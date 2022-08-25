package com.cj.quickspring.common.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/common")
//@Api(tags = "/common")
public class CommonController {

    @GetMapping("/common")
    public String getCommonData(@RequestParam("date") String date){
        String value = "hello world!";
        return date+value;
    }

}
