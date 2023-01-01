package com.df.ceftFileUpload.repo;

import com.df.ceftFileUpload.entity.FileDataTable1;
import com.df.ceftFileUpload.entity.FileDataTable2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository
public interface FileDataTable2Repo extends CrudRepository<FileDataTable2,String> {

//    Optional<FileDataTable2> findByEnteredDateAndEnteredUser(Timestamp date, String enteredUser);
    List<FileDataTable2> findFileDataTable2sByEnteredDateGreaterThanEqualAndEnteredUser(Timestamp date, String enteredUser);
}

//    select * from custom.cefts_txn_details ctd where entered_date > '2022-11-26 17:15:00' and entered_user = 'SYSTEM' order by entered_date desc;
//
