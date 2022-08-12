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

        String step1 = "Mr. Nazrul Islam";
        String step2 = "H#U@UwWKbcL!";
        String step3 = "HUUwWKbcL";
        String step4 = "IVVxXLcdM";
        String step5 = "IVVXXLCDM";
        String step6 = "1681";
        String step7 = "MDCLXXXI";

        AccountValidateRequestBody requestBody = new AccountValidateRequestBody();
        requestBody.setRequestId("A32W4ER2341");
        requestBody.setAccountName("TXIuIE5henJ1bCBJc2xhbQ==");
        requestBody.setAmount("SCNVQFV3V0tiY0wh");

        AccountValidateResponseBody responseBody = accountService.validate(requestBody);

        Assertions.assertNotNull(responseBody);

        Assertions.assertEquals(responseBody.getStep1(), step1,
                "Step1 not matched.");
        Assertions.assertEquals(responseBody.getStep2(), step2,
                "Step2 not matched.");
        Assertions.assertEquals(responseBody.getStep3(), step3,
                "Step3 not matched.");
        Assertions.assertEquals(responseBody.getStep4(), step4,
                "Step4 not matched.");
        Assertions.assertEquals(responseBody.getStep5(), step5,
                "Step5 not matched.");
        Assertions.assertEquals(responseBody.getStep6(), step6,
                "Step6 not matched.");
        Assertions.assertEquals(responseBody.getStep7(), step7,
                "Step7 not matched.");
    }
}
