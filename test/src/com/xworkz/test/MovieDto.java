package com.xworkz.test;

public class MovieDto {
	private int movieId;
	private String movieName;
	private double movieRating;
	private String heroName;
	public MovieDto() {
		
	}
	public MovieDto(int movieId, String movieName, double movieRating, String heroName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.heroName = heroName;
	}
	@Override
	public String toString() {
		return "MovieDto [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating
				+ ", heroName=" + heroName + "]";
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	

}
