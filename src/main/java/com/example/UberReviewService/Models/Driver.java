package com.example.UberReviewService.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    private String name;

    @Column(nullable = false,unique = true)
    private String licenseNumber;

    // 1:n driver has many bookings

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();

}
