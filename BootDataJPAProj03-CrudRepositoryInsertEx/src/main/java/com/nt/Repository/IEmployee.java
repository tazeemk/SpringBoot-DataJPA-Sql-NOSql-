package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.Entity.Employee;

public interface IEmployee extends CrudRepository<Employee, Integer> 
{

	
}
