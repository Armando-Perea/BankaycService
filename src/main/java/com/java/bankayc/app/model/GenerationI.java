package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationI {

	@JsonProperty("red-blue") 
	RedBlue red_blue;
	
	Yellow yellow;

	public RedBlue getRed_blue() {
		return red_blue;
	}

	public void setRed_blue(RedBlue red_blue) {
		this.red_blue = red_blue;
	}

	public Yellow getYellow() {
		return yellow;
	}

	public void setYellow(Yellow yellow) {
		this.yellow = yellow;
	}

	@Override
	public String toString() {
		return "GenerationI [red_blue=" + red_blue + ", yellow=" + yellow + "]";
	}
	
}
