 package com.sunbeam.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@Column(name = "booking_id")
	private int bookingId;
	
	@Column(name = "no_of_seats")
	private int noOfSeats;
	@Column(name = "booking_time")
	private int bookingTime;
	
	@Column(name = "show_id")
	private int showId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;
	

    @ManyToOne
    @JoinColumn(name = "theatre_id", nullable = false) 
    private Theatre theatre;
	
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(int bookingTime) {
		this.bookingTime = bookingTime;
	}
	
	// -- sameer
//	public int getTheatreId() {
//		return theatreId;
//	}
//	public void setTheatreId(int theatreId) {
//		this.theatreId = theatreId;
//	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
//	public Booking(int bookingId, int noOfSeats, int bookingTime, int theatreId, int showId, User user,
//			Payment payment) {
//		
//		this.bookingId = bookingId;
//		this.noOfSeats = noOfSeats;
//		this.bookingTime = bookingTime;
//		this.showId = showId;
//		this.user = user;
//		this.payment = payment;
//	}
	
	
	
	public Booking() {
		
	}
	public Booking(int bookingId, int noOfSeats, int bookingTime, int showId, User user, Payment payment) {
	this.bookingId = bookingId;
	this.noOfSeats = noOfSeats;
	this.bookingTime = bookingTime;
	this.showId = showId;
	this.user = user;
	this.payment = payment;
}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", noOfSeats=" + noOfSeats + ", bookingTime=" + bookingTime+ ", showId=" + showId + ", user=" + user + ", payment=" + payment + "]";
	}

	
	
	
	
	
	
	
}
