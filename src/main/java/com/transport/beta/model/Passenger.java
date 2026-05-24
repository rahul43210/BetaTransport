package com.transport.beta.model;

import com.transport.beta.dto.PassengerDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "passenger")
@Getter
@Setter
@NoArgsConstructor
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "unique_id", unique = true, nullable = false, length = 15)
    private String uniqueId;                      // Passport / Aadhar / National ID

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", length = 10)
    private Gender gender;                        // MALE, FEMALE, OTHER

    @Column(name = "nationality", length = 50)
    private String nationality;

    @Column(name = "passport_number", unique = true, length = 20)
    private String passportNumber;

    @Column(name = "passport_expiry")
    private LocalDate passportExpiry;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "pincode", length = 10)
    private String pincode;

    @Enumerated(EnumType.STRING)
    @Column(name = "passenger_type", length = 20)
    private PassengerType passengerType;          // ADULT, CHILD, INFANT, SENIOR

    @Column(name = "frequent_flyer_number", unique = true, length = 20)
    private String frequentFlyerNumber;

    @Column(name = "meal_preference", length = 30)
    private String mealPreference;               // VEG, NON_VEG, VEGAN, JAIN etc.

    @Column(name = "seat_preference", length = 20)
    private String seatPreference;               // WINDOW, AISLE, MIDDLE

    @Column(name = "special_assistance", length = 100)
    private String specialAssistance;            // Wheelchair, etc.

    @Column(name = "emergency_contact_name", length = 100)
    private String emergencyContactName;

    @Column(name = "emergency_contact_phone", length = 15)
    private String emergencyContactPhone;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    // ─── Enums (can be separate files) ───────────────────────────────────────

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public enum PassengerType {
        ADULT, CHILD, INFANT, SENIOR
    }

    public Passenger(PassengerDto passenger){
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