package com.example.BookReviewApplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookReviewApplication.Models.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
