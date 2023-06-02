package com.cristianporretydev.posts;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class PostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostsApplication.class, args);
	}

	@Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
       return new TimedAspect(registry);
    }

}
