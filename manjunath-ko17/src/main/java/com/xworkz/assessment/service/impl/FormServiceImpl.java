package com.xworkz.assessment.service.impl;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.repo.FormRepo;
import com.xworkz.assessment.repo.impl.FormRepoImpl;
import com.xworkz.assessment.service.FormService;

public class FormServiceImpl  implements FormService {
    FormRepo repo = new FormRepoImpl();
    @Override
    public boolean validateForm(FormDto dto) {

        return repo.saveForm(dto);
    }
}
