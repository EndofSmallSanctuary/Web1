package com.web1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestlessController {

    @GetMapping(value = "")
    String Hello(){
        return "Hello World 1";
    }
}
