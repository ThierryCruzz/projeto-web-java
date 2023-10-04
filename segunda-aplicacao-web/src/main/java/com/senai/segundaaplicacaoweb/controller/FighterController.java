package com.senai.segundaaplicacaoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/lutadores")
public class FighterController {
    @GetMapping
    public String indexFighter(){
        return "fighters/lutadores";
    }
}
