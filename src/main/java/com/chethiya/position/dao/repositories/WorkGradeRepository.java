package com.chethiya.position.dao.repositories;

import com.chethiya.position.model.WorkGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkGradeRepository extends JpaRepository<WorkGrade, Integer> {

    WorkGrade findByGradeCode(String gradeCode);

}
