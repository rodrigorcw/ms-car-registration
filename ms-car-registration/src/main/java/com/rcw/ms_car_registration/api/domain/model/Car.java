package com.rcw.ms_car_registration.api.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Tb_car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String name;
    private String fuelType;
    private String bodyType;
    private int doors;
    private Double mileage;
    private String transmission;
    private int seats;
    private String colour;
    private Float engine;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate nctExpire;

    private int totalOwners;
    @Column(unique = true)
    private String registrationPlate;
    private Double price;
    private CarStatus status;

    public Car() {
    }

    public Car(String make, String name, String fuelType, String bodyType, int doors, Double mileage, String transmission, int seats, String colour, Float engine, LocalDate nctExpire, int totalOwners, String registrationPlate, Double price, CarStatus status) {

        this.make = make;
        this.name = name;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.doors = doors;
        this.mileage = mileage;
        this.transmission = transmission;
        this.seats = seats;
        this.colour = colour;
        this.engine = engine;
        this.nctExpire = nctExpire;
        this.totalOwners = totalOwners;
        this.registrationPlate = registrationPlate;
        this.price = price;
        this.status = status;
    }

}
