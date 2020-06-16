package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class MissedTreatment implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Date date;

	public Date getDate(){
		return this.date;
	}

	public void setDate(Date date){
		this.date = date;
	}
}
