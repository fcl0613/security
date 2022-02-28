package com.fcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/bye")
    @ResponseBody
    public String sayBye(){
        return "bye";
    }

    @GetMapping("/comments")
    @ResponseBody
    public String comments(){
        return "comments";
    }

    @GetMapping("/hotFix")
    @ResponseBody
    public String hotFix(){
        return "hotFix";
    }

    @GetMapping("/masterTest")
    @ResponseBody
    public String masterTest(){
        return "masterTest";
    }
}
