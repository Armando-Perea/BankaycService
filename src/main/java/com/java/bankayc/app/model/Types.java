package com.java.bankayc.app.model;

public class Types {

	Integer slot;
	
	Type type;

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Types [slot=" + slot + ", type=" + type + "]";
	}
	
}
