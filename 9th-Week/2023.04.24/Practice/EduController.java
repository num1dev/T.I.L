package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EduController {

    @PostMapping("/eduController")
    public ModelAndView showGrade(@RequestParam("name") String name, @RequestParam("avgScore") int avgScore) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", name);
        if (avgScore >= 90) {
            mav.setViewName("gradeA") ;
        } else if (avgScore >= 80) {
            mav.setViewName("gradeB") ;
        } else if (avgScore >= 70) {
            mav.setViewName("gradeC") ;
        } else {
            mav.setViewName("gradeD") ;
        }
        return mav;
    }
}

