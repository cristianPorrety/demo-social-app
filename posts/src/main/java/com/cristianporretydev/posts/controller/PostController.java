package com.cristianporretydev.posts.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Validated
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/posts")
public class PostController {

        @GetMapping("hello-world")
    	public String helloWorld(){
           System.out.println("feign request :)");
           return "hello from identidad microservice";
    	}

}
