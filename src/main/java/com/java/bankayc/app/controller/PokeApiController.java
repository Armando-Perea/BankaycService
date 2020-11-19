package com.java.bankayc.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.bankayc.app.model.Abilities;
import com.java.bankayc.app.model.HeldItems;
import com.java.bankayc.app.repo.impl.ResponseBuilder;

@RestController
@RequestMapping("pokeapi/")
public class PokeApiController {
	
	ResponseBuilder responseBuilder;
	
	public PokeApiController(ResponseBuilder responseTransformer) {
		this.responseBuilder = responseTransformer;
	}

	@GetMapping("/getAbilities/{name}")
	public List<Abilities> getAbilities(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetAbilitiesList(name);
	}
	
	@GetMapping("/id/{name}")
	public Integer getId(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetIdPokemon(name);
	}
	
	@GetMapping("/getBaseExperience/{name}")
	public Integer getBaseExperience(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetBaseExperience(name);
	}
	
	@GetMapping("/getHeldItems/{name}")
	public List<HeldItems> getHeldItems(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetHelItemsList(name);
	}
	
	@GetMapping("/getName/{name}")
	public String getName(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetPokemonName(name);
	}
	
	@GetMapping("/getLocationAreaEncounters/{name}")
	public String getLocationAreaEncounters(@PathVariable String name) {
		return responseBuilder.saveRequestAndGetLocationAreaEncounters(name);
	}
	
}
