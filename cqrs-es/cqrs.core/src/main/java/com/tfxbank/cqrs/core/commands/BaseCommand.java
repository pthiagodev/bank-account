package com.tfxbank.cqrs.core.commands;

import com.tfxbank.cqrs.core.messages.Message;
import lombok.Data;

@Data
public abstract class BaseCommand extends Message {

    public BaseCommand() {}

    public BaseCommand(String id) {
        super(id);
    }
}
