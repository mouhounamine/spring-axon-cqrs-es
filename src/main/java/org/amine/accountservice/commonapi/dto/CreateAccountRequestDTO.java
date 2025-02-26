package org.amine.accountservice.commonapi.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAccountRequestDTO {
    private String currency;
    private double initialBalance;

    public String getCurrency() {
        return currency;
    }

    public double getInitialBalance() {
        return initialBalance;
    }
}
