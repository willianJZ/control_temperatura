package com.petShop.persistence.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    public Integer getId() {
        return id;
    }

    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }

    @Column(name="location")
    private String location;
    public String getLocation() {
        return location;
    }

}
