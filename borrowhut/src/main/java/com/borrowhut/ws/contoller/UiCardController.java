package com.borrowhut.ws.contoller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.borrowhut.ws.exception.UiCardNotFoundException;
import com.borrowhut.ws.service.UicardService;

@Component
@Path("/getStream")
public class UiCardController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UiCardController.class);
	private final UicardService uicardService;
	@Inject
	public  UiCardController(final UicardService uicardService){
		this.uicardService = uicardService;
		
		
	}
	
	@GET
	@Path("/partyid/{partyid}/userlocation/{userlocation}")
	@Produces("application/json")
		public JSONArray getAllListedProductsBypartyid(@PathParam("partyid") int partyid,@PathParam("pamauthid") String pamauthid,@PathParam("userlocation") String userLocation) throws NumberFormatException, UiCardNotFoundException {
		LOGGER.debug("get stream for party " + partyid);
	String[] lanlat	= userLocation.split(",");
	LOGGER.debug("latitude"+lanlat[0].toString());
	LOGGER.debug("latitude"+lanlat[1].toString());
	
		return uicardService.getUicard(partyid,  Float.parseFloat(lanlat[0].toString()),Float.parseFloat(lanlat[1].toString()));
	}
	
}