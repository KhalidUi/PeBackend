package contactmanager.blog.serviceImplement;

import java.util.List;
import java.util.stream.Collectors;

import contactmanager.blog.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import contactmanager.blog.dto.UserDto;
import contactmanager.blog.entity.Users;
import contactmanager.blog.repositories.UserRepository;
import contactmanager.blog.servicie.UserService;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository uRepo;

	@Override
	public UserDto createUsers(UserDto userDto) {

		
			
		
		Users users = this.dtoToUsers(userDto);

		Users savedUser = this.uRepo.save(users);
		  return  this.touserDto(savedUser);
		//return  "successfully added user " ;
		
		

	}

	@Override
	public UserDto updateUsers(UserDto userDto, Integer userId) {
		Users user = this.uRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Users", "Id", userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());

		Users updateUsers = this.uRepo.save(user);

		UserDto uDto1 = this.touserDto(updateUsers);

		return uDto1;
	}

	@Override
	public UserDto getUsersById(Integer userId) {

		Users user = this.uRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Users", "Id", userId));

		return this.touserDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<Users> users = this.uRepo.findAll();
		List<UserDto> dtos = users.stream().map(user -> this.touserDto(user)).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public void deleteUsers(Integer userId) {
		Users users = this.uRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Users", "Id", userId));
		this.uRepo.delete(users);
	}

	// dtoToUsers = dtoToUsers ;
	public Users dtoToUsers(UserDto userDto) {
		Users users = new Users();
		users.setId(userDto.getId());
		users.setName(userDto.getName());
		users.setEmail(userDto.getEmail());
		users.setPassword(userDto.getPassword());
		users.setAbout(userDto.getAbout());
		return users;

	}

	// userToDto = touserDto ;
	public UserDto touserDto(Users users) {
		UserDto userDto = new UserDto();
		userDto.setId(users.getId());
		userDto.setName(users.getName());
		userDto.setAbout(users.getAbout());
		userDto.setEmail(users.getEmail());
		userDto.setPassword(users.getPassword());

		return userDto;

	}

}
