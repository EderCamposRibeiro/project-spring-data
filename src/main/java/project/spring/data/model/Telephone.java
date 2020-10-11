package project.spring.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telephone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String type;
	
	@Column(nullable = false)
	private String number;
	
	@ManyToOne(optional = false)
	private UserSpringData userSpringData;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public UserSpringData getUserSpringData() {
		return userSpringData;
	}

	public void setUserSpringData(UserSpringData userSpringData) {
		this.userSpringData = userSpringData;
	}

	@Override
	public String toString() {
		return "Telephone [id=" + id + ", type=" + type + ", number=" + number + "]";
	}

	
}
