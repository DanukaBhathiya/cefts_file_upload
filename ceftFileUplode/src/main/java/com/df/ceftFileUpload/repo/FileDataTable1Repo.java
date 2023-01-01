package com.df.ceftFileUpload.repo;

import com.df.ceftFileUpload.entity.FileDataTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Optional;

@Repository
public interface FileDataTable1Repo extends JpaRepository<FileDataTable1,String> {


    long countByCreatedDateIsGreaterThanEqual(Timestamp date);



//    long countByCreatedDateAndRecStatus(Timestamp date, String recStatus);
    long countByCreatedDateAndRecStatusIsGreaterThanEqual(Timestamp date, String recStatus);

    @Override
    Optional<FileDataTable1> findById(String s);
}



//    select count(*) from custom.cefts_data_upload where created_date > '2022-11-13';
//    select count(*) from custom.cefts_data_upload where created_date > '2022-12-11 13:01:00'and rec_status = 'R';
//    select * from custom.cefts_txn_details ctd where entered_date > '2022-11-26 17:15:00' and entered_user = 'SYSTEM' order by entered_date desc;
//