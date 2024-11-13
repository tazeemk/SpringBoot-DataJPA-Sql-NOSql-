package com.nt.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Mobile_Info;
import com.nt.repository.IMobile_Info;

@Service("service")
public class Mobile_InfoService implements IMobile_InfoService {

	@Autowired
	private IMobile_Info mobileRepo;

	@Override
	public String AddMoreRecords(Iterable<Mobile_Info> list) {

		Iterable<Mobile_Info> list1 = mobileRepo.saveAllAndFlush(list);
		long l = StreamSupport.stream(list1.spliterator(), false).count();

		return l + ":Records Inserted :";
	}

	@Override
	public String RemoveRecord(Iterable<Integer> list) {
		List<Mobile_Info> i = mobileRepo.findAllById(list);

		mobileRepo.deleteAllByIdInBatch(list);

		return i.size() + "Record deleted";

	}

	@Override
	public List<Mobile_Info> ShowRecordAfterFilter(int page,int count,String name, String price,boolean order,String...param){
		
		Pageable pag = PageRequest.of(page, count);
		             List<Mobile_Info>list1=(List<Mobile_Info>)mobileRepo.findAll(pag);
		            
		Sort sort= Sort.by(order?Direction.ASC: Direction.DESC, param);
		Mobile_Info m = new Mobile_Info();
		
		m.setMCompany(name);
		m.setMConfig(price);

		Example<Mobile_Info> example = Example.of(m);
		List m4 = mobileRepo.findAll(example,sort);

		m4.add(list1);
		return m4 ;
	}

}
