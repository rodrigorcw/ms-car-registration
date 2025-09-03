package com.rcw.ms_car_registration.api.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Tb_car")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    


    public Car(String make, String name, String s, String s1, Integer doors, Double mileage, String transmission, Integer seats, String colour, Float engine, LocalDate localDate, Integer integer, String s2, Double price, CarStatus status) {
    }
}
