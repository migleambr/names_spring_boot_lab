package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam(value = "timeOfDay") String timeOfDay) {
        Greeting greeting = new Greeting("Migle");
        return "Good  " + timeOfDay + " " + greeting.getName() + "!";
    }

}
