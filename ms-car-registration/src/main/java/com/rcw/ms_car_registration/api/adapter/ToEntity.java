package com.rcw.ms_car_registration.api.adapter;

import com.rcw.ms_car_registration.api.application.dto.CarRequestDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;

public class ToEntity {


    public static Car toEntity(CarRequestDTO dto) {

        return new Car(
                dto.id(),
                dto.make(),
                dto.name(),
                dto.fuelType(),
                dto.bodyType(),
                dto.doors(),
                dto.mileage(),
                dto.transmission(),
                dto.seats(),
                dto.colour(),
                dto.engine(),
                dto.nctExpire(),
                dto.totalOwners(),
                dto.registrationPlate(),
                dto.price(),
                dto.status()
        );
    }

}
