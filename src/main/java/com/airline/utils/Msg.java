package com.airline.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Chaofan
 * 
 */
public class Msg {
//	status code，100-success，200-failed，
	private int code;
//	message
	private String msg;
//	data to browser
	private Map<String, Object> data = new HashMap<String, Object>();
	
	public static Msg success() {
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("success");
		return result;
	}

	public static Msg fail() {
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("fail");
		return result;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public Msg add(String key, Object value) {
		this.getData().put(key, value);
		return this;
	}
}
