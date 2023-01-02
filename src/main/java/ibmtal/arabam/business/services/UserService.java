package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.LoginDto;
import ibmtal.arabam.dtos.UserAddDto;
import ibmtal.arabam.dtos.UserDto;
import ibmtal.arabam.entity.User;

public interface UserService {
 Result<User> userAddDto(UserAddDto userAddDto);
 Result<UserDto> userLogin(LoginDto dto);
}
