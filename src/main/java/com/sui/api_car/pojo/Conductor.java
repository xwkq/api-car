package com.sui.api_car.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String lastname;
    private String name;
    private Long carId;

}
