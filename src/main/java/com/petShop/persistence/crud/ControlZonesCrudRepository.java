package com.petShop.persistence.crud;

import com.petShop.persistence.entity.ControlZones;
import com.petShop.persistence.entity.TemperatureReading;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ControlZonesCrudRepository extends CrudRepository<ControlZones, Integer> {

    // Buscar zonas de control por nombre
    List<ControlZones> findByName(String name);

    // Buscar zonas de control por descripción
    List<ControlZones> findByDescripcion(String descripcion);

    // Buscar zonas de control por ubicación
    List<ControlZones> findByUbicacion(String ubicacion);
}

