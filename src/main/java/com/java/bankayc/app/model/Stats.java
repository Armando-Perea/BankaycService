package com.java.bankayc.app.model;

public class Stats {

	String base_stat;
	
	Integer effort;
	
	Stat stat;

	public String getBase_stat() {
		return base_stat;
	}

	public void setBase_stat(String base_stat) {
		this.base_stat = base_stat;
	}

	public Integer getEffort() {
		return effort;
	}

	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}

	@Override
	public String toString() {
		return "Stats [base_stat=" + base_stat + ", effort=" + effort + ", stat=" + stat + "]";
	}
	
}
