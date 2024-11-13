package com.nt.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Emp")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee 
{
	    
  
	@Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	public Integer EMPNO;
	
	public String ENAME;
    
	public String JOB;

	public Double SAL;
	
}
