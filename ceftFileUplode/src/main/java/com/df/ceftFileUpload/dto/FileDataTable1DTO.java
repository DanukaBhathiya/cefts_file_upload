package com.df.ceftFileUpload.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

//custom.cefts_data_upload
public class FileDataTable1DTO {
    private String recodeId;
    private String batchId;
    private String recStatus;
    private Timestamp createdDate;
    private String uuid;
    private String fromAccount;
    private String fromAccountName;
    private String toAccount;
    private String toAccountName;
    private long amount;
    private String narration;
    private String destinationBankCode;
    private String destinationBranchCode;
}
