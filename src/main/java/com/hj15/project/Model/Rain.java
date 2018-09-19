package com.hj15.project.Model;

public class Rain {
	
	private int rain;
	
	public Rain() {
		
	}
	
	public Rain(String rain) {
		this.setRain(Integer.parseInt(rain));
	}
	
	public int getRain() {
		return rain;
	}

	public void setRain(int rain) {
		this.rain = rain;
	}

	@Override
	public String toString() {
		return "Rain [rain=" + rain + "]";
	}
}
