package com.cristianporretydev.profiles.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristianporretydev.profiles.controller.client.PostsFeignClient;

import com.cristianporretydev.profiles.controller.client.PostsFeignClient;

import com.cristianporretydev.profiles.controller.client.PostsFeignClient;

import com.cristianporretydev.profiles.controller.client.PostsFeignClient;

import lombok.RequiredArgsConstructor;

@Validated
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/posts")
public class ProfileController {

	private final PostsFeignClient postsFeignClient; 


        @GetMapping("feign-working")
    	public String feignWorking(){
        	return postsFeignClient.feignWorking();
    	}
     
         

}
