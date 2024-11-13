package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.Entity.CarFactory;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface ICarFactory extends CrudRepository<CarFactory, Integer> {

}
