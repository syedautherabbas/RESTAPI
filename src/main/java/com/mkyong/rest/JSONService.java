package com.mkyong.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Track;
import com.mkyong.UserObj;


@Path("/contactlist")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getuser() {

		ArrayList<UserObj> list=new ArrayList<UserObj>();
		UserObj u1=new UserObj();
		u1.setName("ather");
		u1.setMail("ather@gmail.com");
		u1.setAge("23");
		
		UserObj u2=new UserObj();
		u2.setName("rehan");
		u2.setMail("rehan@gmail.com");
		u2.setAge("24");
		
		UserObj u3=new UserObj();
		u3.setName("kazim");
		u3.setMail("kazim@gmail.com");
		u3.setAge("32");
		     
		
		
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		 return Response
		            .status(200)
		            .header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
		            .entity(list)
		            .build();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String name ) {

		String result = "Track saved : " + name;
		System.out.println(name+" TRACK");
		return Response.status(201).entity(result).build();
		
	}
	
}