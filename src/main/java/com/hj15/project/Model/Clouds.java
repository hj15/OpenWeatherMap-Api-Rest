package com.hj15.project.Model;

public class Clouds {
	
	private int clouds;
	
	public Clouds() {
		
	}
	
	public Clouds(String clouds) {
		this.setClouds(Integer.parseInt(clouds));
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	@Override
	public String toString() {
		return "Clouds [clouds=" + clouds + "]";
	}
	
}
