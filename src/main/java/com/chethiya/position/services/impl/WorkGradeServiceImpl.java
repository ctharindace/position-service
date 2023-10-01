package com.chethiya.position.services.impl;

import com.chethiya.position.dao.repositories.WorkGradeRepository;
import com.chethiya.position.dto.WorkGradeDTO;
import com.chethiya.position.model.WorkGrade;
import com.chethiya.position.services.WorkGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkGradeServiceImpl implements WorkGradeService {

    @Autowired
    private WorkGradeRepository workGradeRepository;

    @Override
    public WorkGradeDTO saveEntity(WorkGradeDTO workGradeDTO) {
        WorkGrade maritalStatus = workGradeRepository.save(getEntity(workGradeDTO, new WorkGrade()));
        return getDto(maritalStatus);
    }

    @Override
    public WorkGradeDTO getEntity(String statusCode) {
        WorkGrade workGrade = workGradeRepository.findByGradeCode(statusCode);
        return getDto(workGrade);
    }

    @Override
    public WorkGradeDTO updateEntity(WorkGradeDTO workGradeDTO) {
        WorkGrade workGrade = workGradeRepository.findByGradeCode(workGradeDTO.getGradeCode());
        return getDto(workGradeRepository.save(getEntity(workGradeDTO, workGrade)));
    }

    private WorkGrade getEntity(WorkGradeDTO dto, WorkGrade model) {
        if (model == null) {
            model = new WorkGrade();
        }
        model.setDescription(dto.getDescription());
        model.setGradeCode(dto.getGradeCode());
        model.setName(dto.getName());
        return model;
    }

    private WorkGradeDTO getDto(WorkGrade model) {
        WorkGradeDTO dto = new WorkGradeDTO();
        dto.setDescription(model.getDescription());
        dto.setGradeCode(model.getGradeCode());
        dto.setName(model.getName());
        return dto;
    }
}
