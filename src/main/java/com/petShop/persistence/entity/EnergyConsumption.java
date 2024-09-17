package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EnergyConsumption")
public class EnergyConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consumo")
    private Integer id;

    @Column(name = "id_zona")
    private Integer id_zona;

    @Column(name = "fecha_hora")
    private String fecha;

    @Column(name = "consumo_energia")
    private String consumo;

    @Column(name = "costo")
    private Integer costo;


}
