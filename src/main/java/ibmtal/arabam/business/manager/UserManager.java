package ibmtal.arabam.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.arabam.business.services.UserService;
import ibmtal.arabam.core.result.Result;
import ibmtal.arabam.database.UserDao;
import ibmtal.arabam.dtos.UserAddDto;
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
         return result;
	}

}
