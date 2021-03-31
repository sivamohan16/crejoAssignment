//package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import MovieModel.*;
//import ReviewModel.*;
//import UserModel.*;



public class ServiceClass {
	
	private Map<String, MovieModel> movieMap = new HashMap<>();
	private Map<String, UserModel> userMap = new HashMap<>();
	private List<ReviewModel> review=new ArrayList<>();
	
 //addMovie class which gets movie movie date and genre
	public void addMovies(String movieName, String movieDate, String genres) {
	
		MovieModel obj=new MovieModel(movieName,movieDate,genres);
		movieMap.put(movieName, obj);
		
//		if (obj.getMovieDate >= 2021){
//		    throw new IOException("movie yet to be released");
//		}
		
	}
//addUser class
	public void addUser(String user) {
		
		userMap.put(user,new UserModel(user));
		
	}
//add review class
	public void addReview(String userName, String movieName, int rating) {
		
		
		MovieModel movie = movieMap.get(movieName);
	  
		movie.setNumberOfReviews(movie.getNumberOfReviews()+1);
	    
		movie.setTotalRating(rating);
		review.add(new ReviewModel(userName, movieName, rating));
		
	}
// to get average rating of the paticular movie
	public double getAverageScoreForParticularMovie(String movieName) {
		MovieModel movie = movieMap.get(movieName);
		
        if (movie.getNumberOfReviews() > 0) {
            return (double) movie.getTotalRating() / (double) movie.getNumberOfReviews();
        }
        return 0;
		
	}

	

}
