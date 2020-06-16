package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ProtocolDecisionRequest implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Patient patient;
	public Date currentDate;
	public String facilityPreferredLabId;
	public FacilityDrawSchedule facilityDrawSchedule;
	public String masterPatientIdentifier;
	public String facilityNumber;

	public Patient getPatient(){
		return this.patient;
	}

	public void setPatient(Patient patient){
		this.patient = patient;
	}

	public Date getCurrentDate(){
		return this.currentDate;
	}

	public void setCurrentDate(Date currentDate){
		this.currentDate = currentDate;
	}

	public String getFacilityPreferredLabId(){
		return this.facilityPreferredLabId;
	}

	public void setFacilityPreferredLabId(String facilityPreferredLabId){
		this.facilityPreferredLabId = facilityPreferredLabId;
	}

	public FacilityDrawSchedule getFacilityDrawSchedule(){
		return this.facilityDrawSchedule;
	}

	public void setFacilityDrawSchedule(FacilityDrawSchedule facilityDrawSchedule){
		this.facilityDrawSchedule = facilityDrawSchedule;
	}

	public String getMasterPatientIdentifier(){
		return this.masterPatientIdentifier;
	}

	public void setMasterPatientIdentifier(String masterPatientIdentifier){
		this.masterPatientIdentifier = masterPatientIdentifier;
	}

	public String getFacilityNumber(){
		return this.facilityNumber;
	}

	public void setFacilityNumber(String facilityNumber){
		this.facilityNumber = facilityNumber;
	}
}
