package com.nt.service;

import java.util.List;

import com.nt.entity.Mobile_Info;

public interface IMobile_InfoService 
{

         public String AddMoreRecords(Iterable<Mobile_Info>list);	
         
         public String RemoveRecord(Iterable<Integer>list);
         
         
         public List<Mobile_Info> ShowRecordAfterFilter(int page,int count,String name,String price,boolean order,String...param);

	
	
}
