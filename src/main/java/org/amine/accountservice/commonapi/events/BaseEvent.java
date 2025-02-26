package org.amine.accountservice.commonapi.events;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
public abstract class BaseEvent<T> {
    @TargetAggregateIdentifier
    public T id;
    public BaseEvent(T id) {
        this.id = id;
    }
}
