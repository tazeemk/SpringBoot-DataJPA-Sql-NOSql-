package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.LibraryMgtm;

public interface ILibraryMgmt extends PagingAndSortingRepository<LibraryMgtm, Integer>,CrudRepository<LibraryMgtm, Integer>,JpaRepository<LibraryMgtm,Integer> {

}
