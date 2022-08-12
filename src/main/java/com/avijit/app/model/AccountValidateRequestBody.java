package com.avijit.app.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class AccountValidateRequestBody implements Serializable {

    @NotBlank
    private String requestId;

    @NotBlank
    private String accountName;

    @NotBlank
    private String amount;
}
