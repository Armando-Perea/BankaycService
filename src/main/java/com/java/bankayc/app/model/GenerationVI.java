package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVI {
	
	@JsonProperty("omegaruby-alphasaphire")
	OmegaRubyAlphaSaphire omegaruby_alphasaphire;
	
	@JsonProperty("x-y")
	XY x_y;

	public OmegaRubyAlphaSaphire getOmegaruby_alphasaphire() {
		return omegaruby_alphasaphire;
	}

	public void setOmegaruby_alphasaphire(OmegaRubyAlphaSaphire omegaruby_alphasaphire) {
		this.omegaruby_alphasaphire = omegaruby_alphasaphire;
	}

	public XY getX_y() {
		return x_y;
	}

	public void setX_y(XY x_y) {
		this.x_y = x_y;
	}

	@Override
	public String toString() {
		return "GenerationVI [omegaruby_alphasaphire=" + omegaruby_alphasaphire + ", x_y=" + x_y + "]";
	}

}
