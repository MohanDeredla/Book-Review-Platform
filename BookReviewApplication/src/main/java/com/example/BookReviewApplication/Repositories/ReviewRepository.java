package com.example.BookReviewApplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookReviewApplication.Models.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
