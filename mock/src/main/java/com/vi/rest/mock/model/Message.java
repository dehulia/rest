package com.vi.rest.mock.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	@XmlElement private long id;
	@XmlElement private String message;
	@XmlElement private Date created;
	@XmlElement private String author;
	
	public Message() {
	//no opt constructor
	}
	
	public Message(long id, String message, String author) {
		this.id=id;
		this.message= message;
		this.author = author;
		this.created= new Date();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
}
