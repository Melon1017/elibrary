package foyuang.elibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import foyoung.elibrary.common.ErrorCode;
import foyuang.elibrary.dao.UserDao;
import foyuang.elibrary.entity.User;
import foyuang.elibrary.util.DataRegexUtil;

@Service("userService")
public class UserServiceImpl implements foyuang.elibrary.service.UserService {
	@Autowired
	UserDao userDao;

	public int regist(User user) {
		// TODO Auto-generated method stub
		String phone = user.getPhone();
		String password = user.getPhone();
		if (phone == null || phone.length() > 50 || phone.isEmpty()||!DataRegexUtil.checkPhone(phone)) {
			return ErrorCode.USER_PHONE_VAILD;
		}
		if (password == null || password.length() > 50 || password.isEmpty()) {
			return ErrorCode.USER_PASSWORD_VAILD;
		}
		user.setName(password);
		userDao.save(user);
		return ErrorCode.SUCCESS;
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
