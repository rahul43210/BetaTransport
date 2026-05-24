package com.transport.beta.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BusStop {

    private Integer id;

    private String busStopName;

    private Double langitude;

    private Double longituge;

    private City city;

    private State state;

    private Long pincode;

    private List<Passenger> passengers;


}
