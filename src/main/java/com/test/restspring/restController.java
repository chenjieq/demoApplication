package com.test.restspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @RequestMapping("/h")
    public String home() {
        return "Hello";
    }

    @RequestMapping("/w")
    public String word() {
        return "World";
    }
}
