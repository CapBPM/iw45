package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.davita.protocol.OptionType;
import com.davita.protocol.PerProtocolOrderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class PerProtocolOrder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public PerProtocolOrderType odmOrderType;
	public Date decisionDate;
	public Boolean requiresReview;
	public List<Note> notes;
	public List<String> evaluatedIds;
	public Integer editsOrder;
	public Integer parentProtocolId;
	public Frequency frequency;
	public List<String> justifications;
	public List<OptionType> options;
	public Date actionCompletedDate;

	public PerProtocolOrderType getOdmOrderType(){
		return this.odmOrderType;
	}

	public void setOdmOrderType(PerProtocolOrderType odmOrderType){
		this.odmOrderType = odmOrderType;
	}

	public Date getDecisionDate(){
		return this.decisionDate;
	}

	public void setDecisionDate(Date decisionDate){
		this.decisionDate = decisionDate;
	}

	public Boolean getRequiresReview(){
		return this.requiresReview;
	}

	public void setRequiresReview(Boolean requiresReview){
		this.requiresReview = requiresReview;
	}

	public List<Note> getNotes(){
		return this.notes;
	}

	public void setNotes(List<Note> notes){
		this.notes = notes;
	}

	public List<String> getEvaluatedIds(){
		return this.evaluatedIds;
	}

	public void setEvaluatedIds(List<String> evaluatedIds){
		this.evaluatedIds = evaluatedIds;
	}

	public Integer getEditsOrder(){
		return this.editsOrder;
	}

	public void setEditsOrder(Integer editsOrder){
		this.editsOrder = editsOrder;
	}

	public Integer getParentProtocolId(){
		return this.parentProtocolId;
	}

	public void setParentProtocolId(Integer parentProtocolId){
		this.parentProtocolId = parentProtocolId;
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

	public List<OptionType> getOptions(){
		return this.options;
	}

	public void setOptions(List<OptionType> options){
		this.options = options;
	}

	public Date getActionCompletedDate(){
		return this.actionCompletedDate;
	}

	public void setActionCompletedDate(Date actionCompletedDate){
		this.actionCompletedDate = actionCompletedDate;
	}
}
