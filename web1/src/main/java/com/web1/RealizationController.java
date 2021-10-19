package com.web1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealizationController {

    @GetMapping(value = "")
    String requestTask(){
        return "Hello World 1";
    }
}
