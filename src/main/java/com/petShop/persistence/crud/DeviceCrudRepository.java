package com.petShop.persistence.crud;


import com.petShop.persistence.entity.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceCrudRepository extends CrudRepository<Device, Integer> {

    // Encuentra dispositivos por nombre
    List<Device> findByName(String name);

    // Encuentra dispositivos por ubicación
    List<Device> findByLocation(String location);

    // Encuentra dispositivos por nombre y ubicación
    List<Device> findByNameAndLocation(String name, String location);

    // Elimina dispositivos por nombre
    void deleteByName(String name);

    // Elimina dispositivos por ubicación
    void deleteByLocation(String location);

    // Cuenta dispositivos por ubicación
    long countByLocation(String location);
}
