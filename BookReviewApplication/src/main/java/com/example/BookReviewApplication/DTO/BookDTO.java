package com.example.BookReviewApplication.DTO;

import lombok.Data;

@Data
public class BookDTO {
	private String title;
	private String author;
	private String genre;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}
	
}
