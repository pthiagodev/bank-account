package com.tfxbank.cqrs.core.messages;

import lombok.Data;

@Data
public abstract class Message {
    private String id;

    public Message() {
    }

    public Message(String id) {
        this.id = id;
    }
}
