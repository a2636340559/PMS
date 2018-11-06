package com.pms.modal;

import org.json.JSONObject;

public abstract class AbstractJson {

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private int code;
	private String message;
	public abstract JSONObject toJson();
}
