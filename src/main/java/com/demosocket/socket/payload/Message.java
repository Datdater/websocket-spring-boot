package com.demosocket.socket.payload;

import lombok.Data;

@Data
public class Message {
    private String text;
    private String to;
}
