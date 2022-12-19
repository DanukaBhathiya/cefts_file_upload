package com.df.ceftFileUpload.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class FDataDTO {
    private String Id;
    private String fromAccount;
    private String fromAccountName;
    private String toAccount;
    private String toAccountName;
    private BigDecimal txnAmount;
    private String orgBankCode;
    private String destBankCode;
    private String destBranchCode;
}
