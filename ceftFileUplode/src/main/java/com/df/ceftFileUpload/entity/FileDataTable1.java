package com.df.ceftFileUpload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cefts_data_upload", schema = "custom")
@Entity

//custom.cefts_data_upload
public class FileDataTable1 {

    @Id
    @Column(name = "recode_id")
    private String recodeId;
    @Column(name = "batch_id")
    private String batchId;
    @Column(name = "rec_status")
    private String recStatus;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "from_account")
    private String fromAccount;
    @Column(name = "from_account_name")
    private String fromAccountName;
    @Column(name = "to_account")
    private String toAccount;
    @Column(name = "to_account_name")
    private String toAccountName;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "narration")
    private String narration;
    @Column(name = "destination_bank_code")
    private String destinationBankCode;
    @Column(name = "destination_branch_code")
    private String destinationBranchCode;
}
