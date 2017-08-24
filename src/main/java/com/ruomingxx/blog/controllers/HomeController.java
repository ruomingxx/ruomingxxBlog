package com.ruomingxx.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jicheng
 * on 8/23/2017.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
