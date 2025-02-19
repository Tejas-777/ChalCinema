package com.sunbeam.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_location")
public class UserLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userLocationId")
	private int userLocationId;
	
	
    @ManyToOne
    @JoinColumn(name="user_id")
	private User user;
    
    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

	@Override
	public String toString() {
		return "UserLocation [user=" + user + ", location=" + location + "]";
	}

	public UserLocation(User user, Location location) {
	
		this.user = user;
		this.location = location;
	}

	public UserLocation() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

    
    
   
    
	

    
    
    
}
