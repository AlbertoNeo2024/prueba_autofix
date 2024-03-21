package com.mifel.app.banca.data.encrypt;

public class DataEncryption {
	private String key;
	private String iv;
	private String encrypted;
	private String textPlain;

	public DataEncryption(String key, String iv, String encrypted, String textPlain) {
		super();
		this.key = key;
		this.iv = iv;
		this.encrypted = encrypted;
		this.textPlain = textPlain;
	}

	public DataEncryption() {
	}

	public String getTextPlain() {
		return textPlain;
	}

	public void setTextPlain(String textPlain) {
		this.textPlain = textPlain;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getIv() {
		return iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}

}
