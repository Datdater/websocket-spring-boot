package com.demosocket.socket.payload;

import com.demosocket.socket.enums.MessageType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
}
