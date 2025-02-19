package com.sunbeam.entities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name="theatre_Admin")
@Entity
public class TheatreAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="theatre_admin_id")
	private int  theatreAdminId;
	
	private String name;
	
	private String email;
	
	private String mobile;
	
	private String password;
	
	private String role;
	
	@OneToMany(mappedBy = "theatreAdmin")
	private List<Theatre> theatre;

	@Override
	public String toString() {
		return "TheatreAdmin [theatreAdminId=" + theatreAdminId + ", name=" + name + ", email=" + email + ", mobile="
				+ mobile + ", password=" + password + ", role=" + role + ", theatre=" + theatre + "]";
	}

	public TheatreAdmin(int theatreAdminId, String name, String email, String mobile, String password, String role,
			List<Theatre> theatre) {
		
		this.theatreAdminId = theatreAdminId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.role = role;
		this.theatre = theatre;
	}

	public TheatreAdmin() {
			}

	public int getTheatreAdminId() {
		return theatreAdminId;
	}

	public void setTheatreAdminId(int theatreAdminId) {
		this.theatreAdminId = theatreAdminId;
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

	public List<Theatre> getTheatre() {
		return theatre;
	}

	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	
	
	
	
	

}
