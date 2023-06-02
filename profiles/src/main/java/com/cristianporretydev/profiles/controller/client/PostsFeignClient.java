package com.cristianporretydev.profiles.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("posts")
public interface PostsFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "api/v1/votos/hello-world", consumes = "application/json")
    public String feignWorking();
    
}
