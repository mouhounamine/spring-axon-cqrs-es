package org.amine.accountservice.commands.controllers;

import org.amine.accountservice.commonapi.commands.CreateAccountCommand;
import org.amine.accountservice.commonapi.dto.CreateAccountRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands/account")
public class AccountCommandController {

    private final CommandGateway commandGateway;

    public AccountCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/create")
    public CompletableFuture<String> createNewAccount(@RequestBody CreateAccountRequestDTO request) {
        String accountId = UUID.randomUUID().toString();
        System.out.println("Generating new account with ID: " + accountId);
        return commandGateway.send(new CreateAccountCommand(
                accountId,
                request.getCurrency(),
                request.getInitialBalance()
        ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
