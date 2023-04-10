package dev.pfe.spring.login.payload.response;

import lombok.Getter;

import java.util.List;


@Getter
public class UserInfoResponse {
	private Long id;
	private String firstName;

	private String lastName;

	private String username;

	private int cin;

	private String email;

	private int phone;

	private final List<String> roles;

	public UserInfoResponse(Long id, String firstName, String lastName, String username, int cin, String email, int phone, List<String> roles) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.cin = cin;
		this.email = email;
		this.phone = phone;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}
}
