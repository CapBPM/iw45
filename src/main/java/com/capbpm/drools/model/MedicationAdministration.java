package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class MedicationAdministration implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Integer parentOrderId;
	public Double dose;
	public String doseUnit;
	public String route;
	public String davitaStatus;
	public Medication medication;

	public Integer getParentOrderId(){
		return this.parentOrderId;
	}

	public void setParentOrderId(Integer parentOrderId){
		this.parentOrderId = parentOrderId;
	}

	public Double getDose(){
		return this.dose;
	}

	public void setDose(Double dose){
		this.dose = dose;
	}

	public String getDoseUnit(){
		return this.doseUnit;
	}

	public void setDoseUnit(String doseUnit){
		this.doseUnit = doseUnit;
	}

	public String getRoute(){
		return this.route;
	}

	public void setRoute(String route){
		this.route = route;
	}

	public String getDavitaStatus(){
		return this.davitaStatus;
	}

	public void setDavitaStatus(String davitaStatus){
		this.davitaStatus = davitaStatus;
	}

	public Medication getMedication(){
		return this.medication;
	}

	public void setMedication(Medication medication){
		this.medication = medication;
	}
}
