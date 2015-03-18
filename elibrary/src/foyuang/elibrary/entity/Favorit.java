package foyuang.elibrary.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**  
 * TFavorit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_favorit", catalog = "elibrary")
public class Favorit implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer bookId;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Favorit() {
	}

	/** minimal constructor */
	public Favorit(Integer userId, Integer bookId) {
		this.userId = userId;
		this.bookId = bookId;
	}

	/** full constructor */
	public Favorit(Integer userId, Integer bookId, Timestamp createTime) {
		this.userId = userId;
		this.bookId = bookId;
		this.createTime = createTime;
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

	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "book_id", nullable = false)
	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Column(name = "create_time", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}