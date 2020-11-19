package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationV {

	@JsonProperty("black-white") 
	BlackWhite black_white;

	public BlackWhite getBlack_white() {
		return black_white;
	}

	public void setBlack_white(BlackWhite black_white) {
		this.black_white = black_white;
	}

	@Override
	public String toString() {
		return "GenerationV [black_white=" + black_white + "]";
	}
	
}
