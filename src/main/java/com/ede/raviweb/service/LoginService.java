		/**
 * 
 */
package com.ede.raviweb.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ede.raviweb.hibernate.dao.LoginDao;
import com.ede.raviweb.hibernate.entity.LoginEntity;

/**
 * @author ravik
 *
 */
@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	@Autowired
	LoginEntity loginEdeModel;
	public void loginService(String username,String password) throws Exception
	{
		if(username == null || username.length() < 8 || password == null || password.length() < 8)
		{
			throw new Exception("Not meeting minimum requirements ");
		}
		try
		{
			
		loginEdeModel.setUsername(username);
		loginEdeModel.setPassword(password);
		loginEdeModel.setCreatedOn(new Date());
		loginEdeModel.setIsActive(1);
		loginEdeModel.setIsAdmin("Y");
		
		
		
		loginDao.createLoginEde(loginEdeModel);
		}
		catch(Exception ex)
		{
			System.out.println("Exception in edeLoginService : "+ex);
		}
	}

}
