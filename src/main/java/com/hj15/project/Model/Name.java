package com.hj15.project.Model;

public class Name {
	
	private String name;
	
	public Name() {
		
	}
	
	public Name(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
}
