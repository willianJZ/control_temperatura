package com.petShop.persistence.service;

import com.petShop.persistence.TemperatureReadingRepository;
import com.petShop.persistence.entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemperatureReadingService {

    @Autowired
    private TemperatureReadingRepository temperatureReadingRepository;

    // Obtener todos los registros de lecturas de temperatura
    public List<TemperatureReading> getAll() {
        return (List<TemperatureReading>) temperatureReadingRepository.getAll();
    }

    // Obtener una lectura de temperatura por ID
    public Optional<TemperatureReading> getById(int id) {
        return temperatureReadingRepository.getById(id);
    }

    // Guardar o actualizar una lectura de temperatura
    public TemperatureReading save(TemperatureReading temperatureReading) {
        return temperatureReadingRepository.save(temperatureReading);
    }


    // Buscar lecturas de temperatura por valor
    public List<TemperatureReading> findByTemperature(String temperature) {
        return temperatureReadingRepository.findByTemperature(temperature);
    }
}
