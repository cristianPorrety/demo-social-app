}package com.cristianporretydev.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}

}
