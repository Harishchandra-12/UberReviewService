package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {

    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    //This line describes to sql world that it is a 1:1 relationship
    // Cascade connects the booking and review i.e if any row in review is deleted then its associated row
    //in booking is also deleted if we use REMOVE type
    //PERSIST type is for save i.e if we try to save booking without review , it automatically saves review first
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private long distance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;



}
