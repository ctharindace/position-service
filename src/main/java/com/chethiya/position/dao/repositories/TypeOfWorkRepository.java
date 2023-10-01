package com.chethiya.position.dao.repositories;


import com.chethiya.position.model.TypeOfWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfWorkRepository extends JpaRepository<TypeOfWork, Integer> {

    TypeOfWork findByWorkTypeCode(String workTypeCode);

}
