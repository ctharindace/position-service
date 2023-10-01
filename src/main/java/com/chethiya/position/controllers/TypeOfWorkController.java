package com.chethiya.position.controllers;

import com.chethiya.position.dto.TypeOfWorkDTO;
import com.chethiya.position.services.CommonService;
import com.chethiya.position.services.TypeOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("typeOfWork")
public class TypeOfWorkController extends CommonController<TypeOfWorkDTO, String> {

    @Autowired
    private TypeOfWorkService typeOfWorkService;

    @Override
    CommonService<TypeOfWorkDTO, String> getService() {
        return this.typeOfWorkService;
    }
}
