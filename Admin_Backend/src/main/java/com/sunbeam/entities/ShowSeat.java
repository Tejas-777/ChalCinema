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
@Table(name = "show_seat")
public class ShowSeat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "show_seat_id")
	private int showSeatId;
	
	private int status;
	
	private double price;
	private String duration;
	
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Show show;
	
	@ManyToOne
	@JoinColumn(name = "screen_id")
	private Screen screen;

	public ShowSeat(int showSeatId, int status, double price, String duration, Show show, Screen screen) {
		this.showSeatId = showSeatId;
		this.status = status;
		this.price = price;
		this.duration = duration;
		this.show = show;
		this.screen = screen;
	}

	public ShowSeat() {
		
	}

	public int getShowSeatId() {
		return showSeatId;
	}

	public void setShowSeatId(int showSeatId) {
		this.showSeatId = showSeatId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "ShowSeat [showSeatId=" + showSeatId + ", status=" + status + ", price=" + price + ", duration="
				+ duration + ", show=" + show + ", screen=" + screen + "]";
	}
	
	
	
	
	
	
	

}
