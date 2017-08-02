package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	@Value("${spring.datasource.url}")
	private String dataSourceURL;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + " "+dataSourceURL;
    }
    
}
