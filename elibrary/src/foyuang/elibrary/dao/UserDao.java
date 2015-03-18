package foyuang.elibrary.dao;
import java.util.List;

import org.springframework.data.repository.Repository;

import foyuang.elibrary.entity.User;

/**
 * A data access object (DAO) providing persistence and search support for TUser
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.fuyoung.elibrary.entity.User
 * @author MyEclipse Persistence Tools
 */

public interface UserDao extends Repository<User, Long>{
	public User save(User arg0);
	public List<User> findAll();
	
}