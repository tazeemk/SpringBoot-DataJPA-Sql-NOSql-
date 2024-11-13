package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.Entity.Delivery;

public interface IDelivery extends CrudRepository<Delivery, Integer> {

}