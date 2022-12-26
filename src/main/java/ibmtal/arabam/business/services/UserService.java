package ibmtal.arabam.business.services;

import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.UserAddDto;
import ibmtal.arabam.entity.User;

public interface UserService {
 Result<User> userAddDto(UserAddDto userAddDto);
 
}
