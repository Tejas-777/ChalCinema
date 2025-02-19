package com.sunbeam.entities;

import java.util.List;

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
@Table(name = "Time")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "time_id")
	private int timeId;
	
	@Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Show> shows;

	@Override
	public String toString() {
		return "Time [timeId=" + timeId + ", startTime=" + startTime + ", endTime=" + endTime + ", shows=" + shows
				+ "]";
	}

	public Time(int timeId, String startTime, String endTime, List<Show> shows) {
		
		this.timeId = timeId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.shows = shows;
	}

	public Time() {
		
	}

	public int getTimeId() {
		return timeId;
	}

	public void setTimeId(int timeId) {
		this.timeId = timeId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	
    
    
    
	
}
