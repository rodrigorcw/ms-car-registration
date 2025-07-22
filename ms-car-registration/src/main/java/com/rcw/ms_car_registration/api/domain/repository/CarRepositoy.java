package com.rcw.ms_car_registration.api.domain.repository;

import com.rcw.ms_car_registration.api.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepositoy extends JpaRepository<Car,Long> {
}
