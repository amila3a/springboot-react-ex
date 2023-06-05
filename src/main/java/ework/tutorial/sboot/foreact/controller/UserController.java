package ework.tutorial.sboot.foreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ework.tutorial.sboot.foreact.model.User;
import ework.tutorial.sboot.foreact.repository.UserRepository;

/**
 * Created for D:\workspace\vscode\react\react-forsboot
 * @author Amila
 *
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@GetMapping("users")
	public List<User> getUsers(){
		
//		this.userRepo.save(new User("amila","asiri","am@cc.com"));
//		this.userRepo.save(new User("sandani","hasa","sa@cc.com"));
//		this.userRepo.save(new User("insith","abey","in@cc.com"));
//		System.out.println("users saved");
		
		List<User> userList = this.userRepo.findAll();
		
		for(User user: userList) {
			System.out.println(user.getFirstName());
		}
		
		return userList;
	}
}
