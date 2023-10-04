package com.senai.terceiraaplicacaoweb.controller;

import com.senai.terceiraaplicacaoweb.model.MessageModel;
import com.senai.terceiraaplicacaoweb.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String index() {
        return "home/index";
    }
    @PostMapping(value = "mensagem")
    public String sendMessage(MessageModel messageModel){
        messageService.saveMessage(messageModel);
        return "home/index";
    }

}
