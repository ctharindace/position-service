package com.chethiya.position.controllers;

import com.chethiya.position.dto.WorkGradeDTO;
import com.chethiya.position.services.CommonService;
import com.chethiya.position.services.WorkGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("workGrade")
public class WorkGradeController extends CommonController<WorkGradeDTO, String> {

    @Autowired
    private WorkGradeService workGradeService;

    @Override
    CommonService<WorkGradeDTO, String> getService() {
        return this.workGradeService;
    }
}
