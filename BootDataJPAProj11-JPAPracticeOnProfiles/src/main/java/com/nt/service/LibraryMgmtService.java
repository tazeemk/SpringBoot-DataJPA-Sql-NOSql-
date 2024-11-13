package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.LibraryMgtm;
import com.nt.repository.ILibraryMgmt;

@Service("service")
public class LibraryMgmtService implements ILibraryService {

	@Autowired
	private ILibraryMgmt libraryRepo;

	@Override
	public String addBooks(Iterable<LibraryMgtm> list) {

		Iterable<LibraryMgtm> list1 = libraryRepo.saveAll(list);

		long l = StreamSupport.stream(list1.spliterator(), false).count();

		return l + ":Records Are Inserted :";
	}

	@Override
	public Page<LibraryMgtm> ShowInPage(int pno, int size) {
		Pageable page1 = PageRequest.of(pno, size);
		Page<LibraryMgtm>list=libraryRepo.findAll(page1);
		return list;
	}

	@Override
	public List<LibraryMgtm> GetFilterData(String bName,String lName, boolean orDer, String... param) {
	Sort sort = Sort.by(orDer?Direction.ASC:Direction.DESC, param);
		LibraryMgtm l = new LibraryMgtm();
		l.setBName(bName);
		l.setLName(lName);
		Example<LibraryMgtm>example = Example.of(l);
		List<LibraryMgtm>list1=libraryRepo.findAll(example,sort);
		return list1;
	}
	@Override
	public String DeletePartially(int ids,String bName) {
		Optional<LibraryMgtm>list=libraryRepo.findById(ids);
		if(list.isPresent()){
			 LibraryMgtm out = list.get();
			out.setBName(bName);
			 libraryRepo.save(out);
		return "Successully Deleted :";
		}else {
			return "Wrong Id :";
		}
	
	}

}
