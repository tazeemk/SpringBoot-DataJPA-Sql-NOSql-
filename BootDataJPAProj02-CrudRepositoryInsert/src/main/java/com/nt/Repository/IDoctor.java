package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctor;

public interface IDoctor extends CrudRepository<Doctor, Integer> 
{

}
