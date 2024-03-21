package com.mifel.app.banca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.app.banca.models.entity.ItemApp;
import com.mifel.app.banca.models.service.IItemsAppService;

@RestController
public class ItemsController {
	
	@Autowired
	private IItemsAppService itemService;
	
	@GetMapping(value="/item",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ItemApp> items() {
		return itemService.findAll();
		}

	@GetMapping(value = "/item/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ItemApp item(@PathVariable int id) {
		return itemService.findOne(id);
		}
	
}
