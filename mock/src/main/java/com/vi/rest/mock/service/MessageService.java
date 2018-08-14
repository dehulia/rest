package com.vi.rest.mock.service;

import java.util.ArrayList;
import java.util.List;

import com.vi.rest.mock.model.Message;

public class MessageService {

	public List<Message> getAllMessage() {
		
		Message m1 = new Message(1L, "Hello world !" , "Vinay D");
		Message m2 = new Message(2L, "Hello Automation test !" , "Vinay");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
		
	}
}
