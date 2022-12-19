package com.df.ceftFileUpload.service.impl;

//@Service
//public class FDataServiceIMPL implements FDataService_bkp {
//    @Autowired
//    private FDataRepo fdataRepo;
//
//    @Override
//    public String saveData(FDataDTO dto) {
//        FData fdata= new FData(
//                dto.getId(),dto.getFromAccount(),dto.getFromAccountName(),dto.getToAccount(),dto.getToAccountName(),dto.getTxnAmount(),dto.getOrgBankCode(),dto.getDestBankCode(),dto.getDestBranchCode()
//        );
////        return fdataRepo.save(fdata).getId()+" - Saved!";
//        return dto+" - Saved!";
//    }
//}


//    @Override
//    public String saveData(FDataDTO dto) {
//        FData fdata= new FData(
//                dto.getId(),dto.getFromAccount(),dto.getFromAccountName(),dto.getToAccount(),dto.getToAccountName(),dto.getTxnAmount(),dto.getOrgBankCode(),dto.getDestBankCode(),dto.getDestBranchCode()
//        );
//        return fdataRepo.save(fdata).getId()+" - Saved!";
//    }

//    @Override
//    public FDataDTO getDoctor(String id) {
//        Optional tempData = fdataRepo.findById(id);
//        if (tempData.isPresent()){
//            FData d = (FData) tempData.get();
//            return  new FDataDTO(d.getDoctor_id(), d.getDoctor_name(), d.getDoctor_address(), d.getDoctor_mNumber(), d.getDoctor_email());
//        }
//        return null;
//    }

//    @Override
//    public ArrayList<FDataDTO> loadAllDoctors() {
//        ArrayList<FDataDTO> dtoList = new ArrayList<>();
//        fdataRepo.findAll().forEach(e -> {
//            dtoList.add(
//                    new FDataDTO(e.getDoctor_id(), e.getDoctor_name(), e.getDoctor_address(), e.getDoctor_mNumber(), e.getDoctor_email());
//        });
//        return dtoList;
//    }

//    @Override
//    public String updateDoctor(FDataDTO dto) {
//        Optional<Doctor> byId = doctorRepo.findById(dto.getDoctor_id());
//        if (byId.isPresent()){
//            Doctor doctor = byId.get();
//            doctor.setDoctor_name(dto.getDoctor_name());
//            doctor.setDoctor_address(dto.getDoctor_address());
//            doctor.setDoctor_mNumber(dto.getDoctor_mNumber());
//            doctor.setDoctor_email(dto.getDoctor_email());
//            return  doctorRepo.save(doctor).getDoctor_id()+" - Updated!";
//        }else {
//            return "Empty Result";
//        }
//    }
//}
