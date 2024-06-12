package com.demosocket.socket.controller;

import com.demosocket.socket.payload.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/application")
    @SendTo("/all/messages")
    public com.demosocket.socket.payload.Message send(final Message message) throws Exception {
        return message;
    }
}
