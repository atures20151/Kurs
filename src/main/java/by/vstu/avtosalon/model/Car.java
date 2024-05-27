package by.vstu.avtosalon.model;

import jakarta.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false, unique = true)
    private String vin;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String status;
}
