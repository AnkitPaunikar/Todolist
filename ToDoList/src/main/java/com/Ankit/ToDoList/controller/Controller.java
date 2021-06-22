package com.Ankit.ToDoList.controller;

import java.util.List;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ankit.ToDoList.model.Iteams;
import com.Ankit.ToDoList.repo.todorepo;

@RestController
@RequestMapping(value = "/todo")

public class Controller {
	private Long id;
	@Autowired
	
	private todorepo Todorepo;
	
	@GetMapping
	public List<Iteams> findAll(){
	
		return Todorepo.findAll();
	}
	
	
	
	
	@PostMapping
	public Iteams save(@Valid @NotNull @RequestBody Iteams todoiteams) {
		return Todorepo.save(todoiteams);
	}
	
	@PutMapping
	public Iteams update(@Valid @NotNull @RequestBody Iteams todoiteams ) {
	return Todorepo.save(todoiteams);
}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		Todorepo.deleteById(id);
	}
	
}
