package com.rcw.ms_car_registration.api.domain.service;

import com.rcw.ms_car_registration.api.application.dto.CarRequestDTO;
import com.rcw.ms_car_registration.api.application.dto.CarResponseDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarResponseDTO> findAll();

    Optional<CarResponseDTO> findById(Long id);

    CarResponseDTO createCar(Car car);

    CarResponseDTO updateCar(Long id, Car carDetails);

    void deleteById(Long id);

}
