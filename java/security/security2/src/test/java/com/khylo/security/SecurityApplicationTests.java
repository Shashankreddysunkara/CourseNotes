package com.khylo.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SecurityApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testBcrypt(){
		System.out.println("Encoded password = "+ new BCryptPasswordEncoder().encode("password"));
	}

}
