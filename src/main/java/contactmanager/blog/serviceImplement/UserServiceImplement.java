package contactmanager.blog.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import contactmanager.blog.dto.UserDto;
import contactmanager.blog.entity.Users;
import contactmanager.blog.repositories.UserRepository;
import contactmanager.blog.servicie.UserService;

public class UserServiceImplement  implements UserService{

	@Autowired
	private UserRepository  uRepo ;
	
	@Override
	public UserDto createUsers(UserDto userDto) {
		
		Users users = this.dtoToUsers(userDto);
		
		Users savedUser = this.uRepo.save(users);
		return this.touserDto(savedUser);
	}

	@Override
	public UserDto updateUsers(UserDto userDto, Integer userId) {
		
		
		return null;
	}

	@Override
	public UserDto getUsersById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsers(Integer useId) {
		// TODO Auto-generated method stub
		
	}
	
	public Users dtoToUsers(UserDto userDto) {
		Users users = new Users ();
		users.setId(userDto.getId());
		users.setName(userDto.getName());
		users.setEmail(userDto.getEmail());
		users.setPassword(userDto.getPassword());
		users.setAbout(userDto.getAbout());
		return users ;
		
	}
	
	public UserDto touserDto(Users users) {
		UserDto userDto = new UserDto ();
		userDto.setId(users.getId());
		userDto.setName(users.getName());
		userDto.setAbout(users.getAbout());
		userDto.setEmail(users.getEmail());
		userDto.setPassword(users.getPassword());
		
		return userDto ;
		
	}

	

}
