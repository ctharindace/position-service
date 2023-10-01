package com.chethiya.position.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PositionDTO {

    private String referenceId;

    private String positionName;

    private String typeOfWork;

    private BigDecimal monthlySalary;

    private Date startDate;

    private Date endDate;

}
