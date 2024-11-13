package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.Entity.SuperMarket;

public interface ISuperMarket extends CrudRepository<SuperMarket, Integer>, PagingAndSortingRepository<SuperMarket, Integer> {

	
}
