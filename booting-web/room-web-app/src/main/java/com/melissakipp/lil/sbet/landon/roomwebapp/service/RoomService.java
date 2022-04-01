package com.melissakipp.lil.sbet.landon.roomwebapp.service;

import java.util.List;

import com.melissakipp.lil.sbet.landon.roomwebapp.data.RoomRepository;
import com.melissakipp.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}