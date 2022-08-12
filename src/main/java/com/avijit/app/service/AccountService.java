package com.avijit.app.service;

import com.avijit.app.model.AccountValidateRequestBody;
import com.avijit.app.model.AccountValidateResponseBody;

public interface AccountService {

    AccountValidateResponseBody validate(AccountValidateRequestBody requestBody);
}
