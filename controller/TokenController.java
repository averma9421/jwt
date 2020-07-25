package com.rara.delivery.security.controller;

import java.lang.ref.WeakReference;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rara.delivery.security.JwtGenerator;
import com.rara.delivery.security.model.JwtUser;

@RestController
public class TokenController {

	private JwtGenerator jwtGenerator;

	public TokenController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}

	@RequestMapping("/generate/{mobileNo}/{role}")
	public String getToken(@PathVariable("mobileNo") Long mobileNo, @PathVariable("role") String role) {

		// @RequestBody final JwtUser jwtUser
		JwtUser jwtUser = new JwtUser();
		jwtUser.setId(mobileNo);
		jwtUser.setUserName("RaRa");
		jwtUser.setRole(role);

		WeakReference<JwtUser> stoken = new WeakReference<JwtUser>(jwtUser);
		String token = jwtGenerator.generate(stoken.get());
		jwtUser = null;
		System.gc();
		return "{\"token\":\"" + token + "\"}";
	}

}
