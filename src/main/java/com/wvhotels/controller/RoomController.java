package com.wvhotels.controller;

import com.wvhotels.entity.Room;
import com.wvhotels.repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController/*INDICA A SPRING QUE ESTA CLASE MAPPEARA LOS REST REQUEST*/
public class RoomController {

    RoomRepository roomRepository;

    RoomController(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    //GET CONSULTA
    @GetMapping("/rooms")/*INDICA EL REQUEST QUE SE EJECUTARA EN ESTE CASO ES CONSEGUIR TODOS LOS CUARTOS
    */
    List<Room> findAllRooms(){
        return roomRepository.findAll();
    }

    @PostMapping("/create-room")
    Room newRoom(@RequestBody Room newRoom){
        return roomRepository.save(newRoom);
    }
    @GetMapping("/room/count")
    Long countRooms(){
        return roomRepository.count();
    }
    @DeleteMapping("/room-delete/{id}")
    void deleteRoom(@PathVariable Long id){
        roomRepository.deleteById(id);
    }




}
