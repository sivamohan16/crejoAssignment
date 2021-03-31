//package com.main;

//review class

public class ReviewModel {
	//
	private String userName;
	private String movieName;
	private int rating;
	//initiating user
	public String getUserName() {
		return userName;
	}
	// to ger username
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//initating movie name
	public String getMovieName() {
		return movieName;
	}
	//to get movie name
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	//initating rating
	public int getRating() {
		return rating;
	}
	//to get rating
	public void setRating(int rating) {
		this.rating = rating;
	}
	// main review class
	public ReviewModel(String userName, String movieName, int rating) {
		super();
		this.userName = userName;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	

}
