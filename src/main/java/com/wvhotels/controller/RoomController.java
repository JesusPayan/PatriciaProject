package com.wvhotels.controller;

import com.wvhotels.exceptions.RoomNotFoundException;
import com.wvhotels.entity.Room;
import com.wvhotels.repository.RoomRepository;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController/*INDICA A SPRING QUE ESTA CLASE MAPPEARA LOS REST REQUEST*/
@RequestMapping("/room")
@EnableSwagger2
public class RoomController {

    private final RoomRepository roomRepository;


    RoomController(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    //GET CONSULTA
   @ApiOperation(value = "Muestra todos los cuartos")
    @GetMapping(value = "/all")/*INDICA EL REQUEST QUE SE EJECUTARA EN ESTE CASO ES CONSEGUIR TODOS LOS CUARTOS
    */
    List<Room> findAllRooms(){
        return roomRepository.findAll();
    }
    @ApiOperation(value = "Crea un nuevo Cuarto")
    @PostMapping(value = "/create")
    Room newRoom(@RequestBody Room newRoom){
        return roomRepository.save(newRoom);
    }
    @ApiOperation(value = "Cuenta los Cuartos")
    @GetMapping(value = "/count")
    Long countRooms(){
        return roomRepository.count();
    }
    @ApiOperation(value="Elimina un Cuarto")
    @DeleteMapping(value = "/delete/{id}")
    void deleteRoom(@PathVariable Long id){
        roomRepository.deleteById(id);
    }
    @ApiOperation(value="Muestra el detalles del cuarto por id")
    @GetMapping("/{id}")
    Room RoomDetails(@PathVariable Long id){

        return roomRepository.findById(id).orElseThrow(() -> new RoomNotFoundException(id));
    }
    @ApiOperation(value = "Muestra por vacancia")
    @GetMapping(value = "/available")
    List<Room> findByVacancy(){
        return roomRepository.findByVacancy();
    }
    @ApiOperation(value = "Muestra por vacancia")
    @GetMapping(value = "/not-available")
    List<Room> noVacancy(){
        return roomRepository.findByVacancy();
    }




}
