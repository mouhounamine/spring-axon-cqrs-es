package org.amine.accountservice.commonapi.events;

import org.amine.accountservice.commonapi.enums.AccountStatus;

public class AccountCreatedEvent extends BaseEvent<String> {
    private String currency;
    private double balance;
    private AccountStatus status;

    public AccountCreatedEvent(String id, String currency, double balance, AccountStatus status) {
        super(id);  // Appelle le constructeur de BaseEvent pour initialiser id
        this.currency = currency;
        this.balance = balance;
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }
}