package com.sunbeam.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int movieId;
	@Column(name = "movie_name")
	private String movieName;
	
	private String description;
	private String duration;
	private String genre;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	private String language;
	
	@JsonIgnore
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
	private List<Show> shows;

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", description=" + description + ", duration="
				+ duration + ", genre=" + genre + ", releaseDate=" + releaseDate + ", language=" + language + ", shows="
				+ shows + "]";
	}

	public Movie(int movieId, String movieName, String description, String duration, String genre, LocalDate releaseDate,
			String language, List<Show> shows) {
		
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
		this.duration = duration;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.language = language;
		this.shows = shows;
	}

	public Movie() {
		
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

	public void setReleaseDate(LocalDate localDate) {
		this.releaseDate = localDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	
	
	

	
	
	
	
	
}
