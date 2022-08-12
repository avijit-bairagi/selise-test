package com.avijit.app.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountValidateRequestBody implements Serializable {

    private String requestId;

    private String accountName;

    private String amount;
}
