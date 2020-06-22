package com.learning.springsecurityjwt;

import com.learning.springsecurityjwt.entity.User;
import com.learning.springsecurityjwt.reposittory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {
	@Autowired
	private UserRepository userRepository;
	@PostConstruct
	public void initUser()
	{
		List<User> users= Stream.of(new User("manoj","password"),
				new User("manoj1","pass1"),
				new User("manoj2","pass2")).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
