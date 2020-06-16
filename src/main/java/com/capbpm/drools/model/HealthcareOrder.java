package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.davita.protocol.HealthcareOrderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class HealthcareOrder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public HealthcareOrderType odmOrderType;
	public Frequency frequency;
	public List<String> justifications;
	public Integer collaboratingPhysicianId;
	public String orderSource;
	public Date startDate;
	public Date endDate;
	public Date discontinueDate;
	public String discontinueOrderSource;
	public String status;
	public Date lastReviewDate;
	public Integer healthcareOrderId;
	public Integer parentOrderId;
	public Integer providerId;

	public HealthcareOrderType getOdmOrderType(){
		return this.odmOrderType;
	}

	public void setOdmOrderType(HealthcareOrderType odmOrderType){
		this.odmOrderType = odmOrderType;
	}

	public Frequency getFrequency(){
		return this.frequency;
	}

	public void setFrequency(Frequency frequency){
		this.frequency = frequency;
	}

	public List<String> getJustifications(){
		return this.justifications;
	}

	public void setJustifications(List<String> justifications){
		this.justifications = justifications;
	}

	public Integer getCollaboratingPhysicianId(){
		return this.collaboratingPhysicianId;
	}

	public void setCollaboratingPhysicianId(Integer collaboratingPhysicianId){
		this.collaboratingPhysicianId = collaboratingPhysicianId;
	}

	public String getOrderSource(){
		return this.orderSource;
	}

	public void setOrderSource(String orderSource){
		this.orderSource = orderSource;
	}

	public Date getStartDate(){
		return this.startDate;
	}

	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}

	public Date getEndDate(){
		return this.endDate;
	}

	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}

	public Date getDiscontinueDate(){
		return this.discontinueDate;
	}

	public void setDiscontinueDate(Date discontinueDate){
		this.discontinueDate = discontinueDate;
	}

	public String getDiscontinueOrderSource(){
		return this.discontinueOrderSource;
	}

	public void setDiscontinueOrderSource(String discontinueOrderSource){
		this.discontinueOrderSource = discontinueOrderSource;
	}

	public String getStatus(){
		return this.status;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public Date getLastReviewDate(){
		return this.lastReviewDate;
	}

	public void setLastReviewDate(Date lastReviewDate){
		this.lastReviewDate = lastReviewDate;
	}

	public Integer getHealthcareOrderId(){
		return this.healthcareOrderId;
	}

	public void setHealthcareOrderId(Integer healthcareOrderId){
		this.healthcareOrderId = healthcareOrderId;
	}

	public Integer getParentOrderId(){
		return this.parentOrderId;
	}

	public void setParentOrderId(Integer parentOrderId){
		this.parentOrderId = parentOrderId;
	}

	public Integer getProviderId(){
		return this.providerId;
	}

	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
}
