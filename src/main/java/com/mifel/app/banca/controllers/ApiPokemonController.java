package com.mifel.app.banca.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.app.banca.models.entity.ItemApp;
import com.mifel.app.banca.models.service.IItemsAppService;
import com.mifel.app.banca.models.service.IPokemonService;

@RestController
public class ApiPokemonController {
	
	@Autowired
	private IPokemonService pokemonService;


	@GetMapping(value = "/personaje/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Object personaje(@PathVariable String id) {
		return pokemonService.findOne(id).toString();
	}
	
}
