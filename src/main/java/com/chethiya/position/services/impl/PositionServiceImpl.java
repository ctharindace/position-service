package com.chethiya.position.services.impl;

import com.chethiya.position.dao.repositories.PositionRepository;
import com.chethiya.position.dao.repositories.TypeOfWorkRepository;
import com.chethiya.position.dto.PositionDTO;
import com.chethiya.position.model.Position;
import com.chethiya.position.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private TypeOfWorkRepository typeOfWorkRepository;

    @Override
    public PositionDTO saveEntity(PositionDTO positionDTO) {
        Position position = positionRepository.save(getPosition(positionDTO, new Position()));
        return getPositionDTO(positionRepository.save(position));
    }

    @Override
    public PositionDTO getEntity(String refId) {
        return getPositionDTO(positionRepository.getPositionByReferenceId(refId));
    }

    @Override
    public PositionDTO updateEntity(PositionDTO positionDTO) {
        Position existingPosition = positionRepository.getPositionByReferenceId(positionDTO.getReferenceId());
        Position position = positionRepository.save(getPosition(positionDTO, existingPosition));
        return getPositionDTO(positionRepository.save(position));
    }

    private PositionDTO getPositionDTO(Position position) {
        PositionDTO positionDTO = new PositionDTO();
        positionDTO.setPositionName(position.getPositionName());
        positionDTO.setReferenceId(position.getReferenceId());
        positionDTO.setMonthlySalary(position.getMonthlySalary());
        positionDTO.setTypeOfWorkCode(position.getTypeOfWork().getWorkTypeCode());
        positionDTO.setStartDate(position.getStartDate());
        positionDTO.setEndDate(position.getEndDate());
        return positionDTO;
    }

    private Position getPosition(PositionDTO positionDTO, Position position) {
        position.setPositionName(positionDTO.getPositionName());
        position.setReferenceId(positionDTO.getReferenceId());
        position.setMonthlySalary(positionDTO.getMonthlySalary());
        position.setTypeOfWork(typeOfWorkRepository.findByWorkTypeCode(positionDTO.getTypeOfWorkCode()));
        position.setStartDate(positionDTO.getStartDate());
        position.setEndDate(positionDTO.getEndDate());
        return position;
    }
}
