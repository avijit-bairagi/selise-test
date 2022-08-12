package com.avijit.app.controller;

import com.avijit.app.model.AccountValidateRequestBody;
import com.avijit.app.model.AccountValidateResponseBody;
import com.avijit.app.service.AccountService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/validate")
    public AccountValidateResponseBody validate(@RequestBody @Validated AccountValidateRequestBody requestBody) {

        return accountService.validate(requestBody);
    }
}
