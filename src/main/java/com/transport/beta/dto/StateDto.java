package com.transport.beta.dto;

import com.transport.beta.dto.CityDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StateDto {

    private Integer id;

    private String name;

    private List<CityDto> cityList;
}
