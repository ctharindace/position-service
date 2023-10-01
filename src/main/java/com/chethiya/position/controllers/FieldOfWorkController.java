package com.chethiya.position.controllers;

import com.chethiya.position.dto.FieldOfWorkDTO;
import com.chethiya.position.services.CommonService;
import com.chethiya.position.services.FieldOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fieldOfWork")
public class FieldOfWorkController extends CommonController<FieldOfWorkDTO, String>{

    @Autowired
    private FieldOfWorkService fieldOfWorkService;

    @Override
    CommonService<FieldOfWorkDTO, String> getService() {
        return this.fieldOfWorkService;
    }
}
