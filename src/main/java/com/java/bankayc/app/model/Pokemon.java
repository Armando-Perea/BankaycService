package com.java.bankayc.app.model;

import java.util.Arrays;

public class Pokemon {
	
	Abilities [] abilities;
	
	Integer base_experience;
	
	Forms [] forms;
	
	GameIndices [] game_indices;
	
	Integer height;
	
	HeldItems [] held_items;
	
	Integer id;
	
	Boolean is_default;
	
	String location_area_encounters;
	
	Moves [] moves;

	String name;
	
	Integer order;
	
	Species species;
	
	Sprites sprites;
	
	Stats [] stats;
	
	Types [] types;
	
	Integer weight;

	public Abilities[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities[] abilities) {
		this.abilities = abilities;
	}

	public Integer getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	public Forms[] getForms() {
		return forms;
	}

	public void setForms(Forms[] forms) {
		this.forms = forms;
	}

	public GameIndices[] getGame_indices() {
		return game_indices;
	}

	public void setGame_indices(GameIndices[] game_indices) {
		this.game_indices = game_indices;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public HeldItems[] getHeld_items() {
		return held_items;
	}

	public void setHeld_items(HeldItems[] held_items) {
		this.held_items = held_items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIs_default() {
		return is_default;
	}

	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public Moves[] getMoves() {
		return moves;
	}

	public void setMoves(Moves[] moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Sprites getSprites() {
		return sprites;
	}

	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	public Stats[] getStats() {
		return stats;
	}

	public void setStats(Stats[] stats) {
		this.stats = stats;
	}

	public Types[] getTypes() {
		return types;
	}

	public void setTypes(Types[] types) {
		this.types = types;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pokemon [abilities=" + Arrays.toString(abilities) + ", base_experience=" + base_experience + ", forms="
				+ Arrays.toString(forms) + ", game_indices=" + Arrays.toString(game_indices) + ", height=" + height
				+ ", held_items=" + Arrays.toString(held_items) + ", id=" + id + ", is_default=" + is_default
				+ ", location_area_encounters=" + location_area_encounters + ", moves=" + Arrays.toString(moves)
				+ ", name=" + name + ", order=" + order + ", species=" + species + ", sprites=" + sprites + ", stats="
				+ Arrays.toString(stats) + ", types=" + Arrays.toString(types) + ", weight=" + weight + "]";
	}

}
