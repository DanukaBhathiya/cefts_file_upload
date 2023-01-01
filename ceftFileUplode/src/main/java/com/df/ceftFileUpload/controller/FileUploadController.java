package com.df.ceftFileUpload.controller;

import com.df.ceftFileUpload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@CrossOrigin
@RestController
//@RequestMapping("controller/v1/file_upload")
public class FileUploadController {

    @Autowired
    FileUploadService fileUploadService;

    @PostMapping("/upload")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

        try {
            /** using text file only **/
            if (file.getOriginalFilename().endsWith(".txt")) {

                fileUploadService.uploadFile(file);
            }

        }catch (Exception e){
            System.out.print("not txt file" + e);
        }

//        /** using text file only **/
//        if (file.getOriginalFilename().endsWith(".txt")) {
//
//            fileUploadService.uploadFile(file);
//        }
//        System.out.print("not txt file");

    }
}
