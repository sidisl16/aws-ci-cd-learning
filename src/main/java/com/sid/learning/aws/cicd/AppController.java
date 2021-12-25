package com.sid.learning.aws.cicd;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AppController {


    @GetMapping(value = "/ping", produces = MediaType.TEXT_PLAIN_VALUE)
    public String showMessage() {
        return "pong - AWS CI CD pipeline example!!!";
    }
}
