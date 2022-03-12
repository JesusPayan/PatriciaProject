package com.wvhotels.repository;

import com.wvhotels.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {

    @Query(value = "SELECT * FROM room WHERE VACANCY = TRUE", nativeQuery= true)
    public List<Room>findByVacancy();
    @Query(value = "SELECT * FROM room WHERE VACANCY = false", nativeQuery= true)
    public List<Room>noVacancy();
}
