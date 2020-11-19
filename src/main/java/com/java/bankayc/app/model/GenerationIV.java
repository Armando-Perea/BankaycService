package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIV {
	
	@JsonProperty("diamond-pearl") 
	DiamondPearl diamond_pearl;
	
	@JsonProperty("heartgold-soulsilver") 
	HeartGoldSoulSilver heartgold_soulsilver;
	
	Platinum platinum;

	public DiamondPearl getDiamond_pearl() {
		return diamond_pearl;
	}

	public void setDiamond_pearl(DiamondPearl diamond_pearl) {
		this.diamond_pearl = diamond_pearl;
	}

	public HeartGoldSoulSilver getHeartgold_soulsilver() {
		return heartgold_soulsilver;
	}

	public void setHeartgold_soulsilver(HeartGoldSoulSilver heartgold_soulsilver) {
		this.heartgold_soulsilver = heartgold_soulsilver;
	}

	public Platinum getPlatinum() {
		return platinum;
	}

	public void setPlatinum(Platinum platinum) {
		this.platinum = platinum;
	}

	@Override
	public String toString() {
		return "GenerationIV [diamond_pearl=" + diamond_pearl + ", heartgold_soulsilver=" + heartgold_soulsilver
				+ ", platinum=" + platinum + "]";
	}
	
}
