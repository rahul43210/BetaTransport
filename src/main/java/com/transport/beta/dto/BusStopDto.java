package com.transport.beta.dto;

import com.transport.beta.model.BusStop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BusStopDto {

    private Integer id;

    private String busStopName;

    private Double langitude;

    private Double longituge;

    private CityDto city;

    private StateDto state;

    private Long pincode;
    
    private List<PassengerDto> passengers;

    public BusStopDto(BusStop busStop){
        this.id = busStop.getId();
        this.busStopName = busStop.getBusStopName();
        this.langitude = busStop.getLangitude();
        this.longituge = busStop.getLongituge();

        if(busStop.getCity() != null) {
            this.city = new CityDto(busStop.getCity());
        }

        if(busStop.getState() != null){
            this.state = new StateDto(busStop.getState());
        }
    }
    
}
