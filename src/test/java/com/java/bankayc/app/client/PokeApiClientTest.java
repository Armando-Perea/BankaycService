package com.java.bankayc.app.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.bankayc.app.model.Pokemon;

public class PokeApiClientTest {

	PokeApiClient pokeApiClient = new PokeApiClient();
	
	@Test
	public void getInfoTest() {
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		assertNotNull(pokemon);
		assertEquals("ditto",pokemon.getName());
		assertEquals(Integer.valueOf(101),pokemon.getBase_experience());
	}
	
	@Test
	public void getInfoTestNotFound() {
		Pokemon pokemon = pokeApiClient.getInfo("xxx");
		assertNull(pokemon);
	}
	
	@Test
	public void getInfoTestNull() {
		Pokemon pokemon = pokeApiClient.getInfo(null);
		assertNull(pokemon.getName());
	}

}
