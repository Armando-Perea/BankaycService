package com.java.bancayc.repository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.bankayc.app.client.PokeApiClient;
import com.java.bankayc.app.model.Abilities;
import com.java.bankayc.app.model.HeldItems;
import com.java.bankayc.app.model.Pokemon;
import com.java.bankayc.app.model.Requests;
import com.java.bankayc.app.repo.impl.RequestBuilder;
import com.java.bankayc.app.repo.impl.RequestRepoImpl;
import com.java.bankayc.app.repo.impl.ResponseBuilder;
import com.java.bankayc.app.repository.RequestRepository;

public class ResponseBuilderTest {
	
	@Mock
	RequestRepository requestRepository;
	
	@Mock
	RequestRepoImpl requestRepoImpl;

	@Mock
	ResponseBuilder responseBuilder;
	
	PokeApiClient pokeApiClient = new PokeApiClient();
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        responseBuilder = new ResponseBuilder(requestRepoImpl, pokeApiClient);
    }
	
	@Test
	public void saveRequestAndGetAbilitiesListTest() {
		List<Abilities> abilitiesList = new ArrayList<>();
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/getAbilities");
		abilitiesList = responseBuilder.saveRequestAndGetAbilitiesList("ditto");
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);
		assertNotNull(abilitiesList);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}
	
	@Test
	public void saveRequestAndGetIdPokemonTest() {
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/id");
		Integer id = responseBuilder.saveRequestAndGetIdPokemon("ditto");
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);
		assertNotNull(id);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}
	
	@Test
	public void saveRequestAndGetBaseExperienceTest() {
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/getBaseExperience");
		Integer base = responseBuilder.saveRequestAndGetBaseExperience("ditto");
		
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);

		assertNotNull(base);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}
	
	@Test
	public void saveRequestAndGetHelItemsListTest() {
		List<HeldItems> heldItemsList = new ArrayList<>();
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/getHeldItems");
		heldItemsList = responseBuilder.saveRequestAndGetHelItemsList("ditto");
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);

		assertNotNull(heldItemsList);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}
	
	@Test
	public void saveRequestAndGetPokemonNameTest() {
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/getName");
		String name = responseBuilder.saveRequestAndGetPokemonName("ditto");
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);

		assertNotNull(name);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}
	
	@Test
	public void saveRequestAndGetLocationAreaEncountersTest() {
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		Requests requests = RequestBuilder.getRequest("/getLocationAreaEncounters");
		String locationArea = responseBuilder.saveRequestAndGetLocationAreaEncounters("ditto");
		when(requestRepoImpl.saveRequests(requests)).thenReturn(requests);

		assertNotNull(locationArea);
		assertNotNull(requests);
		assertNotNull(pokemon);
	}

}
