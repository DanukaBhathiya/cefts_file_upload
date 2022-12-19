package com.df.ceftFileUpload.repo;

import com.df.ceftFileUpload.entity.FData;
import com.df.ceftFileUpload.entity.FDataTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FDataTable1Repo extends JpaRepository<FDataTable1,String> {

    @Query(value = "SELECT * FROM custom.cefts_data_upload WHERE created_date > ?1 ")
    FDataTable1 getFDataTable1ByDate(String date);
}
