package com.senai.atividadeaplicacaoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class bottom {

    @Controller
    @RequestMapping(value = "/")
    public class HomeController {
        @GetMapping
        public String index(){
            return "index/index";
        }
    }
}
