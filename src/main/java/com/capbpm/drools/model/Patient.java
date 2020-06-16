package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Patient implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public List<HealthcareOrder> orders;
	public List<LabTestResult> labTestResults;
	public List<PerProtocolOrder> perProtocolHistory;
	public HospitalizationEvent latestHospitalizationEvent;
	public List<ICHDTreatmentEncounter> ichdTreatmentEncounters;
	public List<MissedTreatment> missedTreatments;
	public Date admissionDate;
	public Integer numberOfPatientTreatmentsPerWeek;

	public List<HealthcareOrder> getOrders(){
		return this.orders;
	}

	public void setOrders(List<HealthcareOrder> orders){
		this.orders = orders;
	}

	public List<LabTestResult> getLabTestResults(){
		return this.labTestResults;
	}

	public void setLabTestResults(List<LabTestResult> labTestResults){
		this.labTestResults = labTestResults;
	}

	public List<PerProtocolOrder> getPerProtocolHistory(){
		return this.perProtocolHistory;
	}

	public void setPerProtocolHistory(List<PerProtocolOrder> perProtocolHistory){
		this.perProtocolHistory = perProtocolHistory;
	}

	public HospitalizationEvent getLatestHospitalizationEvent(){
		return this.latestHospitalizationEvent;
	}

	public void setLatestHospitalizationEvent(HospitalizationEvent latestHospitalizationEvent){
		this.latestHospitalizationEvent = latestHospitalizationEvent;
	}

	public List<ICHDTreatmentEncounter> getIchdTreatmentEncounters(){
		return this.ichdTreatmentEncounters;
	}

	public void setIchdTreatmentEncounters(List<ICHDTreatmentEncounter> ichdTreatmentEncounters){
		this.ichdTreatmentEncounters = ichdTreatmentEncounters;
	}

	public List<MissedTreatment> getMissedTreatments(){
		return this.missedTreatments;
	}

	public void setMissedTreatments(List<MissedTreatment> missedTreatments){
		this.missedTreatments = missedTreatments;
	}

	public Date getAdmissionDate(){
		return this.admissionDate;
	}

	public void setAdmissionDate(Date admissionDate){
		this.admissionDate = admissionDate;
	}

	public Integer getNumberOfPatientTreatmentsPerWeek(){
		return this.numberOfPatientTreatmentsPerWeek;
	}

	public void setNumberOfPatientTreatmentsPerWeek(Integer numberOfPatientTreatmentsPerWeek){
		this.numberOfPatientTreatmentsPerWeek = numberOfPatientTreatmentsPerWeek;
	}
}
