package com.petShop.persistence;

import com.petShop.persistence.crud.ControlZonesCrudRepository;
import com.petShop.persistence.entity.ControlZones;
import com.petShop.persistence.entity.TemperatureReading;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ControlZonesRepository {

    @Autowired
    private ControlZonesCrudRepository controlZonesCrudRepository;

    // Obtener todas las zonas de control
    public List<ControlZones> getAll() {
        return (List<ControlZones>) controlZonesCrudRepository.findAll();
    }

    // Guardar o actualizar una zona de control
    public ControlZones save(ControlZones controlZones) {
        return controlZonesCrudRepository.save(controlZones);
    }

    // Eliminar una zona de control por su ID
    public void delete(int id) {
        controlZonesCrudRepository.deleteById(id);
    }

    // Comprobar si una zona de control existe por su ID
    public boolean existsControlZones(int id) {
        return controlZonesCrudRepository.existsById(id);
    }

    // Contar el número total de zonas de control
    public long countAll() {
        return controlZonesCrudRepository.count();
    }
}


