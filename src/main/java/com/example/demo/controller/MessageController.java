package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class MessageController {

//    @ResponseBody
    @GetMapping("/message")
    Message send() {
        return new Message("this is hw");
    }

    @PostMapping("/messagePost")
    Message echo(@RequestBody Message message) {
        return message;
    }
}
