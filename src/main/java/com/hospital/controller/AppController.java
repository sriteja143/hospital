package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hospital.model.User;
import com.hospital.repository.UserRepository;
 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    
    @GetMapping("/test")
    public ResponseEntity<String> test() {
    	System.out.println("Test");
        return new ResponseEntity<String>("GURU TEJA", HttpStatus.OK);
    }
     
    @GetMapping("/userDetails")
    public ResponseEntity<List<User>> viewHomePage() {
    	System.out.println("Test");
    	return new ResponseEntity<List<User>>(userRepo.findAll(), HttpStatus.OK);
       // return userRepo.findAll();
    }

    @PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		System.out.print("WLEOMEEEEE");
			user.setPassword(
					passwordEncoder.encode(user.getPassword())
					);
		return ResponseEntity.ok("User saved with id"+userRepo.save(user).getId());
	}
    
    @PostMapping("/register")
    public String processRegister(User user) {
      // BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       String encodedPassword = passwordEncoder.encode(user.getPassword());
       user.setPassword(encodedPassword);
       userRepo.save(user);
       return "register_success";
    }
}
