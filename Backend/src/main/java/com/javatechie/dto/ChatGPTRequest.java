package com.javatechie.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatGPTRequest {

    private String model;
    private List<Message> messages;

    public ChatGPTRequest(String model, String prompt) {
        this.setModel(model);
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
