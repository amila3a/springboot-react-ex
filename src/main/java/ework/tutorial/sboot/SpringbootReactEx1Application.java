package ework.tutorial.sboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ework.tutorial.sboot.foreact.model.User;
import ework.tutorial.sboot.foreact.repository.UserRepository;

@SpringBootApplication
public class SpringbootReactEx1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactEx1Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepo.save(new User("amila","asiri","am@cc.com"));
		this.userRepo.save(new User("sandani","hasa","sa@cc.com"));
		this.userRepo.save(new User("insith","abey","in@cc.com"));
	}
	
	

}
