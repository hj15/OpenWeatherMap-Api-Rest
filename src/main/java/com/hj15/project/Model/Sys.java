package com.hj15.project.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Sys {
	
	private String country;
	
	private Long sunrise;
	
	private Long sunset;
	
	public Sys() {
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getSunrise() {
		return sunrise;
	}

	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	public Long getSunset() {
		return sunset;
	}

	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}

	@Override
	public String toString() {
		return "Sys [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
	
}
