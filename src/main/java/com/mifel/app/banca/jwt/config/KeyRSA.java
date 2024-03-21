package com.mifel.app.banca.jwt.config;

import java.io.ByteArrayInputStream;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.converter.RsaKeyConverters;
import org.springframework.stereotype.Component;

@Component
public class KeyRSA {

	@Value("${rsa.private-key}")
	private String publicKey;
	
	@Value("${rsa.public-key}")
	private String privateKey;
	
	public RSAPrivateKey convertPrivateKey() {
        return RsaKeyConverters.pkcs8().convert(new ByteArrayInputStream(privateKey.getBytes()));
    }
	
	public RSAPublicKey convertPublicKey() {
        return RsaKeyConverters.x509().convert(new ByteArrayInputStream(publicKey.getBytes()));
    }
	
}
