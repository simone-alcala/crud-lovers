package com.aceleracao.crudlovers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceleracao.crudlovers.dto.CarDTO;
import com.aceleracao.crudlovers.model.Car;
import com.aceleracao.crudlovers.repository.CarRepository;

@Service
public class CarService {
  
  @Autowired
  private CarRepository repository;

  public Car save(CarDTO dto) {
    return repository.save(new Car(dto));
  }

  public List<Car> findAll() {
    return repository.findAll();
  }

  public Optional<Car> findById(Long id) {
    return repository.findById(id);
  }

  public void update(Long id, CarDTO dto) {
    repository.findById(id).map(car -> {
      car.setAnoModelo(dto.anoModelo());
      car.setDataFabricacao(dto.dataFabricacao());
      car.setModelo(dto.modelo());
      car.setValor(dto.valor());     
      return repository.save(car);
    });
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }

}
