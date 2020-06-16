package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.davita.protocol.LabTestStatusType;
import com.davita.protocol.PositiveNegativeResultType;
import com.davita.protocol.ResultComparatorType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class LabTestResult implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Date datePosted;
	public Double result;
	public String unitOfMeasure;
	public Integer parentHealthcareOrderId;
	public Date drawDate;
	public String id;
	public String labId;
	public LabTestStatusType testStatus;
	public PositiveNegativeResultType positiveNegativeResult;
	public ResultComparatorType resultQualifier;
	public String codeId;

	public Date getDatePosted(){
		return this.datePosted;
	}

	public void setDatePosted(Date datePosted){
		this.datePosted = datePosted;
	}

	public Double getResult(){
		return this.result;
	}

	public void setResult(Double result){
		this.result = result;
	}

	public String getUnitOfMeasure(){
		return this.unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure){
		this.unitOfMeasure = unitOfMeasure;
	}

	public Integer getParentHealthcareOrderId(){
		return this.parentHealthcareOrderId;
	}

	public void setParentHealthcareOrderId(Integer parentHealthcareOrderId){
		this.parentHealthcareOrderId = parentHealthcareOrderId;
	}

	public Date getDrawDate(){
		return this.drawDate;
	}

	public void setDrawDate(Date drawDate){
		this.drawDate = drawDate;
	}

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getLabId(){
		return this.labId;
	}

	public void setLabId(String labId){
		this.labId = labId;
	}

	public LabTestStatusType getTestStatus(){
		return this.testStatus;
	}

	public void setTestStatus(LabTestStatusType testStatus){
		this.testStatus = testStatus;
	}

	public PositiveNegativeResultType getPositiveNegativeResult(){
		return this.positiveNegativeResult;
	}

	public void setPositiveNegativeResult(PositiveNegativeResultType positiveNegativeResult){
		this.positiveNegativeResult = positiveNegativeResult;
	}

	public ResultComparatorType getResultQualifier(){
		return this.resultQualifier;
	}

	public void setResultQualifier(ResultComparatorType resultQualifier){
		this.resultQualifier = resultQualifier;
	}

	public String getCodeId(){
		return this.codeId;
	}

	public void setCodeId(String codeId){
		this.codeId = codeId;
	}
}
