package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.LibraryMgtm;

public interface ILibraryMgmt extends JpaRepository<LibraryMgtm,Integer> 
{

  public List<LibraryMgtm>findByaNameEquals(String name);	
	
	public List<LibraryMgtm>findByaNameLike(String name);
	
	public List<LibraryMgtm>findByaNameStartingWith(String chars);
	
	public List<LibraryMgtm>findBybPriceBetween(int initi,int end);
	
	public List<LibraryMgtm>findBybIdIn(int[]arr );
}
