package com.df.ceftFileUpload.controller;

import com.df.ceftFileUpload.dto.FDataDTO;
import com.df.ceftFileUpload.service.FDataService_bkp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("controller/v1/data")
public class FDataController {

    @Autowired
    private FDataService_bkp FDataService1;

    @PostMapping(path = "/fileUpload")
    public String saveData(@RequestBody FDataDTO dto){
        return dto.toString();
    }

//    @PostMapping(path = "/fileUpload")
//    public String saveData(@RequestBody FDataDTO dto){
//        return FDataService.saveData(dto);
//    }



//    @GetMapping(path = "/admin/member",
//            produces = {
//                    MediaType.APPLICATION_JSON_VALUE,
//                    MediaType.APPLICATION_XML_VALUE,
//            }
//    )
//    public ResponseEntity<StandardResponseEntity> getDoctor(@RequestParam(required = true) String id){
//        FDataDTO dto = FDataService.getData(id);
//        if(dto != null){
//            return new ResponseEntity<StandardResponseEntity>(
//                    new StandardResponseEntity(200, "Success!", dto)
//                    , HttpStatus.OK);
//        }else {
//            return new ResponseEntity<StandardResponseEntity>(
//                    new StandardResponseEntity(404, "Success!", null)
//                    , HttpStatus.NOT_FOUND);
//        }
//    }

//    @GetMapping(path = "/admin/member/list")
//    public ArrayList<FDataDTO> getAllDoctor(){
//        return FDataService.loadAllDatas();
//    }
}
