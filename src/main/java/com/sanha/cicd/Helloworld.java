package com.sanha.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Helloworld {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
