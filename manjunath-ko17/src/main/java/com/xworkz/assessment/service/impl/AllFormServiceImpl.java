package com.xworkz.assessment.service.impl;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.repo.AllFormRepo;
import com.xworkz.assessment.repo.impl.AllFormRepoImpl;
import com.xworkz.assessment.service.AllFormService;

public class AllFormServiceImpl implements AllFormService {
    AllFormRepo repo = new AllFormRepoImpl();

    @Override
    public FormDto[] getAllForm() {
        return repo.fetchAllForm();
    }
}
