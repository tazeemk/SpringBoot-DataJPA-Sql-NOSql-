package com.nt.Service;

import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.Entity.SuperMarket;
import com.nt.Repository.ISuperMarket;
@Service("service")
public class SuperMarketService implements  ISuperMarketService
{
	
	@Autowired
	private ISuperMarket marketrepo;

	
	
	
	
	@Override
	public String AddRecords(Iterable<SuperMarket> list) {
	
		   Iterable<SuperMarket>list1   = marketrepo.saveAll(list);
	long l	=StreamSupport.stream(list1.spliterator(), false).count();
		           
		           
		return l +":: Records are Inserted Successfully :";
	}
	
	
	
	
	//=============================================================
	//                          SORTING
	
	
	@Override
	public Iterable<SuperMarket> ShowSortRecord(boolean orDer, String... param) {
		// TODO Auto-generated method stub
		
		Sort sort = Sort.by(orDer?Direction.ASC:Direction.DESC, param);
		return   marketrepo.findAll(sort);
	}
	
	
	
	
	
	
	
	
	@Override
	public String UpdateRecordByid(int id,String pName) 
	{
		Optional<SuperMarket>opt=marketrepo.findById(id);
		if(opt.isPresent()) {
			  SuperMarket s =opt.get();
			  s.setPName(pName);
			marketrepo.save(s);
			return "Record Updated Successfully";
		}
		
		return "Sorry Id Not Found :";
	}
	
	
	
	
	
	
	//================================================
	//                       PAGING
	
	
	@Override
	public Page<SuperMarket> ShowPageByPage(int page, int count) {
		Pageable page1=PageRequest.of(page, count);
		
		Page<SuperMarket>s11=marketrepo.findAll(page1);
		return s11;
	}
	
	
	
	
	//     All Page In One Page
	
	
	@Override
	public void ShowAllProInOnePage(int countOnePageProperty,boolean order,String...strings ) {
		
		long countTotalProperty=marketrepo.count();
		
		long pagesSize  =countTotalProperty/countOnePageProperty;
		Sort sort = Sort.by(order?Direction.ASC:Direction.DESC, strings);
	       
		if(countTotalProperty%pagesSize!=0) 
			++pagesSize;;
			
			for(int i=0;i<pagesSize;++i)
			{
				
				Pageable page =PageRequest.of(i, countOnePageProperty,sort);
			
				System.out.println("Page No :"+(page.getPageNumber()+1)+"/"+pagesSize);
			   Page<SuperMarket>p	=marketrepo.findAll(page);
			  
			    p.getContent().forEach(System.out::println);
			
			}
			
			
			
		
		
	}
	
	
}
