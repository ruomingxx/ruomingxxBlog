package com.ruomingxx.blog.controllers;

import com.ruomingxx.blog.support.web.MessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;


@Controller
public class UserController {

    @RequestMapping("signin")
    public String signin(Principal principal, RedirectAttributes ra) {
        return principal == null ? "users/signin" : "redirect:/";
    }
}