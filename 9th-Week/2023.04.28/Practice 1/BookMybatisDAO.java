package com.example.springedu.dao;

import com.example.springedu.domain.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookMybatisDAO {
	@Autowired
	SqlSession session;



	public boolean insert(BookDTO book) {
		boolean result = false;
		try {
			String statement = "lab1.insertBook";
			session.insert(statement, book);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<BookDTO> selectE1() {
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam1";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


	public List<BookDTO> searchE2(){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam2";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<BookDTO> searchE3(){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam3";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<BookDTO> searchE4(){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam4";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public List<BookDTO> searchE5(){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam5";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<BookDTO> searchE6(String title){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam6";
			list = session.selectList(statement, title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<BookDTO> selectE7(){
		List<BookDTO> list = null;
		try {
			String statement = "lab1.exam7";
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
