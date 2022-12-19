package com.df.ceftFileUpload.service;

import com.df.ceftFileUpload.dto.FDataTable1DTO;
import com.df.ceftFileUpload.entity.FDataTable1;
import com.df.ceftFileUpload.repo.FDataTable1Repo;

public class FDataTable1Service {

    FDataTable1Repo fDataTable1Repo;

    ModelMapper modelMapper

    public FDataTable1DTO getFDataTable1ByDate(String date){
        FDataTable1 fDataTable1 = fDataTable1Repo.getFDataTable1ByDate(date);
        return modelMapper
    }

}
