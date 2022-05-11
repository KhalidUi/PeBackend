package contactmanager.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import contactmanager.blog.dto.UserDto;
import contactmanager.blog.servicie.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService serve ;
	
	//Post-Create User 
	@PostMapping("/createUser")
	public ResponseEntity<UserDto> createUsers(@RequestBody UserDto userDto){
		UserDto  createUserDto = this.serve.createUsers(userDto);
		return new ResponseEntity< >(createUserDto,HttpStatus.CREATED);
	}
	
}
