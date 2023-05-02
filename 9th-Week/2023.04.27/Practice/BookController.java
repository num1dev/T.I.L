package com.example.springedu.controller;

import com.example.springedu.dao.BookMybatisDAO;

import com.example.springedu.domain.BookDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
	@Autowired
	BookMybatisDAO dao;


	@RequestMapping("/book")
	public String bookForm() {
		return "bookPage";
	}

	@RequestMapping("/bookinfo/{num}")
	public ModelAndView listAll(@PathVariable String num) {
		ModelAndView mav = new ModelAndView();
		List<BookDTO> list = null;
		switch (num) {
			case "b1":
				list = dao.selectE1();
				break;
			case "b2":
				list = dao.searchE2();
				break;
			case "b3":
				list = dao.searchE3();
				break;
			case "b4":
				list = dao.searchE4();
				break;
			case "b5":
				list = dao.searchE5();
				break;
			case "b6":
				list = dao.searchE6("자바");
				break;
			case "b7":
				list = dao.searchE6("스프링");
				break;
			case "b8":
				list = dao.selectE7();
				break;
		}
		if (list.size() != 0) {
			mav.addObject("list", list);
			mav.addObject("button", "메인화면으로");
		} else {
			mav.addObject("msg", "추출된 결과가 없어요");
		}
		mav.setViewName("bookPage");
		return mav;
	}
}

