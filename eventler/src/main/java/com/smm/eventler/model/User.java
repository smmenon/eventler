package com.smm.eventler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Size(min = 3, max = 80)
	@Column(name = "EMAIL", nullable = false)
	@Email(message = "Invalid Email Address")
	private String email;

	@NotNull
	@Size(min = 2, max = 80)
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@NotEmpty
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@NotEmpty
	@Size(min = 8, max = 20)
	/*@Pattern.List({
	    @Pattern(regexp = "(?=.*[0-9])", message = "Password must contain one digit."),
	    @Pattern(regexp = "(?=.*[a-z])", message = "Password must contain one lowercase letter."),
	    @Pattern(regexp = "(?=.*[A-Z])", message = "Password must contain one uppercase letter."),
	    @Pattern(regexp = "(?=\\S+$)", message = "Password must contain no whitespace.")
	})*/
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	public User() {
	}

	public User(long id) {
		this.id = id;
	}

	public User(String email, String firstName, String lastName, String password) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long value) {
		this.id = value;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

} // class User