package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

	private String role;
    private String content;//prompt
	public String getRole() {
		return role;
	}
	public Message(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
