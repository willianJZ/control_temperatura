package com.petShop.persistence.crud;

import com.petShop.persistence.entity.EnergyConsumption;
import com.petShop.persistence.entity.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface TemperatureReadingCrudRepository extends JpaRepository<TemperatureReading, Integer> {

    // Encuentra lecturas de temperatura por el valor de la temperatura
    List<TemperatureReading> findByTemperature(String temperature);
}
