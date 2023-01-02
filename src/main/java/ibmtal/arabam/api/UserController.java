package ibmtal.arabam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.arabam.business.services.UserService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.dtos.LoginDto;
import ibmtal.arabam.dtos.UserAddDto;
import ibmtal.arabam.dtos.UserDto;
import ibmtal.arabam.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping("/addUser")
	@GetMapping
	public Result<User> addUser(@RequestBody UserAddDto addDto){
		return this.userService.userAddDto(addDto);
	}
	@PostMapping("/login")
	@GetMapping
	public Result<UserDto> login(@RequestBody LoginDto loginDto){
		return this.userService.userLogin(loginDto);
	}
	
}
