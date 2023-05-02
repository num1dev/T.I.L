
package com.example.springedu.dao;


import com.example.springedu.domain.BookDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapperDAO {
    @Insert( "insert into book (title, price, kind) values (#{title},#{price},#{kind})")
    public boolean insert(BookDTO book);

    @Select("select id, title, concat(format(price, 0), '원') as price, kind from book")
    public List<BookDTO> selectE1();

    @Select("select id, title, concat(format(price, 0), '원') as price, kind from book order by price desc")
    public List<BookDTO> selectE2();


    @Select("select title, concat(format(price, 0), '원') as price from book where price>=20000")
    public List<BookDTO> selectE3();

    @Select("select title,  concat(format(price, 0), '원') as price from book where kind='b01'")
    public List<BookDTO> searchE4();

    @Select("select title, concat(format(price, 0), '원') as price from book where kind='b04' or kind='b05'")
    public List<BookDTO> searchE5();

    @Select("select title, concat(format(price, 0), '원') as price from book where title like concat('%', #{title}, '%')")
    public List<BookDTO> searchE6(String title);

    @Select("select kind, concat(format(avg(price), 0), '원') price from book group by kind")
    public List<BookDTO> searchE7();

}
