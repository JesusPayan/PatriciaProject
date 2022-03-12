package com.wvhotels.exceptions;

public class RoomNotFoundException extends RuntimeException{
    private Long id;
    private String message;
    public RoomNotFoundException(Long id){
        this.id = id;
        this.message = "El cuarto con el Id "+ id + "No Exite";
    }
}
