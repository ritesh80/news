package com.pyr.news.service.accnt;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.pyr.news.hib.model.acnt.Account;
import com.pyr.news.hib.model.acnt.Role;
import com.pyr.news.hib.model.acnt.User;

@Component
public class LoginManagerService implements UserDetailsService {

	@Autowired
	private AccountService accountService;

	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Account account = accountService.getAccountByLogin(login);
		User[] users = (User[])account.getUserAccounts().toArray();
		User user = users[0];
		if(user == null){
			throw new UsernameNotFoundException(login + " not found");
		}
		List<SimpleGrantedAuthority> grantAuthories = new java.util.ArrayList<SimpleGrantedAuthority>();
		grantAuthories.add(new SimpleGrantedAuthority("Admin"));
		Iterator itrRoles = user.getUserRoleses().iterator();
		while(itrRoles.hasNext()){
			Role role =(Role)itrRoles.next();
			grantAuthories.add(new SimpleGrantedAuthority(role.getName()));
		}
		UserDetails userd = new org.springframework.security.core.userdetails.User(account.getLogin(), account.getPassword(), true, true, true, true, grantAuthories);
		return userd;
	}
}
