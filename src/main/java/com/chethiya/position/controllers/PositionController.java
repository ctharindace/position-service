package com.chethiya.position.controllers;

import com.chethiya.position.dto.PositionDTO;
import com.chethiya.position.services.CommonService;
import com.chethiya.position.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("position")
public class PositionController extends CommonController<PositionDTO, String> {

    @Autowired
    private PositionService positionService;


    @Override
    CommonService<PositionDTO, String> getService() {
        return this.positionService;
    }
}
