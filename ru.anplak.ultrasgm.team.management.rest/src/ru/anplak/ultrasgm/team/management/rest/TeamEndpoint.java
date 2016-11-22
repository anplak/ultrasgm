package ru.anplak.ultrasgm.team.management.rest;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

@Path("/team")
public class TeamEndpoint {
	
	@POST
	@Consumes({"application/json"})
	@Transactional
	public Response createTeam(Team team){
		System.out.println(team);
		return Response.created(UriBuilder.fromResource(TeamEndpoint.class).
				path(String.valueOf(team.getId())).build()).build();
	}
	
	@GET
	@Produces({"application/json"})
	@Path("{id}")
	public Team getTeam(@PathParam("id") Long id){
		
		return new Team(id, "testTeam", "yoou");
	}
}
