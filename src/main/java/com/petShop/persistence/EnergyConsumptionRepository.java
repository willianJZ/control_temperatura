package com.petShop.persistence;

import com.petShop.persistence.crud.EnergyConsumptionCrudRepository;
import com.petShop.persistence.entity.EnergyConsumption;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


@Repository
public class EnergyConsumptionRepository {

    @Autowired
    private EnergyConsumptionCrudRepository energyConsumptionCrudRepository;

    // Obtener todos los registros de consumo de energía
    public List<EnergyConsumption> getAll() {
        return (List<EnergyConsumption>) energyConsumptionCrudRepository.findAll();
    }

    // Obtener un registro de consumo de energía por ID
    public EnergyConsumption getById(int id) {
        return energyConsumptionCrudRepository.findById(id).orElse(null);
    }

    // Guardar o actualizar un registro de consumo de energía
    public EnergyConsumption save(EnergyConsumption energyConsumption) {
        return energyConsumptionCrudRepository.save(energyConsumption);
    }

    // Eliminar un registro de consumo de energía por ID
    public void delete(int id) {
        energyConsumptionCrudRepository.deleteById(id);
    }


    // Buscar registros por fecha
    public List<EnergyConsumption> findByFecha(String fecha) {
        return energyConsumptionCrudRepository.findByFecha(fecha);
    }

    // Buscar registros por consumo de energía
    public List<EnergyConsumption> findByConsumo(String consumo) {
        return energyConsumptionCrudRepository.findByConsumo(consumo);
    }
}

