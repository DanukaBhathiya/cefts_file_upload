package com.df.ceftFileUpload.controller;

import com.df.ceftFileUpload.Response.CommonResponse;
import com.df.ceftFileUpload.dto.FileDataTable1DTO;
import com.df.ceftFileUpload.dto.FileDataTable2DTO;
import com.df.ceftFileUpload.entity.FileDataTable2;
import com.df.ceftFileUpload.service.FileDataTable1Service;
import com.df.ceftFileUpload.service.FileDataTable2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("controller/v1/data")
public class FileDataController {

    @Autowired
    private FileDataTable1Service fileDataTable1Service;

    @Autowired
    private FileDataTable2Service fileDataTable2Service;


//    @GetMapping(path = "/getFDataTable1ByDate/{date}")
    @GetMapping(path = "/getData/date/{date}")
    public ResponseEntity<?> getFileDataTableByDate(@PathVariable String date){
        long result =fileDataTable1Service.getFileDataTable1ByDate(date);
        return ResponseEntity.ok(new CommonResponse<Long>(true,null,null,result));
    }

//    @GetMapping(path = "/getFDataTable1ByDate/{date}")
    @GetMapping(path = "/getData/date-status/{date}")
    public ResponseEntity<?>  getFileDataTable1ByDateAndResStatus(@PathVariable String date){
        long result =fileDataTable1Service.getFileDataTable1ByDateAndResStatus(date);
        return ResponseEntity.ok(new CommonResponse<Long>(true,null,null,result));
    }
//    @GetMapping(path = "/getFDataTable2ByDate/{date}")
//    @GetMapping(path = "/getData/date-User/{date}")
//    public List<FileDataTable2> getFileDataTable2ByEnteredDateAndEnteredUser(@PathVariable String date){
//        return fileDataTable2Service.getFileDataTable2ByEnteredDateAndEnteredUser(date);
//    }

    @GetMapping(path = "/getData/date-User/{date}")
    public ResponseEntity<?> getFileDataTable2ByEnteredDateAndEnteredUser(@PathVariable String date){
        List result = fileDataTable2Service.getFileDataTable2ByEnteredDateAndEnteredUser(date);
        return ResponseEntity.ok(new CommonResponse<List<FileDataTable2>>(true,null,null,result));
    }
}
