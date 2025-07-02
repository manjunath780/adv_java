package com.xworkz.assessment.repo;

import com.xworkz.assessment.dto.FormDto;

public interface FormRepo {
    boolean saveForm(FormDto dto);
}
