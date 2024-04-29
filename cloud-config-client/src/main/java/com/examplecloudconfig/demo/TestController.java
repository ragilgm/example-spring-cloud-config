package com.examplecloudconfig.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RefreshScope
public class TestController {

    @Value("${example.value:}")
    private String exampleValue;


    @Autowired
    private Environment environment;

    @GetMapping
    public String hello(){
        StringBuilder sb = new StringBuilder();
        var x = environment.getActiveProfiles();
        Arrays.stream(environment.getActiveProfiles()).forEach(profile -> {
            sb.append("Active Profile: ").append(profile).append("\n");
        });
        return "the value is : "+exampleValue;

    }

}
