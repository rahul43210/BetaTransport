package com.transport.beta.model;

import com.transport.beta.dto.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * This is class deals with the route where this will help to fetch the all bus active in route and
 * all passenger active in the route
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "route_unique_id")
    private String routeUniqueId;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bus> busList;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Passenger> activePassengerList;

    @Column(name = "route_length", columnDefinition = "INTEGER DEFAULT '0'")
    private Integer routeLength;

    private List<Depo> depoList;

    private List<BusStop> busStopList;

    private List<City> cities;

    private List<StateDto> states;

    private String routeName;

}
