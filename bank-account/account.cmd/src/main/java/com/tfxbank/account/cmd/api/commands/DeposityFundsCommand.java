package com.tfxbank.account.cmd.api.commands;

import com.tfxbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class DeposityFundsCommand extends BaseCommand {
    private double amount;
}
