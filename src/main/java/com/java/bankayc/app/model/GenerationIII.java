package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIII {

	Emerald emerald;
	
	@JsonProperty("firered-leafgreen") 
	FireRedLeafGreen firered_leafgreen;
	
	@JsonProperty("ruby-saphire") 
	RubySaphire ruby_saphire;

	public Emerald getEmerald() {
		return emerald;
	}

	public void setEmerald(Emerald emerald) {
		this.emerald = emerald;
	}

	public FireRedLeafGreen getFirered_leafgreen() {
		return firered_leafgreen;
	}

	public void setFirered_leafgreen(FireRedLeafGreen firered_leafgreen) {
		this.firered_leafgreen = firered_leafgreen;
	}

	public RubySaphire getRuby_saphire() {
		return ruby_saphire;
	}

	public void setRuby_saphire(RubySaphire ruby_saphire) {
		this.ruby_saphire = ruby_saphire;
	}

	@Override
	public String toString() {
		return "GenerationIII [emerald=" + emerald + ", firered_leafgreen=" + firered_leafgreen + ", ruby_saphire="
				+ ruby_saphire + "]";
	}
	
}
