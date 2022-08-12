package com.avijit.app.service;

import com.avijit.app.model.AccountValidateRequestBody;
import com.avijit.app.model.AccountValidateResponseBody;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Override
    public AccountValidateResponseBody validate(AccountValidateRequestBody requestBody) {

        AccountValidateResponseBody responseBody = new AccountValidateResponseBody();
        responseBody.setAccountName("Mr. Nazrul Islam");
        responseBody.setAmount("MDCLXXXI");

        return responseBody;
    }
}
