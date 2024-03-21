package com.mifel.app.banca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.app.banca.data.encrypt.DataEncryption;
import com.mifel.app.banca.models.service.IStringEncriptService;

@RestController
public class EncryptController {
	
	@Autowired
	private IStringEncriptService encriptService;

	@PostMapping(value="/encrypt",produces = MediaType.APPLICATION_JSON_VALUE, consumes=  MediaType.APPLICATION_JSON_VALUE)
	public DataEncryption encrypt(@RequestBody DataEncryption dataEncryption) {
		return encriptService.encrypt(dataEncryption);
		}
	
	@PostMapping(value="/decrypt",produces = MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
	public DataEncryption encriptService(@RequestBody DataEncryption dataEncryption) {
		return encriptService.decrypt(dataEncryption);
		}
	
	
}
