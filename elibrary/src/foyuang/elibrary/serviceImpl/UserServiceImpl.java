package foyuang.elibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import foyuang.elibrary.dao.UserDao;
import foyuang.elibrary.entity.User;
@Service("userService")
public class UserServiceImpl implements foyuang.elibrary.service.UserService {
	@Autowired
	UserDao userDao;

	public void regist(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean userLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User updateUserProfile(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public User upgradeToVip(User vipUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
