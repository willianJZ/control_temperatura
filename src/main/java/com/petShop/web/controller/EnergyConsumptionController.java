package com.petShop.web.controller;

import com.petShop.persistence.entity.EnergyConsumption;
import com.petShop.persistence.service.EnergyConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/energyconsumption")
public class EnergyConsumptionController {

    @Autowired
    private EnergyConsumptionService energyConsumptionService;

    // Obtener todos los registros de consumo de energía
    @GetMapping
    public List<EnergyConsumption> getAll() {
        return energyConsumptionService.getAll();
    }

    // Obtener un registro de consumo de energía por ID
    @GetMapping("/{id}")
    public ResponseEntity<EnergyConsumption> getById(@PathVariable("id") int id) {
        Optional<EnergyConsumption> energyConsumption = energyConsumptionService.getById(id);
        return energyConsumption.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Guardar o actualizar un registro de consumo de energía
    @PostMapping("/save")
    public ResponseEntity<EnergyConsumption> save(@RequestBody EnergyConsumption energyConsumption) {
        EnergyConsumption savedConsumption = energyConsumptionService.save(energyConsumption);
        return new ResponseEntity<>(savedConsumption, HttpStatus.CREATED);
    }

    // Eliminar un registro de consumo de energía por ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        boolean deleted = energyConsumptionService.delete(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    // Buscar registros por fecha
    @GetMapping("/fecha/{fecha}")
    public List<EnergyConsumption> findByFecha(@PathVariable("fecha") String fecha) {
        return energyConsumptionService.findByFecha(fecha);
    }

    // Buscar registros por consumo de energía
    @GetMapping("/consumo/{consumo}")
    public List<EnergyConsumption> findByConsumo(@PathVariable("consumo") String consumo) {
        return energyConsumptionService.findByConsumo(consumo);
    }
}

