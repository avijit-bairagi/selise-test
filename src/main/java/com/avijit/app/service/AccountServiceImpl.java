package com.avijit.app.service;

import com.avijit.app.common.RomanNumberUtils;
import com.avijit.app.common.Utils;
import com.avijit.app.model.AccountValidateRequestBody;
import com.avijit.app.model.AccountValidateResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public AccountValidateResponseBody validate(AccountValidateRequestBody requestBody) {

        AccountValidateResponseBody responseBody = new AccountValidateResponseBody();

        String accountName = Utils.decode(requestBody.getAccountName());
        logger.info(accountName);
        responseBody.setStep1(accountName);

        String decodedAmount = Utils.decode(requestBody.getAmount());
        logger.info(decodedAmount);
        responseBody.setStep2(decodedAmount);

        String sanitizedAmount = Utils.removeSpecialCharsAndNumbers(decodedAmount);
        logger.info(sanitizedAmount);
        responseBody.setStep3(sanitizedAmount);

        String incrementedAmount = Utils.increment(sanitizedAmount);
        logger.info(incrementedAmount);
        responseBody.setStep4(incrementedAmount);

        incrementedAmount = incrementedAmount.toUpperCase();
        responseBody.setStep5(incrementedAmount);

        int amount = RomanNumberUtils.toNumber(incrementedAmount);
        logger.info(String.valueOf(amount));
        responseBody.setStep6(String.valueOf(amount));

        String romanNumber = RomanNumberUtils.toRoman(amount);
        logger.info(romanNumber);
        responseBody.setStep7(romanNumber);

        return responseBody;
    }
}
