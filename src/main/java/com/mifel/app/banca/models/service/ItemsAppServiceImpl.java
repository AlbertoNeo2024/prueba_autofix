package com.mifel.app.banca.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mifel.app.banca.models.dao.IItemDao;
import com.mifel.app.banca.models.entity.ItemApp;

@Service
public class ItemsAppServiceImpl implements IItemsAppService{

	@Autowired
	private IItemDao itemApp;
	
	@Override
	@Transactional(readOnly = true)
	public List<ItemApp> findAll() {
		// TODO Auto-generated method stub
		return (List<ItemApp>) itemApp.findAll() ;
	}

	@Override
	public void save(ItemApp cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly = true)
	public ItemApp findOne(int id) {
		// TODO Auto-generated method stub
		return itemApp.findById((long)id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	


}
