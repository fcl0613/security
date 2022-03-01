package com.fcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PullTestController {
  @GetMapping("/pull")
    @ResponseBody
    public String pullTest(){
        return "pull";
    }
}
