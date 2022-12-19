package com.df.ceftFileUpload.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class FDataTable1DTO {
    private String recode_id;
    private String batch_id;
    private String rec_status;
    private String created_date;
    private String uuid;
    private String from_account;
    private String from_account_name;
    private String to_account;
    private String to_account_name;
    private String amount;
    private String narration;
    private String destination_bank_code;
    private String destination_branch_code;
}
