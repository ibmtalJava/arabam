package ibmtal.arabam.business.manager;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import ibmtal.arabam.business.services.UserService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.database.UserDao;
import ibmtal.arabam.dtos.LoginDto;
import ibmtal.arabam.dtos.UserAddDto;
import ibmtal.arabam.dtos.UserDto;
import ibmtal.arabam.entity.User;


@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result<User> userAddDto(UserAddDto userAddDto) {
         Result<User> result=new Result<>();
         if (userAddDto.getUsername().isBlank()) {
        	 result.newError("Username", "kullanıcı adı boş geçilemez");
         }
         if (userAddDto.getUsername().length()>=100) {
        	 result.newError("UserName", "Kullanıcı adı 100 karakterden fazla olmaz");
         }
		 if(userAddDto.getPassword().equals(userAddDto.getRePassword())==false) {
			 result.newError("RePassword", "Şifreler uyuşmuyor");
		 }
		 if(userAddDto.getPassword().isBlank()) {
			 result.newError("Password", "Şifre Boş Geçilemez.");
		 }
		 if(userAddDto.getPassword().length()>150) {
			 result.newError("Password", "Şifre Çok Uzun.");
		 }
		 if(userAddDto.getName().isBlank()) {
			 result.newError("Name", "İsim Boş Geçilemez.");
		 }
		 if(userAddDto.getName().length()>50) {
			 result.newError("Name", "İsim 50 Karakterden Fazla Olamaz.");
		 }
		 if(userAddDto.getSurname().isBlank()) {
			 result.newError("Surname", "Soyisim Boş Geçilemez.");
		 }
		 if(userAddDto.getSurname().length()>50) {
			 result.newError("Surname", "Soyisim 50 Karakterden Fazla Olamaz.");
		 }
		 if(this.userDao.findByUsername(userAddDto.getUsername())!=null) {
			 result.newError("username","Kullanıcı adı zaten kullanılıyor");
		 }
		 if(result.isSuccess()) {
			 User user=new User();
			 user.setUsername(userAddDto.getUsername());
			 user.setPassword(userAddDto.getPassword());
			 user.setName(userAddDto.getName());
			 user.setSurname(userAddDto.getSurname());
			 user.setBirthday(userAddDto.getBirthday());
			 user.setCountry(userAddDto.getCountry());
			 user.setPhoto(userAddDto.getPhoto());
			 user.setGender(userAddDto.getGender());
			 user.setPhone(userAddDto.getPhone());
			 user.setTc(userAddDto.getTc());
			 this.userDao.save(user);
		
		
			
		 }
         return result;
	}

	@Override
	public Result<UserDto> userLogin(LoginDto dto) {
		Result<UserDto> result=new Result<>();
		User usernameUser=new User();
		User passwordUser=new User();
		usernameUser=this.userDao.findByUsernameAndPassword(dto.getUsername(),dto.getPassword());
		if(usernameUser==null) {
			result.newError("username","kullanıcı bulunamadı");
		}
		
		return result;
	}

}
