package com.example.UberReviewService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel {

    private String name;

    @OneToMany(mappedBy = "passenger")
    List<Booking> bookings = new ArrayList<>();

}
