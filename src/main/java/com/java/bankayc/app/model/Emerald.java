package com.java.bankayc.app.model;

public class Emerald {

	String back_default;
	
	String back_shiny;

	public String getBack_default() {
		return back_default;
	}

	public void setBack_default(String back_default) {
		this.back_default = back_default;
	}

	public String getBack_shiny() {
		return back_shiny;
	}

	public void setBack_shiny(String back_shiny) {
		this.back_shiny = back_shiny;
	}

	@Override
	public String toString() {
		return "Emerald [back_default=" + back_default + ", back_shiny=" + back_shiny + "]";
	}
	
}
