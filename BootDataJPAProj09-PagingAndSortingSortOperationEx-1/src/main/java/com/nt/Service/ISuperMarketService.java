package com.nt.Service;

import org.springframework.data.domain.Page;

import com.nt.Entity.SuperMarket;

public interface ISuperMarketService 
{

	public String AddRecords(Iterable<SuperMarket>list);
	
	public Iterable<SuperMarket> ShowSortRecord(boolean orDer,String... param);
	
	public String UpdateRecordByid(int id,String pName);
	
	public Page<SuperMarket>  ShowPageByPage(int page,int count);
	
	public void ShowAllProInOnePage(int pagesize,boolean order,String...param);
}
