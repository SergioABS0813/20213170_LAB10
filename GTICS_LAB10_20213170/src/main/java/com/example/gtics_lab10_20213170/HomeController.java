package com.example.gtics_lab10_20213170;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String index(){
        return "index";
    }

}
