package org.example.taskmanager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return     "dfgdsgf";
    }
}
