package com.sunbeam.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private int locationId;

	private String Street;
	private String city;
	private String state;
	private String country;
	private String pinCode;

	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
	private Set<UserLocation> userLocations;

	public Location(int locationId, String street, String city, String state, String country, String pinCode,
			Set<UserLocation> userLocations) {

		this.locationId = locationId;
		Street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.userLocations = userLocations;
	}

	public Location() {

	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Set<UserLocation> getUserLocations() {
		return userLocations;
	}

	public void setUserLocations(Set<UserLocation> userLocations) {
		this.userLocations = userLocations;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", Street=" + Street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pinCode=" + pinCode + ", userLocations=" + userLocations + "]";
	}

}
