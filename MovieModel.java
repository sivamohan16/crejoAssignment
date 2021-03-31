//package com.main;

public class MovieModel {
	
	private String movieName;
	private String movieDate;
	private String genres;
	
	private int numberOfReviews;
	private int totalRating;
	
	
	public int getTotalRating() {
		return totalRating;
	}
	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}
	public MovieModel()
	{
		
	}
	public int getNumberOfReviews() {
		return numberOfReviews;
	}
	public void setNumberOfReviews(int numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}
	public MovieModel(String movieName, String movieDate, String genres) {
		super();
		this.movieName = movieName;
		this.movieDate = movieDate;
		this.genres = genres;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	
	

}
