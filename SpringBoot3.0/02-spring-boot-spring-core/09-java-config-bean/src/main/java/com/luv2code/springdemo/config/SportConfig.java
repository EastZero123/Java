package com.luv2code.springdemo.config;

import com.luv2code.springdemo.common.Coach;
import com.luv2code.springdemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
