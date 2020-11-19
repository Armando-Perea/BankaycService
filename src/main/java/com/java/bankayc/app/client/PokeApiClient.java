package com.java.bankayc.app.client;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.java.bankayc.app.model.Pokemon;

@Service
public class PokeApiClient {

	public static Logger logger = Logger.getLogger(PokeApiClient.class.getName());
	
	public static final String SYSTEM_URL = "https://pokeapi.co/api/v2";
	
	public Pokemon getInfo(String name) {
		HttpHeaders headers = new HttpHeaders();
		Pokemon pokemon = new Pokemon();
		try {
			headers.setContentType(MediaType.APPLICATION_JSON);
			RestTemplate restTemplate = new RestTemplate();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	        
			String url = SYSTEM_URL + "/pokemon/{name}";
			HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
			ResponseEntity<Pokemon> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
					Pokemon.class, name);
			pokemon = responseEntity.getBody();
			return pokemon;
		} catch (Exception ex) {
			logger.info("Error at PokeApiClient: "+ex);
			return null;
		}
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		PokeApiClient pokeApiClient = new PokeApiClient();
		Pokemon pokemon = pokeApiClient.getInfo("ditto");
		
		System.out.println("POKEMON RESP : "+pokemon);
	}
}
