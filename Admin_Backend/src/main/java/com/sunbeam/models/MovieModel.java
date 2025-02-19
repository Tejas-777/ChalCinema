
package com.sunbeam.models;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class MovieModel {

	private String movieName;
	private String description;
	private String duration;
	private String genre;
	private LocalDate releaseDate;
	private String language;

	public MovieModel(String movieName, String description, String duration, String genre, LocalDate releaseDate,
			String language) {
		this.movieName = movieName;
		this.description = description;
		this.duration = duration;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.language = language;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "MovieModel [movieName=" + movieName + ", description=" + description + ", duration=" + duration
				+ ", genre=" + genre + ", releaseDate=" + releaseDate + ", language=" + language + "]";
	}

	
	
	
	
	

}
