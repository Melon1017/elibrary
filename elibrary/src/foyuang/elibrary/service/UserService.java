package foyuang.elibrary.service;

import java.util.List;

import foyuang.elibrary.entity.User;

public interface UserService {
	public void regist(User user);
	public boolean userLogin(String userName,String password);
	public User updateUserProfile(User updatedUser);
	public User upgradeToVip(User vipUser);
	public List<User> listAllUser();
}
