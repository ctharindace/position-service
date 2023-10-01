package com.chethiya.position.dao.repositories;

import com.chethiya.position.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

    Position getPositionByReferenceId(String referenceId);

}
