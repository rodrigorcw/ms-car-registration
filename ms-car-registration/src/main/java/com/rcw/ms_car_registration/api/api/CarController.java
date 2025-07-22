package com.rcw.ms_car_registration.api.api;

import com.rcw.ms_car_registration.api.application.dto.CarResponseDTO;
import com.rcw.ms_car_registration.api.domain.model.Car;
import com.rcw.ms_car_registration.api.domain.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "http://localhost") // para permitir requisições do HTML
public class CarController {


    @Autowired
    private CarService carService;

    @Operation(description = "FIND ALL CARS BY THE STORE")
    @GetMapping
    public ResponseEntity<List<CarResponseDTO>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @Operation(description = "FIND CAR BY ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return Car"),
            @ApiResponse(responseCode = "400", description = "Id doesn't exist with this car"),
            @ApiResponse(responseCode = "500", description = "This car doesn't exist")
    })

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CarResponseDTO>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(carService.findById(id));
    }


    @Operation(description = "CREATING NEW CAR")
    @PostMapping
    public ResponseEntity<CarResponseDTO> createCar(@RequestBody Car car) {
        CarResponseDTO savedCar = carService.createCar(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }
    @Operation(description = "UPDATE CAR DETAILS")
    @PutMapping("/{id}")
    public ResponseEntity<CarResponseDTO> updateCar(@PathVariable Long id, @RequestBody Car carDetails) {
        CarResponseDTO updated = carService.updateCar(id, carDetails);
        return ResponseEntity.ok(updated);

    }

    @Operation(description = "DELETING CAR BY ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        carService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
