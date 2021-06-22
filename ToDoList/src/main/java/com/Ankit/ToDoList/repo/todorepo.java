package com.Ankit.ToDoList.repo;

import org.springframework.data.jpa.repository.JpaRepository;



import com.Ankit.ToDoList.model.Iteams;

public interface todorepo extends JpaRepository<Iteams , Long> {
	
	

}
