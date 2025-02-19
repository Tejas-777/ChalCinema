package com.sunbeam.entities;

import java.util.List;

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
@Table(name = "screen")
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "screen_id")
	private int screenId;
	
	private String totalSeats;
	
	private int theatreId;
	//private String duration;
	
	 @OneToMany(mappedBy = "screen", cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Show> shows;

	    @OneToMany(mappedBy = "screen", cascade = CascadeType.ALL)
	    @JsonIgnore 
	    private List<ShowSeat> showSeats;
	    
	    @ManyToOne
	    @JoinColumn(name = "theatre_id", nullable = false) 
	    private Theatre theatre; 

		public int getScreenId() {
			return screenId;
		}

		public void setScreenId(int screenId) {
			this.screenId = screenId;
		}

		public String getTotalSeats() {
			return totalSeats;
		}

		public void setTotalSeats(String totalSeats) {
			this.totalSeats = totalSeats;
		}

		public int getTheatreId() {
			return theatreId;
		}

		public void setTheatreId(int theatreId) {
			this.theatreId = theatreId;
		}

//		public String getDuration() {
//			return duration;
//		}
//
//		public void setDuration(String duration) {
//			this.duration = duration;
//		}      -- sameer

		public List<Show> getShows() {
			return shows;
		}

		public void setShows(List<Show> shows) {
			this.shows = shows;
		}

		public List<ShowSeat> getShowSeats() {
			return showSeats;
		}

		public void setShowSeats(List<ShowSeat> showSeats) {
			this.showSeats = showSeats;
		}

//		@Override
//		public String toString() {
//			return "Screen [screenId=" + screenId + ", totalSeats=" + totalSeats + ", theatreId=" + theatreId
//					+ ", duration=" + duration + ", shows=" + shows + ", showSeats=" + showSeats + "]";
//		}      -- sameer
		
		@Override
		public String toString() {
			return "Screen [screenId=" + screenId + ", totalSeats=" + totalSeats + ", theatreId=" + theatreId
					 + ", shows=" + shows + ", showSeats=" + showSeats + "]";
		}

		public Screen(int screenId, String totalSeats, int theatreId, String duration, List<Show> shows,
				List<ShowSeat> showSeats) {
		
			this.screenId = screenId;
			this.totalSeats = totalSeats;
			this.theatreId = theatreId;
			//this.duration = duration;   --sameer
			this.shows = shows;
			this.showSeats = showSeats;
		}

		public Screen() {
		
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
}
