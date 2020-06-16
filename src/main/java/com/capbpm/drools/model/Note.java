package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Note implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public String type;
	public String text;

	public String getType(){
		return this.type;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getText(){
		return this.text;
	}

	public void setText(String text){
		this.text = text;
	}
}
