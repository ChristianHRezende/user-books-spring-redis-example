package br.com.chrezende.userBooks.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chrezende.userBooks.domain.User;
import br.com.chrezende.userBooks.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserResource {
	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<Iterable<User>> getAllUsers() {
		return new ResponseEntity<Iterable<User>>(userRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> createUser(@RequestBody User user){
		userRepository.save(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
