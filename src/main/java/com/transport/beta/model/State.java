package com.transport.beta.model;

import com.transport.beta.dto.StateDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "state_name")
    private String stateName;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cityList;

    public State(StateDto stateDto){
        this.id = stateDto.getId();
        this.stateName = stateDto.getName();

        if(stateDto.getCityList() != null) {
            this.cityList = stateDto
                                .getCityList()
                                    .stream()
                                        .map(c -> new City(c))
                                            .collect(Collectors.toList());
        }
    }
}
