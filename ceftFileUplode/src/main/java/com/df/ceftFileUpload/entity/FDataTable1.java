package com.df.ceftFileUpload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FDataTable1 {

    @Id
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
