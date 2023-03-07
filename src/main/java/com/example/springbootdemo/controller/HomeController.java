package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/user")
    public User _user() {
        User user = new User();
        user.setId("1");
        user.setName("Subhanshu Bansal");
        user.setEmailId("subhanshu.bansal5566@gmail.com");

        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id) {
        return "The path variable is:" + id;
    }
}
