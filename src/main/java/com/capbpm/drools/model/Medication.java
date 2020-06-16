package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Medication implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public String codeId;
	public String medispanId;

	public String getCodeId(){
		return this.codeId;
	}

	public void setCodeId(String codeId){
		this.codeId = codeId;
	}

	public String getMedispanId(){
		return this.medispanId;
	}

	public void setMedispanId(String medispanId){
		this.medispanId = medispanId;
	}
}
