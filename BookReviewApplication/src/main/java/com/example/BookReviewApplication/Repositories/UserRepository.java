package com.example.BookReviewApplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookReviewApplication.Models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
