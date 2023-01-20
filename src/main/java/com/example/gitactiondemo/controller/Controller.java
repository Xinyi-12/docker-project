package com.example.gitactiondemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("git")
    public String getMessage(){
        return "Hello from git";
    }
    
        @GetMapping("anotherGit")
    public String getAnotherMessage(){
        return "Hello from another git";
    }

    @GetMapping("anotherGit2")
    public String getAnotherMessage2(){
        return "Hello from another git2";
    }

    @GetMapping("anotherGit3")
    public String getAnotherMessage3(){
        return "Hello from another git3";
    }
}
