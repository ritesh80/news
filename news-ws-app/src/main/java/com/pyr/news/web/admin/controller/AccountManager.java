package com.pyr.news.web.admin.controller;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.pyr.news.hib.model.acnt.User;
import com.pyr.news.service.accnt.AccountService;

@Path("/manage/account")
public class AccountManager {

	@Autowired
	private AccountService accountService;

	@Path("/user/get/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") int id) {
		return null;
	}

	/*
	 * @Path("/user/add") @Produces(MediaType.APPLICATION_XML) public boolean
	 * insertUser(UserDTO user) {
	 * 
	 * }
	 */
}
