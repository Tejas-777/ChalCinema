package com.sunbeam.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "theatre")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theatre_id;
	
	private String name;
	
	private int no_of_screens;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "theatre_admin_id")
	private TheatreAdmin theatreAdmin;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	 @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Screen> screens;

	    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
	    @JsonIgnore 
	    private List<Booking> bookings;

		public Theatre() {
	
		}

		public Theatre(int theatre_id, String name, int no_of_screens, TheatreAdmin theatreAdmin, City city,
				List<Screen> screens, List<Booking> bookings) {
			
			this.theatre_id = theatre_id;
			this.name = name;
			this.no_of_screens = no_of_screens;
			this.theatreAdmin = theatreAdmin;
			this.city = city;
			this.screens = screens;
			this.bookings = bookings;
		}

		public int getTheatre_id() {
			return theatre_id;
		}

		public void setTheatre_id(int theatre_id) {
			this.theatre_id = theatre_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNo_of_screens() {
			return no_of_screens;
		}

		public void setNo_of_screens(int no_of_screens) {
			this.no_of_screens = no_of_screens;
		}

		public TheatreAdmin getTheatreAdmin() {
			return theatreAdmin;
		}

		public void setTheatreAdmin(TheatreAdmin theatreAdmin) {
			this.theatreAdmin = theatreAdmin;
		}

		public City getCity() {
			return city;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public List<Screen> getScreens() {
			return screens;
		}

		public void setScreens(List<Screen> screens) {
			this.screens = screens;
		}

		public List<Booking> getBookings() {
			return bookings;
		}

		public void setBookings(List<Booking> bookings) {
			this.bookings = bookings;
		}

		@Override
		public String toString() {
			return "Theatre [theatre_id=" + theatre_id + ", name=" + name + ", no_of_screens=" + no_of_screens
					+ ", theatreAdmin=" + theatreAdmin + ", city=" + city + ", screens=" + screens + ", bookings="
					+ bookings + "]";
		}
	    
	  
		

	
	
	

}
