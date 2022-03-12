package com.wvhotels.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity /*INDICA A SPRING QUE ESTA SERA UNA REPRENSTACION DE UNA TABLA DE LA BASE DE DATOS.
*/
@Table(name = "room") /*INDICA A SPRING EL NOMBRE DE LA TABLA QUE SE HARA REFERENCIA EN LA BASE DE DATOS*/
@Data /*CON ESTA ANOTACION NO ES NECESARIO PONER GETTERS Y SETTERS*/
public class Room {

    @Id /*INDICA QUE EL ATRIBUTO O VARIABLE ES LA REPRESENTACION DEL ID DE LA TABLA*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*INDICA QUE EL ATRIBUTO SE INCREMENTARA*/
    @Column(name = "ID") /*INDICA QUE COMO LOS ATRIBUTOS O VARIABLES SE LLAMAN DIFERENTE QUE EL NOMBRE DE LA COLUMNA */
    private Long id;

    @Column(name = "ROOM_NUMBER")
    private Integer roomNumber;

    @Column(name = "ROOM_TYPE")
    private String roomType;

    @Column(name = "BEDS_NUMBER")
    private Integer bedsNumber;

    @Column(name = "VACANCY")
    private Boolean vacancy;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "ROOM_PRICE")
    private Double roomPrice;
}

