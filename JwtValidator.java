//package com.rara.delivery.security;
//
//import org.springframework.stereotype.Component;
//
//import com.rara.delivery.security.model.JwtUser;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//
//@Component
//public class JwtValidator {
//
//	private String secret = "youtube";
//
//	public JwtUser validate(String token) {
//
//		JwtUser jwtUser = null;
//		try {
//			Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//
//			jwtUser = new JwtUser();
//
//			jwtUser.setUserName(body.getSubject());
//			jwtUser.setId(Long.parseLong((String) body.get("userId")));
//			jwtUser.setRole((String) body.get("role"));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		return jwtUser;
//	}
//}



package com.java.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}

