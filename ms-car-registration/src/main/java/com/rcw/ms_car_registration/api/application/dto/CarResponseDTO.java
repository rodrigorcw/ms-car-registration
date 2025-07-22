package com.rcw.ms_car_registration.api.application.dto;

import com.rcw.ms_car_registration.api.domain.model.CarStatus;

import java.time.LocalDate;
import java.util.Date;

public record CarResponseDTO(
        Long id,
        String make,
        String name,
        String fuelType,
        String bodyType,
        Integer doors,
        Double mileage,
        String transmission,
        Integer seats,
        String colour,
        Float engine,
        LocalDate nctExpire,
        Integer totalOwners,
        String registrationPlate,
        Double price,
        CarStatus status) {
}
