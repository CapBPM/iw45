package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class MedicationAdministrationOrder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Dosage dosage;
	public Integer numberOfAdministrations;
	public String administrationLocation;
	public Integer stopTimeBeforeEndOfTreatment;
	public String methodOfDelivery;
	public Medication medication;

	public Dosage getDosage(){
		return this.dosage;
	}

	public void setDosage(Dosage dosage){
		this.dosage = dosage;
	}

	public Integer getNumberOfAdministrations(){
		return this.numberOfAdministrations;
	}

	public void setNumberOfAdministrations(Integer numberOfAdministrations){
		this.numberOfAdministrations = numberOfAdministrations;
	}

	public String getAdministrationLocation(){
		return this.administrationLocation;
	}

	public void setAdministrationLocation(String administrationLocation){
		this.administrationLocation = administrationLocation;
	}

	public Integer getStopTimeBeforeEndOfTreatment(){
		return this.stopTimeBeforeEndOfTreatment;
	}

	public void setStopTimeBeforeEndOfTreatment(Integer stopTimeBeforeEndOfTreatment){
		this.stopTimeBeforeEndOfTreatment = stopTimeBeforeEndOfTreatment;
	}

	public String getMethodOfDelivery(){
		return this.methodOfDelivery;
	}

	public void setMethodOfDelivery(String methodOfDelivery){
		this.methodOfDelivery = methodOfDelivery;
	}

	public Medication getMedication(){
		return this.medication;
	}

	public void setMedication(Medication medication){
		this.medication = medication;
	}
}
