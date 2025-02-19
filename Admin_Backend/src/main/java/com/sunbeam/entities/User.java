package com.sunbeam.entities;

import java.util.Set;

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
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	private String name;
		
	private String email;
	private String mobile;
	
	private String password;
	private String role;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private Set<UserLocation> locations;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL )
	@JsonIgnore
	private Set<Booking> bookings;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserLocation> getLocations() {
		return locations;
	}

	public void setLocations(Set<UserLocation> locations) {
		this.locations = locations;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", role=" + role + ", locations=" + locations + ", bookings=" + bookings + "]";
	}

	public User(int userId, String name, String email, String mobile, String password, String role,
			Set<UserLocation> locations, Set<Booking> bookings) {

		this.userId = userId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.role = role;
		this.locations = locations;
		this.bookings = bookings;
	}

	public User() {
		
	}
	
	
	
	
	
	

}
