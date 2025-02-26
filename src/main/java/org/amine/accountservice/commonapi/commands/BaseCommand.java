package org.amine.accountservice.commonapi.commands;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
public abstract class BaseCommand<T> {
    @TargetAggregateIdentifier
    public T id;
    public BaseCommand(T id) {
        this.id = id;
    }
}
