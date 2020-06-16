package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Frequency implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public String id;
	public String codeId;
	public String displayName;
	public String description;

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getCodeId(){
		return this.codeId;
	}

	public void setCodeId(String codeId){
		this.codeId = codeId;
	}

	public String getDisplayName(){
		return this.displayName;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDescription(){
		return this.description;
	}

	public void setDescription(String description){
		this.description = description;
	}
}
