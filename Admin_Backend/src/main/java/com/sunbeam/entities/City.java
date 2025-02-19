package com.sunbeam.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="City")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	
	private String name;
	
	private String district;
	private String state;
	private String pincode;
	
	@OneToMany(mappedBy = "city")
	private List<Theatre> theatreList;

	public City(int city_id, String name, String district, String state, String pincode, List<Theatre> theatreList) {
	
		this.city_id = city_id;
		this.name = name;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.theatreList = theatreList;
	}

	public City() {
		
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<Theatre> getTheatreList() {
		return theatreList;
	}

	public void setTheatreList(List<Theatre> theatreList) {
		this.theatreList = theatreList;
	}

	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", name=" + name + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + ", theatreList=" + theatreList + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
}
