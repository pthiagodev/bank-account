package com.tfxbank.account.common.events;

import com.tfxbank.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FundsWithdrawEvent extends BaseEvent {
    private double withdrawAmount;
}
