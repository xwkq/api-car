package com.sui.api_car.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String brand;
    private String model;
    private String year;

    @Column(unique = true, nullable = false)
    private String matriculation;
}
