package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVII {
	
	Icons icons;
	
	@JsonProperty("ultra-sun-ultra-moon")
	UltraSunUltraMoon ultra_sun_ultra_moon;

	public Icons getIcons() {
		return icons;
	}

	public void setIcons(Icons icons) {
		this.icons = icons;
	}

	public UltraSunUltraMoon getUltra_sun_ultra_moon() {
		return ultra_sun_ultra_moon;
	}

	public void setUltra_sun_ultra_moon(UltraSunUltraMoon ultra_sun_ultra_moon) {
		this.ultra_sun_ultra_moon = ultra_sun_ultra_moon;
	}

	@Override
	public String toString() {
		return "GenerationVII [icons=" + icons + ", ultra_sun_ultra_moon=" + ultra_sun_ultra_moon + "]";
	}
	
}
