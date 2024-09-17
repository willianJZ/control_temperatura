package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ControlZones")
public class ControlZones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_zona")
    private Integer id;

    @Column(name="nombre_zona")
    private String name;

    @Column(name = "descripción")
    private String descripcion;

    @Column(name = "ubicación")
    private String ubicacion;

}
