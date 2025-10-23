package com.tfxbank.cqrs.core.infrastructure;

import com.tfxbank.cqrs.core.commands.BaseCommand;
import com.tfxbank.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
