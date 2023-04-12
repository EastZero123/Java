package com.luv2code.springdemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice your backhand vooley";

    }
    
}
