package com.digital.crud.saladereuniao.live5.repository;

import com.digital.crud.saladereuniao.live5.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{
}
