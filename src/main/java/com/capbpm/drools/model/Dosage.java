package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Dosage implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public Double dose;
	public String doseUnit;
	public String route;
	public String subRoute;
	public String doseType;

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

	public String getSubRoute(){
		return this.subRoute;
	}

	public void setSubRoute(String subRoute){
		this.subRoute = subRoute;
	}

	public String getDoseType(){
		return this.doseType;
	}

	public void setDoseType(String doseType){
		this.doseType = doseType;
	}
}
