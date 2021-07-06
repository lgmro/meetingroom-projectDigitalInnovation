package com.github.lgmro.crud.meetingroom.meetingroom.repository;

import com.github.lgmro.crud.meetingroom.meetingroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
