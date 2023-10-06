package org.buloichyk.springrestapp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController // @Controller + @ResponseBody
public class FirstRESTController {

    // @ResponseBody
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
