package springMVC.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.Dao.UserDao;
import springMVC.Model.User;

@Service
public class UserService 
{
	@Autowired
	UserDao userDao;
	
	@Transactional
	public int createUser(User user)
	{
		return this.userDao.saveUser(user);
	}
}
