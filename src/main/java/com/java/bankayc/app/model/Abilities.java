package com.java.bankayc.app.model;


public class Abilities {

	Ability ability;
	
	Boolean is_hidden;
	
	Integer slot;

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	public Boolean getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(Boolean is_hidden) {
		this.is_hidden = is_hidden;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "Abilities [ability=" + ability + ", is_hidden=" + is_hidden + ", slot=" + slot + "]";
	}
	
}
