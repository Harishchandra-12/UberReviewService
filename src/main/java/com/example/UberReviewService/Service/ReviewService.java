package com.example.UberReviewService.Service;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.BookingRepository;
import com.example.UberReviewService.Repositories.DriverRepository;
import com.example.UberReviewService.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    private final DriverRepository driverRepository;

    ReviewService(ReviewRepository reviewRepository,
                  BookingRepository bookingRepository,
                  DriverRepository driverRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");
        Review r = Review.builder()
                .content("Amazing")
                .rating(4.0)
                .build();

        System.out.println(r);
        reviewRepository.save(r);

//        Optional<Booking> b = bookingRepository.findById(6L);
//        b.ifPresent(bookingRepository::delete);
//
//        Optional<Driver> driver = driverRepository.findById(1L);
//        if(driver.isPresent()) {
//            System.out.println(driver.get().getName());
//            List<Booking> bookings = driver.get().getBookings();
//
//            //List<Booking> bookings = bookingRepository.findAllByDriverId(1L);
//                for(Booking booking : bookings) {
//                    System.out.println(booking.getId());
//                }
//            }
//            Optional<Booking> bo = bookingRepository.findById(1L);
//
//        reviewRepository.deleteById(2L);
//
//        Optional<Driver> d = driverRepository.hqlFindByIdAndLicense(1L, "DL121212");
//        d.ifPresent(value -> System.out.println(value.getName()));


    }
}
