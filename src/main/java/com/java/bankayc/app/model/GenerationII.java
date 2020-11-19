package com.java.bankayc.app.model;

public class GenerationII {

	Crystal crystal;
	
	Gold gold;
	
	Silver silver;

	public Crystal getCrystal() {
		return crystal;
	}

	public void setCrystal(Crystal crystal) {
		this.crystal = crystal;
	}

	public Gold getGold() {
		return gold;
	}

	public void setGold(Gold gold) {
		this.gold = gold;
	}

	public Silver getSilver() {
		return silver;
	}

	public void setSilver(Silver silver) {
		this.silver = silver;
	}

	@Override
	public String toString() {
		return "GenerationII [crystal=" + crystal + ", gold=" + gold + ", silver=" + silver + "]";
	}
	
}
