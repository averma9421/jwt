package com.rara.delivery.security.config;

public interface PasswordEncoder {

	String encode(CharSequence rawPassword);
    boolean matches(CharSequence rawPassword, String encodedPassword);
}
