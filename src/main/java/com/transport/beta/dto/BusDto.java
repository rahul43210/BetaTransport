package com.transport.beta.dto;

import com.transport.beta.model.Bus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class BusDto {

    private Integer id;

    private String busUniqueId;

    private String busManufacture;

    private String busModelName;

    private String fuelType;

    private String engineNumber;

    private String busNumberPlate;

    private Integer totalSeat;

    private Boolean isSleeper;

    private Integer rangeinKm;

    private Integer busCompanyId;

    private LocalDate busInService;

    private Boolean isInMaintaince;

    private Boolean isActive;

    private Boolean isInWorkshopResearve;

    private LocalDate engineExpiry;

    public BusDto(Bus bus){
        this.id = bus.getId();
        this.busCompanyId = bus.getBusCompanyId();
        this.busInService = bus.getBusInService();
        this.busManufacture = bus.getBusManufacture();
        this.busModelName = bus.getBusModelName();
        this.busNumberPlate = bus.getBusNumberPlate();
        this.busUniqueId = bus.getBusUniqueId();
        this.engineExpiry = bus.getEngineExpiry();
        this.engineNumber = bus.getEngineNumber();
        this.fuelType = bus.getFuelType();
        this.isInMaintaince = bus.getIsInMaintaince();
        this.isSleeper = bus.getIsSleeper();
        this.isActive = bus.getIsActive();
        this.isInWorkshopResearve = bus.getIsInWorkshopResearve();
        this.rangeinKm = bus.getRangeinKm();
        this.totalSeat = bus.getTotalSeat();
    }
}
