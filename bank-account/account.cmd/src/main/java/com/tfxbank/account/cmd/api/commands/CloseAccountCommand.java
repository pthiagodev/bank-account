package com.tfxbank.account.cmd.api.commands;

import com.tfxbank.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id)  {
        super(id);
    }
}
