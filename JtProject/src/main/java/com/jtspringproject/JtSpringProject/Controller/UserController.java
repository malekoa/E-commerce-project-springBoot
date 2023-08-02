package com.jtspringproject.JtSpringProject.Controller;

import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class UserController{
	@Autowired
	private UserService service;

	@PostMapping("/register")
	public String newUserRegister(@RequestParam("username") String username,@RequestParam("password") String password)
	{// TODO - hash password before saving
		try
		{
			User newUser = new User();
			newUser.setUsername(username);
			newUser.setPassword(password);
			service.createUser(newUser);
			return "redirect:/home";
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
			return "redirect:/error";
		}
	}

}
