package com.luv2code.springdemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice your backhand vooley";

    }
    
}
