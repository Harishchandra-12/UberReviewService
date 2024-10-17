package com.example.UberReviewService.Models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PassengerReview extends Review{
    private String passengerReviewContent;
}
