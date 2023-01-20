package com.aceleracao.crudlovers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracao.crudlovers.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
