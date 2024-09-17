package com.petShop.persistence.service;

import com.petShop.persistence.crud.ControlZonesCrudRepository;
import com.petShop.persistence.entity.ControlZones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ControlZonesService {

    @Autowired
    private ControlZonesCrudRepository controlZonesCrudRepository;

    // Obtener todas las zonas de control
    public List<ControlZones> getAllZones() {
        return (List<ControlZones>) controlZonesCrudRepository.findAll();
    }

    // Obtener una zona de control por ID
    public Optional<ControlZones> getById(int id) {
        return controlZonesCrudRepository.findById(id);
    }

    // Guardar una nueva zona de control o actualizar una existente
    public ControlZones save(ControlZones controlZones) {
        return controlZonesCrudRepository.save(controlZones);
    }

    // Eliminar una zona de control por ID
    public void delete(int id) {
        controlZonesCrudRepository.deleteById(id);
    }

    // Verificar si una zona de control existe por ID
    public boolean exists(int id) {
        return controlZonesCrudRepository.existsById(id);
    }

    // Buscar zonas de control por nombre
    public List<ControlZones> findByName(String name) {
        return controlZonesCrudRepository.findByName(name);
    }

    // Buscar zonas de control por descripción
    public List<ControlZones> findByDescripcion(String descripcion) {
        return controlZonesCrudRepository.findByDescripcion(descripcion);
    }

    // Buscar zonas de control por ubicación
    public List<ControlZones> findByUbicacion(String ubicacion) {
        return controlZonesCrudRepository.findByUbicacion(ubicacion);
    }
}

