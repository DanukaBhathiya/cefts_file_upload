package com.df.ceftFileUpload.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.math.BigDecimal;

//@Entity(name = "FileData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FData {
//    @Id
//    private String Id;
//    private String fromAccount;
//    private String fromAccountName;
//    private String toAccount;
//    private String toAccountName;
//    private BigDecimal txnAmount;
//    private String orgBankCode;
//    private String destBankCode;
//    private String destBranchCode;


    @Id
    private String txn_id;
    private String initiating_sol_id;
    private String channel_id;
    private String txn_type;
    private String from_bank_code;
    private BigDecimal from_acc_number;
    private String receiver_bank_code;
    private String receiver_acc_number;
    private String amount;
    private String txn_date;
    private String chrg_event_id;
    private String chrg_amount;
    private String receiver_name;
    private String receiver_id;
    private String receiver_address;
    private String purpose;
    private String rec_status;
    private String fin_result_code;
    private String fin_txn_id;
    private String ps_result_code;
    private String fin_rev_txn_id;
    private String entered_user;
    private String entered_date;
    private String auth_rej_user;
    private String auth_rej_date;
    private String checksum;
    private String remarks1;
    private String remarks2;
    private String remarks3;
}
