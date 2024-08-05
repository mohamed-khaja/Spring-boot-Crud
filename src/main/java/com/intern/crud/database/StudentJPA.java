package com.intern.crud.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.crud.model.Students;

public interface StudentJPA extends JpaRepository <Students, Integer> {

    
} 
