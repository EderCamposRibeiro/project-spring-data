package project.spring.data.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserSpringData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String login;
	
	private String password;
	
	private String name;
	
	private String email;

	private int age;
	
	@OneToMany(mappedBy = "userSpringData", orphanRemoval = true, fetch = FetchType.EAGER)
	private List<Telephone> telephones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	
	public List<Telephone> getTelephones() {
		return telephones;
	}

	@Override
	public String toString() {
		return "UserSpringData [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", age=" + age + ", telephones=" + telephones + "]";
	}


	
	
	
}
