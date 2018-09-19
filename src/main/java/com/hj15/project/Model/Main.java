package com.hj15.project.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Main {
	
	private double temp;
	
	private int humidity;
	
	private int pressure;
	
	private double temp_min;
	
	private double temp_max;
	
	public Main() {
		
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + "]";
	}
	
}
