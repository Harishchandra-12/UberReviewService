package com.example.UberReviewService.Repositories;

import com.example.UberReviewService.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
