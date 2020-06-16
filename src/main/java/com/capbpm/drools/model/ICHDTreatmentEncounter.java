package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ICHDTreatmentEncounter implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Date treatmentDate;
	public Double postTreatmentWeight;
	public List<MedicationAdministration> administeredMedications;

	public Date getTreatmentDate(){
		return this.treatmentDate;
	}

	public void setTreatmentDate(Date treatmentDate){
		this.treatmentDate = treatmentDate;
	}

	public Double getPostTreatmentWeight(){
		return this.postTreatmentWeight;
	}

	public void setPostTreatmentWeight(Double postTreatmentWeight){
		this.postTreatmentWeight = postTreatmentWeight;
	}

	public List<MedicationAdministration> getAdministeredMedications(){
		return this.administeredMedications;
	}

	public void setAdministeredMedications(List<MedicationAdministration> administeredMedications){
		this.administeredMedications = administeredMedications;
	}
}
