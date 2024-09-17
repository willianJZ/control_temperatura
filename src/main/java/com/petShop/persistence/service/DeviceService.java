package com.petShop.persistence.service;

import com.petShop.persistence.DeviceRepository;
import com.petShop.persistence.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    // Guardar un dispositivo
    public Device saveDevice(Device device) {
        return deviceRepository.save(device);
    }

    // Buscar un dispositivo por ID
    public Optional<Device> getDeviceById(Integer id) {
        return deviceRepository.getById(id);
    }

    // Buscar todos los dispositivos
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    // Buscar dispositivos por nombre
    public List<Device> getDevicesByName(String name) {
        return deviceRepository.getByName(name);
    }

    // Buscar dispositivos por ubicación
    public List<Device> getDevicesByLocation(String location) {
        return deviceRepository.getByLocation(location);
    }

    // Eliminar dispositivos por nombre
    public void deleteDevicesByName(String name) {
        deviceRepository.deleteByName(name);
    }

    // Contar dispositivos por ubicación
    public long countDevicesByLocation(String location) {
        return deviceRepository.countByLocation(location);
    }
}

