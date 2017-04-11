package com.suren.springBootApp.controller;

import com.suren.springBootApp.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/user/details/xml",produces = MediaType.APPLICATION_XML_VALUE)
	public User getUserInXML() {

		User user = new User();
		user.setUsername("babu");
		user.setPassword("password009");
		user.setPin(123456);

		return user;
	}

    @RequestMapping(value = "/user/details/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserInJSON() {

        User user = new User();
        user.setUsername("suren");
        user.setPassword("password006");
        user.setPin(123456);

        return user;
    }
}