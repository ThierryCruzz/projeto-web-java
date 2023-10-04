package com.senai.terceiraaplicacaoweb.service;

import com.senai.terceiraaplicacaoweb.model.MessageModel;
import com.senai.terceiraaplicacaoweb.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private  MessageRepository messageRepository;

    public MessageModel saveMessage(MessageModel messageModel){
        return messageRepository.save(messageModel);
    }
}
