package com.aceleracao.crudlovers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracao.crudlovers.dto.CarDTO;
import com.aceleracao.crudlovers.model.Car;
import com.aceleracao.crudlovers.service.CarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/car")
public class CarController {
  
  @Autowired
  private CarService service;

  @PostMapping
  public void create(@RequestBody @Valid CarDTO req) {
    service.save(req);
  }

  @GetMapping
  public List<Car> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Car> findById(@PathVariable("id") Long id) {
    return service.findById(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable("id") Long id, @RequestBody @Valid CarDTO req) {
    service.update(id, req);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Long id) {
    service.deleteById(id);
  }

}
