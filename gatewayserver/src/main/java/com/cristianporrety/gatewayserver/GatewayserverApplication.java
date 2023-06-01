package com.cristianporrety.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

		
	@Bean
		public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		    return builder.routes()
		        .route(p -> p
		            .path("/porretydev/profiles/**")
		            .filters(f -> f.rewritePath("/porretydev/profiles/(?<segment>.*)","/${segment}")
		            				.addResponseHeader("X-Response-Time",new Date().toString()))
		            .uri("lb://PROFILES")).
		        route(p -> p
			            .path("/porretydev/posts/**")
			            .filters(f -> f.rewritePath("/porretydev/posts/(?<segment>.*)","/${segment}")
			            		.addResponseHeader("X-Response-Time",new Date().toString()))
			            .uri("lb://POSTS")).build();
		}

}
