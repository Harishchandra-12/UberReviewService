package com.example.UberReviewService.Models;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "booking_review")
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    @Column
    private double rating;

    @Override
    public String toString() {
        return "Review: " + this.content + " " + this.rating + " " + this.createdAt;
    }
}
