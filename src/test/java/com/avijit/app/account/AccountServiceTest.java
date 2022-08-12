package com.avijit.app.account;

import com.avijit.app.model.AccountValidateRequestBody;
import com.avijit.app.model.AccountValidateResponseBody;
import com.avijit.app.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTest {

    @Autowired
    AccountService accountService;

    @Test
    public void accountValidateTest() {

        String actualAccountName = "Mr. Nazrul Islam";
        String actualAmount = "MDCLXXXI";

        AccountValidateRequestBody requestBody = new AccountValidateRequestBody();
        requestBody.setRequestId("A32W4ER2341");
        requestBody.setAccountName("TXIuIE5henJ1bCBJc2xhbQ==");
        requestBody.setAmount("SCNVQFV3V0tiY0wh");

        AccountValidateResponseBody responseBody = accountService.validate(requestBody);

        Assertions.assertNotNull(responseBody);

        Assertions.assertEquals(responseBody.getAccountName(), actualAccountName,
                "Account name not matched.");
        Assertions.assertEquals(responseBody.getAmount(), actualAmount,
                "Amount not matched.");
    }
}
