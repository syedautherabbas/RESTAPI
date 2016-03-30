package com.mean.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mean.model.User;
import com.mean.services.UserService;


@Controller
@Path("/contactlist")
public class JSONService {

	@Autowired
	private UserService userservice;
	 public JSONService() {
	System.out.println("JSON CONSTRUCTIOB");
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getuser() {

		try{
			System.out.println("hi");
		System.out.println(userservice.getusers());
		}catch(Exception e)
		{
			  
			e.printStackTrace();
		}
		 return Response
		            .status(200)
		            .header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
		            .entity("hi")
		            .build();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(@ModelAttribute User user ) {

		String result = "User saved : " + user.getName();
		System.out.println(result);
		return Response.status(201).entity(result).build();
		
	}
	
}