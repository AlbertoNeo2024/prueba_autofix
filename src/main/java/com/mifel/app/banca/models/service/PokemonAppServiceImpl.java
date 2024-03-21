package com.mifel.app.banca.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonAppServiceImpl implements IPokemonService{

	String urlBase="https://pokeapi.co/api/v2/pokemon/";
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public String findOne(String id) {
		// TODO Auto-generated method stub
		String pokemon=restTemplate.getForEntity(urlBase+"/"+id, Object.class).getBody().toString();
		
		return pokemon;
		
		
		
	}

	
}
