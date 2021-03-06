package com.capbpm.drools.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.capbpm.drools.service.MainService;
import com.davita.protocol.*;

@Path("/api/v1")
public class MainController {

	@POST
	@Path("/process/Main")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)	
	public ProtocolDecisionResponse process(ProtocolDecisionRequest req){
		return MainService.getInstance().calculate(req);
	}
}
