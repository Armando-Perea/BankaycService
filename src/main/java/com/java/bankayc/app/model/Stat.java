package com.java.bankayc.app.model;

public class Stat {

	String name;
	
	String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Stat [name=" + name + ", url=" + url + "]";
	}
	
}
