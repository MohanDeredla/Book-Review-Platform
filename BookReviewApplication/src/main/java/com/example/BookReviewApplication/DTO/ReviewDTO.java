package com.example.BookReviewApplication.DTO;

import lombok.Data;

@Data
public class ReviewDTO {
	
	private String reviewText;
	private int rating;
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ReviewDTO [reviewText=" + reviewText + ", rating=" + rating + "]";
	}
	
	
}
