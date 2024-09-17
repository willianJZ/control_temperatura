package com.petShop.persistence.service;

import com.petShop.persistence.entity.EnergyConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petShop.persistence.EnergyConsumptionRepository;
import java.util.List;
import java.util.Optional;

@Service
public class EnergyConsumptionService {

    @Autowired
    private EnergyConsumptionRepository energyConsumptionRepository;

    // Obtener todos los registros de consumo de energía
    public List<EnergyConsumption> getAll() {
        return energyConsumptionRepository.getAll();
    }

    // Obtener un registro de consumo de energía por ID
    public Optional<EnergyConsumption> getById(int id) {
        return Optional.ofNullable(energyConsumptionRepository.getById(id));
    }

    // Guardar o actualizar un registro de consumo de energía
    public EnergyConsumption save(EnergyConsumption energyConsumption) {
        return energyConsumptionRepository.save(energyConsumption);
    }

    // Eliminar un registro de consumo de energía por ID
    public boolean delete(int id) {
        Optional<EnergyConsumption> energyConsumption = getById(id);
        if (energyConsumption.isPresent()) {
            energyConsumptionRepository.delete(id);
            return true;
        } else {
            return false;
        }
    }


    // Buscar registros por fecha
    public List<EnergyConsumption> findByFecha(String fecha) {
        return energyConsumptionRepository.findByFecha(fecha);
    }

    // Buscar registros por consumo de energía
    public List<EnergyConsumption> findByConsumo(String consumo) {
        return energyConsumptionRepository.findByConsumo(consumo);
    }
}

