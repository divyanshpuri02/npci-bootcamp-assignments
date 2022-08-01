package com.npci.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.npci.rest.api.entity.Department;

@RepositoryRestResource(path = "dep")
@CrossOrigin("http://localhost:4200/")
public interface DepartmentDAO  extends JpaRepository<Department, Integer> {
	
}
























