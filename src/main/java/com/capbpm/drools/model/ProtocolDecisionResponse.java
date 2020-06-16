package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.davita.protocol.OptionType;
import com.davita.protocol.ReviewType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ProtocolDecisionResponse implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public String optionalDisplayData;
	public List<Alert> alerts;
	public List<PerProtocolOrder> perProtocolOrders;
	public List<Note> notes;
	public ReviewType protocolOrderDueForReview;
	public List<OptionType> options;
	public String masterPatientIdentifier;
	public String facilityNumber;

	public String getOptionalDisplayData(){
		return this.optionalDisplayData;
	}

	public void setOptionalDisplayData(String optionalDisplayData){
		this.optionalDisplayData = optionalDisplayData;
	}

	public List<Alert> getAlerts(){
		return this.alerts;
	}

	public void setAlerts(List<Alert> alerts){
		this.alerts = alerts;
	}

	public List<PerProtocolOrder> getPerProtocolOrders(){
		return this.perProtocolOrders;
	}

	public void setPerProtocolOrders(List<PerProtocolOrder> perProtocolOrders){
		this.perProtocolOrders = perProtocolOrders;
	}

	public List<Note> getNotes(){
		return this.notes;
	}

	public void setNotes(List<Note> notes){
		this.notes = notes;
	}

	public ReviewType getProtocolOrderDueForReview(){
		return this.protocolOrderDueForReview;
	}

	public void setProtocolOrderDueForReview(ReviewType protocolOrderDueForReview){
		this.protocolOrderDueForReview = protocolOrderDueForReview;
	}

	public List<OptionType> getOptions(){
		return this.options;
	}

	public void setOptions(List<OptionType> options){
		this.options = options;
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
