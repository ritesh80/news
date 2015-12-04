package com.pyr.news.web.admin.controller;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pyr.news.basic.dto.UserDTO;
import com.pyr.news.hib.model.acnt.User;
import com.pyr.news.service.accnt.AccountService;

@Path("/manage/account")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Component
public class AccountManager {

	@Autowired
	private AccountService accountService;

	@Autowired
	Mapper dozerBeanMapper;

	@Path("/user/get/{id}")
	@GET
	public UserDTO getUser(@PathParam("id") int id) {
		return dozerBeanMapper.map(accountService.getUser(id), UserDTO.class);
	}

	@Path("/user/add")
	@POST
	public boolean insertUser(@Valid UserDTO user) {
		User userdao = dozerBeanMapper.map(user, User.class);
		accountService.addUser(userdao);
		return true;

	}

	@Path("/user/update")
	@POST
	public boolean updateUser(@Valid UserDTO user) {
		User usr = accountService.getUser(user.getId());
		dozerBeanMapper.map(user, usr);
		accountService.updateUser(usr);
		return false;

	}

	@Path("/user/delete/{id}")
	@DELETE
	public boolean deleteUser(@PathParam("id") int id) {
		accountService.removeUser(accountService.getUser(id));
		return true;

	}

}
