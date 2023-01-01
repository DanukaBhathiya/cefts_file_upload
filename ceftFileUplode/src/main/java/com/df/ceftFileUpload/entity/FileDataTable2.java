package com.df.ceftFileUpload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cefts_txn_details", schema = "custom")
@Entity

//custom.cefts_txn_details
public class FileDataTable2 {

    @Id
    @Column(name = "txn_id")
    private String txnId;
    @Column(name = "initiating_sol_id")
    private String initiatingSolId;
    @Column(name = "channel_id")
    private String channelId;
    @Column(name = "txn_type")
    private String txnType;
    @Column(name = "from_bank_code")
    private String fromBankCode;
    @Column(name = "from_acc_number")
    private BigDecimal fromAccNumber;
    @Column(name = "receiver_bank_code")
    private String receiverBankCode;
    @Column(name = "receiver_acc_number")
    private String receiverAccNumber;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "txn_date")
    private LocalDate txnDate;
    @Column(name = "chrg_event_id")
    private String chrgEventId;
    @Column(name = "chrg_amount")
    private BigInteger chrgAmount;
    @Column(name = "receiver_name")
    private String receiverName;
    @Column(name = "receiver_id")
    private String receiverId;
    @Column(name = "receiver_address")
    private String receiverAddress;
    @Column(name = "purpose")
    private String purpose;
    @Column(name = "rec_status")
    private String recStatus;
    @Column(name = "fin_result_code")
    private String finResultCode;
    @Column(name = "fin_txn_id")
    private String finTxnId;
    @Column(name = "ps_result_code")
    private String psResultCode;
    @Column(name = "fin_rev_txn_id")
    private String finRevTxnId;
    @Column(name = "entered_user")
    private String enteredUser;
    @Column(name = "entered_date")
    private Timestamp enteredDate;
    @Column(name = "auth_rej_user")
    private String authRejUser;
    @Column(name = "auth_rej_date")
    private Timestamp authRejDate;
    @Column(name = "checksum")
    private String checksum;
    @Column(name = "remarks1")
    private String remarks1;
    @Column(name = "remarks2")
    private String remarks2;
    @Column(name = "remarks3")
    private String remarks3;
}
