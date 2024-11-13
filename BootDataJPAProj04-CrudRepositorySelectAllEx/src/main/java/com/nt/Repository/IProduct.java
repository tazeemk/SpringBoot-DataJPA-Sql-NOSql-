package com.nt.Repository;

import java.util.Iterator;

import org.springframework.data.repository.CrudRepository;

import com.nt.Entity.Product;

public interface IProduct extends CrudRepository<Product, Integer> 
{
	


}
