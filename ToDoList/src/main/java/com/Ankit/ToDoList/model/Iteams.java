package com.Ankit.ToDoList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.context.annotation.Bean;




@Entity
public class Iteams {
	
	
	private Long id;
	@NotBlank 
	private String title;
	private boolean done;
	
	
	
	public Iteams() {
		super();
	}
	
	
	public Iteams(Long id, String title, boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.done = done;
	}

	@Id	
	@GeneratedValue
	public Long getId() {
		
		return id;
	}
	public String getTitle() {
		return title;
	}
	public boolean isDone() {
		return done;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
