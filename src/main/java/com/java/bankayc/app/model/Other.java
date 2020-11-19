package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Other {
	
	DreamWorld dream_world;
	
	@JsonProperty("official-artworld") 
	OfficialArtWork official_artworld;

	public DreamWorld getDream_world() {
		return dream_world;
	}

	public void setDream_world(DreamWorld dream_world) {
		this.dream_world = dream_world;
	}

	public OfficialArtWork getOfficial_artworld() {
		return official_artworld;
	}

	public void setOfficial_artworld(OfficialArtWork official_artworld) {
		this.official_artworld = official_artworld;
	}

	@Override
	public String toString() {
		return "Other [dream_world=" + dream_world + ", official_artworld=" + official_artworld + "]";
	}

}
