package com.capbpm.drools.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.capbpm.drools.model.MedicationAdministrationOrder;
import com.capbpm.drools.service.MainService;

@Path("/api/v1")
public class MainController {

	@POST
	@Path("/process/Main")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)	
	public MedicationAdministrationOrder process(MedicationAdministrationOrder activeMedicationOrder){
		return MainService.getInstance().calculate(activeMedicationOrder);
	}
}
