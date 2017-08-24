/**
 * 
 */
package com.ede.raviweb.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ede.raviweb.service.LoginService;

/**
 * @author ravik
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	LoginService loginService;
	@RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(ModelMap model) {
		System.out.println("Login **********************");
        return "Login";
    }
 
    @RequestMapping(value="/welcome", method = RequestMethod.POST)
    public ModelAndView welcome(@RequestParam("username") String username,@RequestParam("password") String password, ModelMap model) throws Exception {
    	System.out.println("Welcome  **********************");
    	ModelAndView mv = new ModelAndView();
    	
		loginService.loginService(username, password);

		mv.setViewName("Welcome");
		mv.addObject("username", username);
      	//model.addAttribute("username", username);
        return mv; 
    }
	
}
