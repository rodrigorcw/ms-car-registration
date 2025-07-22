package com.rcw.ms_car_registration.api.application.service;

import com.rcw.ms_car_registration.api.adapter.ToResponseDto;
import com.rcw.ms_car_registration.api.application.dto.CarResponseDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;
import com.rcw.ms_car_registration.api.domain.repository.CarRepositoy;
import com.rcw.ms_car_registration.api.domain.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepositoy carRepositoy;


    @Override
    public List<CarResponseDTO> findAll() {
        List<CarResponseDTO> listCars = carRepositoy.findAll()
                .stream()
                .map(ToResponseDto::toResponseDto)
                .toList();
        return listCars;
    }

    @Override
    public Optional<CarResponseDTO> findById(Long id) {
        return carRepositoy.findById(id)
                .map(ToResponseDto::toResponseDto);
//        var carById = carRepositoy.findById(id).orElseThrow(() -> new NoSuchElementException("Car not exists"));
//        return ToResponseDto.toResponseDto(carById);
    }


    @Override
    public CarResponseDTO createCar(Car car) {
        return ToResponseDto.toResponseDto(carRepositoy.save(car));
    }

    public CarResponseDTO updateCar(Long id, Car carDetails) {
        Car car = carRepositoy.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Car not found with ID: " + id));

        car.setMake(carDetails.getMake());
        car.setName(carDetails.getName());
        car.setFuelType(carDetails.getFuelType());
        car.setBodyType(carDetails.getBodyType());
        car.setDoors(carDetails.getDoors());
        car.setMileage(carDetails.getMileage());
        car.setTransmission(carDetails.getTransmission());
        car.setSeats(carDetails.getSeats());
        car.setColour(carDetails.getColour());
        car.setEngine(carDetails.getEngine());
        car.setNctExpire(carDetails.getNctExpire());
        car.setTotalOwners(carDetails.getTotalOwners());
        car.setRegistrationPlate(carDetails.getRegistrationPlate());
        car.setPrice(carDetails.getPrice());
        car.setStatus(carDetails.getStatus());

        Car updatedCar = carRepositoy.save(car);
        return ToResponseDto.toResponseDto(updatedCar);

    }

    @Override
    public void deleteById(Long id) {
        if (!carRepositoy.existsById(id)) {
            throw new NoSuchElementException("ID CAR " + id + " no exist.");
        }
        carRepositoy.deleteById(id);
    }

}

