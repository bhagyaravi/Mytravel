package com.test.quarkus.rest;

import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.transaction.Transactional;

import com.test.quarkus.model.Flight;

@Path("/flight")
public class FlightResource {

	@GET
	@Path("/search")
	 public Response searchFlights(@QueryParam("fromcity") String fromcity, @QueryParam("tocity") String tocity,@QueryParam("date") Date date) {
	
		System.out.println("From City is :" + fromcity);
		System.out.println("To City is :" + tocity);
		System.out.println("Date is :" + date);
		Map<String, Object> params = new HashMap<>(); 
		 params.put("fromcity", fromcity); 
		 params.put("tocity", tocity);
		return Response.ok(Flight.list("fromcity = :fromcity and tocity = :tocity", params)).build();
	}
	 
	@POST
	@Path("/add")
	@Transactional
	public Response addFlight(Flight flight) {
		flight.persist();
		Jsonb jsonb = JsonbBuilder.create();
		System.out.println("Flight Details are :" + jsonb.toJson(flight));
		return Response.ok(flight).status(201).build();
	}
	
}
