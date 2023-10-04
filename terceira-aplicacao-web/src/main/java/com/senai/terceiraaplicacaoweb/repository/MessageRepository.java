package com.senai.terceiraaplicacaoweb.repository;

import com.senai.terceiraaplicacaoweb.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel,Long> {
}
