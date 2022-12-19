package com.df.ceftFileUpload.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

@Service
public class FileUploadService {
    public void uploadFile(MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename();
        /** rename the file name **/
        String renameFileName = "ceft-" + fileName;

        /** save new file location **/
        file.transferTo(new File("C:\\upload\\"+renameFileName));
//        file.transferTo(new File("C:\\upload\\"+fileName));
    }
}
