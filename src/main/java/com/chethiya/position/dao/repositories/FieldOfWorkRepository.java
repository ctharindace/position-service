package com.chethiya.position.dao.repositories;


import com.chethiya.position.model.FieldOfWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldOfWorkRepository extends JpaRepository<FieldOfWork, Integer> {

    FieldOfWork findByFieldCode(String fieldCode);

}
