package org.amine.accountservice.commonapi.commands;

import lombok.Getter;

@Getter
public class CreateAccountCommand extends BaseCommand<String> {
    private String currency;
    private double initialBalance;

    public CreateAccountCommand(String id, String currency, double initialBalance) {
        super(id);
        this.currency = currency;
        this.initialBalance = initialBalance;
    }

    public String getId() {
        return id;
    }
    public String getCurrency() {
        return currency;
    }

    public double getInitialBalance() {
        return initialBalance;
    }
}