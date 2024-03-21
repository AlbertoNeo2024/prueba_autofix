package com.mifel.app.banca.models.service;

import java.util.List;

import com.mifel.app.banca.models.entity.ItemApp;

public interface IItemsAppService {

	public List<ItemApp> findAll();

	public void save(ItemApp cliente);
	
	public ItemApp findOne(int id);
	
	public void delete(Long id);
	
}
