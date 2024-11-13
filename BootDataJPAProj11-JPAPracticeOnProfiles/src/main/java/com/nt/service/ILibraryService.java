package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;

import com.nt.entity.LibraryMgtm;

public interface ILibraryService {

	public String addBooks(Iterable<LibraryMgtm>list);
	
	public Page<LibraryMgtm> ShowInPage(int pno,int size);
	
	public List<LibraryMgtm> GetFilterData(String bName,String lName,boolean orDer,String...param);
	
	public String DeletePartially(int ids,String bName);
}
