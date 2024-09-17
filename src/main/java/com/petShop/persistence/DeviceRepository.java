package com.petShop.persistence;

import com.petShop.persistence.crud.DeviceCrudRepository;
import com.petShop.persistence.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DeviceRepository {

    @Autowired
    private DeviceCrudRepository deviceCrudRepository;

    // Guardar un dispositivo
    public Device save(Device device) {
        return deviceCrudRepository.save(device);
    }

    // Obtener todos los dispositivos
    public List<Device> getAll() {
        return (List<Device>) deviceCrudRepository.findAll();
    }

    // Obtener un dispositivo por ID
    public Optional<Device> getById(Integer id) {
        return deviceCrudRepository.findById(id);
    }

    // Obtener dispositivos por nombre
    public List<Device> getByName(String name) {
        return deviceCrudRepository.findByName(name);
    }

    // Obtener dispositivos por ubicación
    public List<Device> getByLocation(String location) {
        return deviceCrudRepository.findByLocation(location);
    }

    // Eliminar un dispositivo por ID
    public void deleteById(Integer id) {
        deviceCrudRepository.deleteById(id);
    }

    // Eliminar dispositivos por nombre
    public void deleteByName(String name) {
        deviceCrudRepository.deleteByName(name);
    }

    // Contar dispositivos por ubicación
    public long countByLocation(String location) {
        return deviceCrudRepository.countByLocation(location);
    }

    public List<Device> findAll() {
        return (List<Device>) deviceCrudRepository.findAll();
    }
}

