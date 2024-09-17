package com.petShop.web.controller;

import com.petShop.persistence.entity.ControlZones;
import com.petShop.persistence.service.ControlZonesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/zones")
public class ControlZonesController {

    @Autowired
    private ControlZonesService controlZonesService;

    // Obtener todas las zonas de control
    @GetMapping
    public List<ControlZones> getAllZones() {
        return controlZonesService.getAllZones();
    }


    // Guardar una nueva zona de control o actualizar una existente
    @PostMapping("/save")
    public ResponseEntity<ControlZones> save(@RequestBody ControlZones controlZones) {
        ControlZones savedZone = controlZonesService.save(controlZones);
        return new ResponseEntity<>(savedZone, HttpStatus.CREATED);
    }

    // Eliminar una zona de control por ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        if (controlZonesService.exists(id)) {
            controlZonesService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Buscar zonas de control por nombre
    @GetMapping("/name/{name}")
    public List<ControlZones> findByName(@PathVariable("name") String name) {
        return controlZonesService.findByName(name);
    }

    // Buscar zonas de control por descripción
    @GetMapping("/descripcion/{descripcion}")
    public List<ControlZones> findByDescripcion(@PathVariable("descripcion") String descripcion) {
        return controlZonesService.findByDescripcion(descripcion);
    }

    // Buscar zonas de control por ubicación
    @GetMapping("/ubicacion/{ubicacion}")
    public List<ControlZones> findByUbicacion(@PathVariable("ubicacion") String ubicacion) {
        return controlZonesService.findByUbicacion(ubicacion);
    }
}

