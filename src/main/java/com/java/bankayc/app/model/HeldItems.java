package com.java.bankayc.app.model;

import java.util.Arrays;

public class HeldItems {
	
	Item item;
	
	VersionDetails [] version_details;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public VersionDetails[] getVersion_details() {
		return version_details;
	}

	public void setVersion_details(VersionDetails[] version_details) {
		this.version_details = version_details;
	}

	@Override
	public String toString() {
		return "HeldItems [item=" + item + ", version_details=" + Arrays.toString(version_details) + "]";
	}

}
