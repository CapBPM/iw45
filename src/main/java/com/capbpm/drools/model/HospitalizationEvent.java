package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class HospitalizationEvent implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Date admitDate;
	public Date dischargeDate;

	public Date getAdmitDate(){
		return this.admitDate;
	}

	public void setAdmitDate(Date admitDate){
		this.admitDate = admitDate;
	}

	public Date getDischargeDate(){
		return this.dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate){
		this.dischargeDate = dischargeDate;
	}
}
