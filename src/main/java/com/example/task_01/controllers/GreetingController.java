package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam(value = "timeOfDay") String timeOfDay) {
        Greeting greeting = new Greeting("Migle");
        return "Good  " + timeOfDay + " " + greeting.getName() + "!";
    }

    @PostMapping (value = "/greeting/christmas")
    public String christmas() {
        Celebration celebration = new Celebration();
        return celebration.getMessage();
    }

}
