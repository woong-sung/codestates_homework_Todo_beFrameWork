package com.CodeStates.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do App by JSW (ver 0.0.2)" ;
    }
}
