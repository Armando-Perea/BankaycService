package com.java.bankayc.app.repo.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.java.bankayc.app.client.PokeApiClient;
import com.java.bankayc.app.model.Abilities;
import com.java.bankayc.app.model.HeldItems;
import com.java.bankayc.app.model.Pokemon;

@Component
public class ResponseBuilder {
	
	private final static String POKEMON_DOESNT_EXIST="Pokemon Does not Exist";
	
	private final static String NO_LOCATION_AREA_FOUND="No Location Area Found";
	
	RequestRepoImpl requestRepoImpl;
	
	PokeApiClient pokeApiClient;
	
	public ResponseBuilder(RequestRepoImpl requestRepoImpl, PokeApiClient pokeApiClient) {
		this.requestRepoImpl = requestRepoImpl;
		this.pokeApiClient = pokeApiClient;
	}

	public List<Abilities> saveRequestAndGetAbilitiesList(String name) {
		List<Abilities> abilitiesList = new ArrayList<>();
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/getAbilities"));
			abilitiesList = Arrays.asList(pokemon.getAbilities());
			return abilitiesList;
		}
		return abilitiesList;
	}
	
	public Integer saveRequestAndGetIdPokemon(String name) {	
		Integer pokemonId=000;
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/id"));
			return pokemon.getId();
		}
		return pokemonId;
	}
	
	public Integer saveRequestAndGetBaseExperience(String name) {	
		Integer baseExp=000;
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/getBaseExperience"));
			return pokemon.getBase_experience();
		}
		return baseExp;
	}
	
	public List<HeldItems> saveRequestAndGetHelItemsList(String name) {	
		List<HeldItems> heldItemsList = new ArrayList<>();
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/getHeldItems"));
			heldItemsList = Arrays.asList(pokemon.getHeld_items());
			return heldItemsList;
		}
		return heldItemsList;
	}
	
	public String saveRequestAndGetPokemonName(String name) {	
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/getName"));
			return  pokemon.getName();
		}
		return POKEMON_DOESNT_EXIST;
	}
	
	public String saveRequestAndGetLocationAreaEncounters(String name) {
		Pokemon pokemon = pokeApiClient.getInfo(name);
		if(pokemon!=null) {
			requestRepoImpl.saveRequests(RequestBuilder.getRequest("/getLocationAreaEncounters"));
			return pokemon.getLocation_area_encounters();
		}
		return NO_LOCATION_AREA_FOUND;
	}
}
