package com.java.bankayc.app.model;

import java.util.Arrays;

public class Moves {
	
	Move move;
	
	VersionGroupDetails [] version_group_details;

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

	public VersionGroupDetails[] getVersion_group_details() {
		return version_group_details;
	}

	public void setVersion_group_details(VersionGroupDetails[] version_group_details) {
		this.version_group_details = version_group_details;
	}

	@Override
	public String toString() {
		return "Moves [move=" + move + ", version_group_details=" + Arrays.toString(version_group_details) + "]";
	}
	
}
