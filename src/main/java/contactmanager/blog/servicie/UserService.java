package contactmanager.blog.servicie;

import java.util.List;

import contactmanager.blog.dto.UserDto;

public interface UserService {
	
	UserDto createUsers(UserDto userDto) ;
	
	UserDto updateUsers(UserDto userDto , Integer userId );
	
	UserDto getUsersById(Integer userId) ;
	
	List<UserDto> getAllUsers();
	
	void deleteUsers (Integer useId) ;

}
