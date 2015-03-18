package foyuang.elibrary.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**  
 * TBooks entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_books", catalog = "elibrary")
public class Books implements java.io.Serializable {

	// Fields
    @org.springframework.data.annotation.Id
	private Integer id;
	private String name;
	private Integer content;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** full constructor */
	public Books(String name, Integer content, Timestamp createTime) {
		this.name = name;
		this.content = content;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "content", nullable = false)
	public Integer getContent() {
		return this.content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	@Column(name = "create_time", nullable = false, length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}