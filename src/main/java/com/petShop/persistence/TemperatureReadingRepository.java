package com.petShop.persistence;

import com.petShop.persistence.crud.TemperatureReadingCrudRepository;
import com.petShop.persistence.entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TemperatureReadingRepository {

    @Autowired
    private TemperatureReadingCrudRepository temperatureReadingCrudRepository;

    // Obtener todos los registros de lecturas de temperatura
    public List<TemperatureReading> getAll() {
        return (List<TemperatureReading>) temperatureReadingCrudRepository.findAll();
    }

    // Obtener una lectura de temperatura por ID
    public Optional<TemperatureReading> getById(int id) {
        return temperatureReadingCrudRepository.findById(id);
    }

    // Guardar o actualizar una lectura de temperatura
    public TemperatureReading save(TemperatureReading temperatureReading) {
        return temperatureReadingCrudRepository.save(temperatureReading);
    }

    // Eliminar una lectura de temperatura por ID
    public boolean delete(int id) {
        if (temperatureReadingCrudRepository.existsById(id)) {
            temperatureReadingCrudRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    // Buscar lecturas de temperatura por valor
    public List<TemperatureReading> findByTemperature(String temperature) {
        return temperatureReadingCrudRepository.findByTemperature(temperature);
    }
}

