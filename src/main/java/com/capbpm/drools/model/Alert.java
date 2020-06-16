package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Alert implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public String message;
	public String type;

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getType(){
		return this.type;
	}

	public void setType(String type){
		this.type = type;
	}
}
