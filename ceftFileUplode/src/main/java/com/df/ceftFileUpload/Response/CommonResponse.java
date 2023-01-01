package com.df.ceftFileUpload.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {
    private Boolean isSuccess;
    private String  errorMessage;
    private String successMessage;
    private T dataBundle;



}
