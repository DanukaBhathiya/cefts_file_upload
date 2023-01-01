package com.df.ceftFileUpload.service;

import com.df.ceftFileUpload.dto.FileDataTable1DTO;
import com.df.ceftFileUpload.dto.FileDataTable2DTO;
import com.df.ceftFileUpload.entity.FileDataTable2;
import com.df.ceftFileUpload.repo.FileDataTable2Repo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Service
//@Transactional
public class FileDataTable2Service {

    @Autowired
    private FileDataTable2Repo fileDataTable2Repo;


//    ModelMapper modelMapper;

    public List<FileDataTable2> getFileDataTable2ByEnteredDateAndEnteredUser(String date){
        String enteredUser = "SYSTEM";
        List<FileDataTable2> fileDataTable2 = fileDataTable2Repo.findFileDataTable2sByEnteredDateGreaterThanEqualAndEnteredUser(Timestamp.valueOf(date), enteredUser);
//        System.out.println(fileDataTable2);
        return fileDataTable2;
    //    return modelMapper.map(fileDataTable2, FileDataTable2DTO.class);
    }
}
