package com.petShop.persistence.crud;

import com.petShop.persistence.entity.ControlZones;
import com.petShop.persistence.entity.EnergyConsumption;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EnergyConsumptionCrudRepository extends CrudRepository<EnergyConsumption, Integer> {

    // Métodos personalizados si los necesitas

    List<EnergyConsumption> findByFecha(String fecha);

    List<EnergyConsumption> findByConsumo(String consumo);
}




