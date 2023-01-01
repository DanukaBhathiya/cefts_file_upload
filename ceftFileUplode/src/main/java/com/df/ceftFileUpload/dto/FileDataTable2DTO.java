package com.df.ceftFileUpload.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class FileDataTable2DTO {

    private String txnId;
    private String initiatingSolId;
    private String channelId;
    private String txnType;
    private String fromBankCode;
    private BigDecimal fromAccNumber;
    private String receiverBankCode;
    private String receiverAccNumber;
    private BigDecimal amount;
    private String txnDate;
    private String chrgEventId;
    private BigInteger chrgAmount;
    private String receiverName;
    private String receiverId;
    private String receiverAddress;
    private String purpose;
    private String recStatus;
    private String finResultCode;
    private String finTxnId;
    private String psResultCode;
    private String finRevTxnId;
    private String enteredUser;
    private Timestamp enteredDate;
    private String authRejUser;
    private Timestamp authRejDate;
    private String checksum;
    private String remarks1;
    private String remarks2;
    private String remarks3;
}
