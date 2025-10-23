package com.tfxbank.account.cmd.api.commands;

import com.tfxbank.account.common.dto.AccountType;
import com.tfxbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
