package com.sunbeam.entities;

import java.sql.Date;
import java.util.List;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "`show`")
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "show_id")
	private int showId;
	
	@Column(name = "show_date")
	private Date showDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id", nullable = false)
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="screen_id")
	private Screen screen;
	
	@ManyToOne
	@JoinColumn(name = "time_id")
	private Time time;
	
	@OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<ShowSeat> showseats;

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showDate=" + showDate + ", movie=" + movie + ", screen=" + screen
				+ ", time=" + time + ", showseats=" + showseats + "]";
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<ShowSeat> getShowseats() {
		return showseats;
	}

	public void setShowseats(List<ShowSeat> showseats) {
		this.showseats = showseats;
	}

	public Show(int showId, Date showDate, Movie movie, Screen screen, Time time, List<ShowSeat> showseats) {
		super();
		this.showId = showId;
		this.showDate = showDate;
		this.movie = movie;
		this.screen = screen;
		this.time = time;
		this.showseats = showseats;
	}

	public Show() {
	
	}
	
	
	
	
	

}
