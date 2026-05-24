package com.transport.beta.model;

import com.transport.beta.dto.StateDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import com.transport.beta.dto.CityDto;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;                        // City name e.g. "Mumbai"

    @Column(name = "code", unique = true, nullable = false, length = 10)
    private String code;                        // City code e.g. "BOM"

    @Column(name = "state", length = 100)
    private StateDto state;                       // State name e.g. "Maharashtra"

    @Column(name = "country", nullable = false, length = 100)
    private String country;                     // Country name e.g. "India"

    @Column(name = "country_code", nullable = false, length = 5)
    private String countryCode;                 // ISO code e.g. "IN"

    @Column(name = "timezone", length = 50)
    private String timezone;                    // e.g. "Asia/Kolkata"

    @Column(name = "latitude", precision = 10)
    private Double latitude;

    @Column(name = "longitude", precision = 10)
    private Double longitude;

    @Column(name = "airport_name", length = 150)
    private String airportName;                 // e.g. "Chhatrapati Shivaji Maharaj International Airport"

    @Column(name = "airport_code", unique = true, length = 10)
    private String airportCode;                 // IATA code e.g. "BOM"

    @Column(name = "airport_icao_code", unique = true, length = 10)
    private String airportIcaoCode;             // ICAO code e.g. "VABB"

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public City(CityDto city){
        this.id = city.getId();
        this.name = city.getName();
        this.code = city.getCode();
        this.state = city.getState();
        this.country = city.getCountry();
        this.countryCode = city.getCountryCode();
        this.timezone = city.getTimezone();
        this.latitude = city.getLatitude();
        this.longitude = city.getLongitude();
        this.airportName = city.getAirportName();
        this.airportCode = city.getAirportCode();
        this.airportIcaoCode = city.getAirportIcaoCode();
        this.isActive = city.getIsActive();
        this.createdAt = city.getCreatedAt();
        this.updatedAt = city.getUpdatedAt();
    }

}