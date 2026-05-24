package com.transport.beta.dto;

import com.transport.beta.model.Passenger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PassengerDto {

    private Integer id;

    private String name;

    private LocalDate dateOfBirth;

    private String uniqueId;                      // Passport / Aadhar / National ID

    private String email;

    private String phoneNumber;

    private Passenger.Gender gender;                        // MALE, FEMALE, OTHER

    private String nationality;

    private String passportNumber;

    private LocalDate passportExpiry;

    private String address;

    private String city;

    private String country;

    private String pincode;

    private Passenger.PassengerType passengerType;          // ADULT, CHILD, INFANT, SENIOR

    private String frequentFlyerNumber;

    private String mealPreference;               // VEG, NON_VEG, VEGAN, JAIN etc.

    private String seatPreference;               // WINDOW, AISLE, MIDDLE

    private String specialAssistance;            // Wheelchair, etc.

    private String emergencyContactName;

    private String emergencyContactPhone;

    private Boolean isActive = true;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public PassengerDto(Passenger passenger){
        this.id                   = passenger.getId();
        this.name                 = passenger.getName();
        this.dateOfBirth          = passenger.getDateOfBirth();
        this.uniqueId             = passenger.getUniqueId();
        this.email                = passenger.getEmail();
        this.phoneNumber          = passenger.getPhoneNumber();
        this.gender               = passenger.getGender();
        this.nationality          = passenger.getNationality();
        this.passportNumber       = passenger.getPassportNumber();
        this.passportExpiry       = passenger.getPassportExpiry();
        this.address              = passenger.getAddress();
        this.city                 = passenger.getCity();
        this.country              = passenger.getCountry();
        this.pincode              = passenger.getPincode();
        this.passengerType        = passenger.getPassengerType();
        this.frequentFlyerNumber  = passenger.getFrequentFlyerNumber();
        this.mealPreference       = passenger.getMealPreference();
        this.seatPreference       = passenger.getSeatPreference();
        this.specialAssistance    = passenger.getSpecialAssistance();
        this.emergencyContactName  = passenger.getEmergencyContactName();
        this.emergencyContactPhone = passenger.getEmergencyContactPhone();
        this.isActive             = passenger.getIsActive();
        this.createdAt            = passenger.getCreatedAt();
        this.updatedAt            = passenger.getUpdatedAt();
    }
}
