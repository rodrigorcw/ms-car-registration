package com.rcw.ms_car_registration.api.adapter;

import com.rcw.ms_car_registration.api.application.dto.CarResponseDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;

public class ToResponseDto {



    public static CarResponseDTO toResponseDto(Car entity){

        return new CarResponseDTO(
                entity.getId(),
                entity.getMake(),
                entity.getName(),
                entity.getFuelType(),
                entity.getBodyType(),
                entity.getDoors(),
                entity.getMileage(),
                entity.getTransmission(),
                entity.getSeats(),
                entity.getColour(),
                entity.getEngine(),
                entity.getNctExpire(),
                entity.getTotalOwners(),
                entity.getRegistrationPlate(),
                entity.getPrice(),
                entity.getStatus());
    }
}
