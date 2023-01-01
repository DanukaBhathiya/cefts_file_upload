package com.df.ceftFileUpload.service;

import com.df.ceftFileUpload.dto.FileDataTable1DTO;
import com.df.ceftFileUpload.dto.FileDataTable2DTO;
import com.df.ceftFileUpload.entity.FileDataTable1;
import com.df.ceftFileUpload.entity.FileDataTable2;
import com.df.ceftFileUpload.repo.FileDataTable1Repo;
import com.df.ceftFileUpload.repo.FileDataTable2Repo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class FileDataTable1Service {
    @Autowired
    private FileDataTable1Repo fileDataTable1Repo;

    public long getFileDataTable1ByDate(String date) {
        long countByCreatedDate = fileDataTable1Repo.countByCreatedDateIsGreaterThanEqual(Timestamp.valueOf(date));
        return countByCreatedDate;
    }
//       Optional<FileDataTable1>  ft1 =fileDataTable1Repo.findById("dfdf");
//       FileDataTable1 ft =null;
//       if(ft1.isPresent()){
//          ft = ft1.get();
//       }else{
//           return  null;
//       }


    public long getFileDataTable1ByDateAndResStatus(String date) {
        String resStatus = "R";
        long countByCreatedDateAndRecStatus = fileDataTable1Repo.countByCreatedDateAndRecStatusIsGreaterThanEqual(Timestamp.valueOf(date), resStatus);
        return countByCreatedDateAndRecStatus;
    }
}
