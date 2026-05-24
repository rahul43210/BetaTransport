package com.transport.beta.dto;

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
public class RouteDto {

    private Integer id;

    private String routeUniqueId;

    private List<BusDto> busList;

    private List<PassengerDto> activePassengerList;

    private Integer routeLength;

    private List<DepoDto> depoList;

    private List<BusStopDto> busStopList;

    private List<CityDto> cities;

    private List<StateDto> states;

    private String routeName;

}
