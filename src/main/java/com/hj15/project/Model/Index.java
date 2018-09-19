package com.hj15.project.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Index {
	
	private Sys sys;
		
	private Main main;
	
	private Wind wind;
	
	private Rain rain;
	
	private Clouds clouds;
	
	private Name name;
	
	public Index() {
		
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}



	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Index {sys=" + sys + ", weather=" + ", main=" + main + ", wind=" + wind + ", Rain=" + rain
				+ ", Clouds=" + clouds + ", name=" + name + "}";
	}
	
	
}
