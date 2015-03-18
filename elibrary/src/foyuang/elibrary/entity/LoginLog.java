package foyuang.elibrary.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TLoginLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_login_log", catalog = "elibrary")
public class LoginLog implements java.io.Serializable {
  
	// Fields

	private Integer id;
	private Integer uid;
	private Timestamp loginTime;
	private String ip;
	private Boolean device;

	// Constructors

	/** default constructor */
	public LoginLog() {
	}

	/** minimal constructor */
	public LoginLog(Integer uid, Timestamp loginTime) {
		this.uid = uid;
		this.loginTime = loginTime;
	}

	/** full constructor */
	public LoginLog(Integer uid, Timestamp loginTime, String ip, Boolean device) {
		this.uid = uid;
		this.loginTime = loginTime;
		this.ip = ip;
		this.device = device;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "uid", nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "login_time", nullable = false, length = 19)
	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	@Column(name = "ip", length = 50)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "device")
	public Boolean getDevice() {
		return this.device;
	}

	public void setDevice(Boolean device) {
		this.device = device;
	}

}