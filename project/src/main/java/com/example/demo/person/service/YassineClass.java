package com.example.demo.person.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  YassineClass extends CrudRepository<Person, Integer>{
	public List<Person> findByfirstName(String nom);
		
		
		
		
	}
	
	


