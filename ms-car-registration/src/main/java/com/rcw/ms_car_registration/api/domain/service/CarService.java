package com.rcw.ms_car_registration.api.domain.service;

import com.rcw.ms_car_registration.api.application.dto.CarResponseDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarResponseDTO> findAll();

    Optional<CarResponseDTO> findById(Long id);

    CarResponseDTO createCar(Car car);

    CarResponseDTO updateCar(Long id, Car carDetails);

    void deleteById(Long id);

}
