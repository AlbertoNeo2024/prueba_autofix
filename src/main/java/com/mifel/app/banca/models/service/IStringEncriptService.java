package com.mifel.app.banca.models.service;

import com.mifel.app.banca.data.encrypt.DataEncryption;

public interface IStringEncriptService{

	public DataEncryption encrypt(DataEncryption dataEncryption);
	
	public DataEncryption decrypt(DataEncryption dataEncryption);
	
}
