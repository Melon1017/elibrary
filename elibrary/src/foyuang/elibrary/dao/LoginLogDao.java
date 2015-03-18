package foyuang.elibrary.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import foyuang.elibrary.entity.LoginLog;

public interface LoginLogDao extends Repository<LoginLog, Long> {
	public List<LoginLog> findAll();

	public LoginLog save(LoginLog log);

}
