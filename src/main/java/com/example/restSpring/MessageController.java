package com.example.restSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MessageController {
    private static final String template = "Witaj, %s";
    private final AtomicLong counter = new AtomicLong();
    private String name;
    private long id = 0;

    @GetMapping("/przywitanie")
    public Message message(@RequestParam(value = "name", defaultValue = "Dominik!")String name){
       return new Message(counter.incrementAndGet(),String.format(template,name));
    }
}
