//package com.main;

//import ServiceClass.*;

public class Mainclass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ServiceClass service=new ServiceClass();
		
		service.addMovies("Don","released in Year 2006 for Genres","Action");
		service.addMovies("Tiger" ,"released in Year 2008 for Genre ","Drama");
		service.addMovies("Padmaavat"," released in Year 2006 for Genre", "Comedy");
		service.addMovies("Lunchbox"," released in Year 2021 for Genre", "Drama");
		service.addMovies("Guru" ,"released in Year 2006 for Genre ","Drama");
		service.addMovies("Metro"," released in Year 2006 for Genre ","Romance");
		service.addUser("SRK");
		service.addUser("salman");
		service.addUser("deepika");
		service.addReview("SRK", "Don", 2);
		service.addReview("SRK", "Padmavaat", 8);
		service.addReview("salman", "Don", 5);
		service.addReview("deepika", "Don", 9);
		service.addReview("deepika", "Guru", 6);
		service.addReview("SRK", "Don", 2);
		service.addReview("Deepika", "Lunchbox", 5);
		service.addReview("SRK", "Tiger", 5);
		service.addReview("SRK", "Metro", 7);
		
		double res = service.getAverageScoreForParticularMovie("Don");
		System.out.println(res);
		
		
	}

}
