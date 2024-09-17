package com.petShop.web.controller;

import com.petShop.persistence.service.DeviceService;
import com.petShop.persistence.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    // Obtener todos los dispositivos
    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }


    @PostMapping
    public ResponseEntity<Device> saveDevice(@RequestBody Device device) {
        Device savedDevice = deviceService.saveDevice(device);
        return new ResponseEntity<>(savedDevice, HttpStatus.CREATED);
    }

    // Obtener un dispositivo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable Integer id) {
        Optional<Device> device = deviceService.getDeviceById(id);
        return device.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    // Buscar dispositivos por nombre
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Device>> getDevicesByName(@PathVariable String name) {
        List<Device> devices = deviceService.getDevicesByName(name);
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    // Buscar dispositivos por ubicación
    @GetMapping("/location/{location}")
    public ResponseEntity<List<Device>> getDevicesByLocation(@PathVariable String location) {
        List<Device> devices = deviceService.getDevicesByLocation(location);
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }


    // Eliminar dispositivos por nombre
    @DeleteMapping("/name/{name}")
    public ResponseEntity<Void> deleteDevicesByName(@PathVariable String name) {
        deviceService.deleteDevicesByName(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Contar dispositivos por ubicación
    @GetMapping("/count/location/{location}")
    public ResponseEntity<Long> countDevicesByLocation(@PathVariable String location) {
        long count = deviceService.countDevicesByLocation(location);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
}



