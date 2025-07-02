package com.xworkz.marketapp.service.impl;

import com.xworkz.marketapp.dto.CostomerDto;
import com.xworkz.marketapp.repo.Impl.MarketRepoImpl;
import com.xworkz.marketapp.repo.MarketRepo;
import com.xworkz.marketapp.service.MarketService;

public class MarketServiceImpl implements MarketService {


    MarketRepo marketRepo;

   public MarketServiceImpl(){
       marketRepo = new MarketRepoImpl();
    }

    @Override
    public boolean validateCostomer(CostomerDto dto) {


        boolean customerSaved = false;

        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPincodeValid = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isFullNameValid = true;
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty() && dto.getEmail().contains("@")) {
            isEmailValid = true;
        }

        if (dto.getPhoneNumber() != null && dto.getPhoneNumber().matches("\\d{10}")) {
            isPhoneValid = true;
        }

        if (dto.getPincode() != null && dto.getPincode().matches("\\d{6}")) {
            isPincodeValid = true;
        }

        if (isFullNameValid && isEmailValid && isPhoneValid && isPincodeValid) {


           customerSaved = marketRepo.saveCostomer(dto);
        }

        return customerSaved;
    }
}
