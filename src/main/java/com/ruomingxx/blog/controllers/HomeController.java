package com.ruomingxx.blog.controllers;

import com.ruomingxx.blog.services.AppSetting;
import com.ruomingxx.blog.services.PostService;
import com.ruomingxx.blog.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jicheng
 * on 8/23/2017.
 */


@Controller
public class HomeController {

    @Autowired
    private PostService postService;
    @Autowired
    private AppSetting appSetting;


    @RequestMapping(value = "", method = GET)
    public String index(@RequestParam(defaultValue = "1") int page, Model model) {
        page = page < 1 ? 0 : page - 1;
        Page<Post> posts = postService.getAllPublishedPostsByPage(page, appSetting.getPageSize());

        model.addAttribute("totalPages", posts.getTotalPages());
        model.addAttribute("posts", posts);
        model.addAttribute("page", page + 1);

        return "home/index";
    }


//    @RequestMapping("/")
//    public String home(Map<String, Object> model) {
//        model.put("totalPages", new Date());
//        model.put("posts", "Hello World");
//        model.put("page", "Hello App");
//        return "home/index";
//    }
}
