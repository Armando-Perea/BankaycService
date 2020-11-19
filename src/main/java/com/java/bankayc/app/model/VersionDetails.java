package com.java.bankayc.app.model;

public class VersionDetails {
	
	Integer rarity;
	
	Version version;

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "VersionDetails [rarity=" + rarity + ", version=" + version + "]";
	}

}
