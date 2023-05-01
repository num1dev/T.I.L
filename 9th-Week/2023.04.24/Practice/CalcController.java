package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {

    @PostMapping("/calc.do")
    public ModelAndView showGrade(@RequestParam("firstNum") int firstNum, @RequestParam("operator") String operator, @RequestParam("secondNum") int secondNum) {
        ModelAndView mav = new ModelAndView();
        if (operator.equals("divide")) {
            if(secondNum != 0){
                mav.addObject("name", firstNum / secondNum);
                mav.setViewName("calcResult") ;
            }
            else {
                mav.setViewName("errorResult") ;
            }
        } else if(operator.equals("plus")) {
            mav.addObject("name",firstNum + secondNum);
            mav.setViewName("calcResult") ;
        } else if (operator.equals("minus") ) {
            mav.addObject("name",firstNum - secondNum);
            mav.setViewName("calcResult") ;
        } else {
            mav.addObject("name",firstNum * secondNum);
            mav.setViewName("calcResult") ;
        }
        return mav;
    }
}
