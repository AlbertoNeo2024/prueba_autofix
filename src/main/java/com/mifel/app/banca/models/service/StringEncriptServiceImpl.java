package com.mifel.app.banca.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mifel.app.banca.data.encrypt.DataEncryption;
import com.mifel.app.banca.data.encrypt.StringEncript;

@Service
public class StringEncriptServiceImpl implements IStringEncriptService{

	@Autowired
	private StringEncript encrypt;
	
	@Override
    public DataEncryption encrypt(DataEncryption dataEncryption){
				
		try {
			dataEncryption.setEncrypted(encrypt.encrypt(dataEncryption.getKey(),dataEncryption.getIv() , dataEncryption.getTextPlain()));
		} catch (Exception e) {
			dataEncryption.setEncrypted("ocurrio un error");
			e.printStackTrace();
		}
		return dataEncryption;
    }

	@Override
    public DataEncryption decrypt(DataEncryption dataEncryption){
		try {
			dataEncryption.setTextPlain(encrypt.decrypt(dataEncryption.getKey(),dataEncryption.getIv() , dataEncryption.getEncrypted()));
		} catch (Exception e) {
			dataEncryption.setEncrypted("ocurrio un error");
			e.printStackTrace();
		}
		return dataEncryption;
    }

	
}
