package com.transport.beta.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @Column(name = "BUS_UNIQUE_ID", unique = true, nullable = false)
    private String busUniqueId;

    @Column(name = "BUS_MANUFACTURE")
    private String busManufacture;

    @Column(name = "BUS_MODEL_NAME")
    private String busModelName;

    @Column(name = "FUEL_TYPE")
    private String fuelType;

    @Column(name = "ENGINE_NUMBER")
    private String engineNumber;

    @Column(name = "BUS_NUMBER_PLATE")
    private String busNumberPlate;

    @Column(name = "TOTAL_SEAT")
    private Integer totalSeat;

    @Column(name = "IS_SLEEPER", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isSleeper;

    @Column(name = "RANGE_IN_KM", columnDefinition = "INTEGER DEFAULT 0")
    private Integer rangeinKm;

    @Column(name = "BUS_COMPANY_ID")
    private Integer busCompanyId;

    @Column(name = "BUS_IN_SERVICE", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private LocalDate busInService;

    @Column(name = "IS_IN_MAINTAINCE", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isInMaintaince;

    @Column(name = "IS_ACTIVE", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isActive;

    @Column(name = "IS_IN_WORKSHOP_RESERVE", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean isInWorkshopResearve;

    @Column(name = "ENGINE_EXPIRY")
    private LocalDate engineExpiry;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

}
