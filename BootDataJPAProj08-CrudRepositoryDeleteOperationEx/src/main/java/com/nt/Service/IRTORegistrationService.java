package com.nt.Service;

import java.util.List;

import com.nt.entity.RTORegistration;

public interface IRTORegistrationService 
{

	public String AddDetail(Iterable<RTORegistration>list);
	
	public String removeByid(int id);
	
	
	public String removeAllById(Iterable<Integer>ids);
	
	public String removeAll();

    public String remove(int userid);
    
    public String removeAll(Iterable<RTORegistration>list);


}
