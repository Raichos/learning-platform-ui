package com.raicho.learningplatformui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author laizhihao
 * @version 1.0
 * @Classname PageController
 * @description
 * @date 2021/2/1 16:47
 */
@Controller
public class PageController {


    @RequestMapping("/index")
    public String index() {
        return "/index";
    }


    @RequestMapping("/coursedetail")
    public String coursedetail() {
        return "/coursedetail";
    }

    @RequestMapping("/coursevideo")
    public String coursevideo() {
        return "/coursevideo";
    }

    @RequestMapping("/course")
    public String course() {
        return "/course";
    }

    @RequestMapping("/class")
    public String claszz() {
        return "/class";
    }

    @RequestMapping("/question")
    public String question() {
        return "/question";
    }

    @RequestMapping("/article")
    public String article() {
        return "/article";
    }

    @RequestMapping("/articleDetail")
    public String articleDetail() {
        return "/articleDetail";
    }

}
