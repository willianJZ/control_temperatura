package com.petShop.web.controller;

import com.petShop.persistence.entity.TemperatureReading;
import com.petShop.persistence.service.TemperatureReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/temperaturereading")
public class TemperatureReadingController {

    @Autowired
    private TemperatureReadingService temperatureReadingService;

    // Obtener todos los registros de lecturas de temperatura
    @GetMapping
    public List<TemperatureReading> getAll() {
        return temperatureReadingService.getAll();
    }

    // Obtener una lectura de temperatura por ID
    @GetMapping("/{id}")
    public ResponseEntity<TemperatureReading> getById(@PathVariable("id") int id) {
        Optional<TemperatureReading> temperatureReading = temperatureReadingService.getById(id);
        return temperatureReading.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Guardar o actualizar una lectura de temperatura
    @PostMapping("/save")
    public ResponseEntity<TemperatureReading> save(@RequestBody TemperatureReading temperatureReading) {
        TemperatureReading savedReading = temperatureReadingService.save(temperatureReading);
        return new ResponseEntity<>(savedReading, HttpStatus.CREATED);
    }


    // Buscar lecturas de temperatura por valor
    @GetMapping("/temperature/{temperature}")
    public List<TemperatureReading> findByTemperature(@PathVariable("temperature") String temperature) {
        return temperatureReadingService.findByTemperature(temperature);
    }
}
