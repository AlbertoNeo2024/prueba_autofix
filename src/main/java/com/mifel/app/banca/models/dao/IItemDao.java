package com.mifel.app.banca.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mifel.app.banca.models.entity.ItemApp;


public interface IItemDao extends JpaRepository<ItemApp, Long> {

}
