package com.sunbeam.models;


	import lombok.*;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class TheatreModel {
	    private String name;
	    private int numberOfScreens;
	    private int adminId;
	    private int cityId;
	}
