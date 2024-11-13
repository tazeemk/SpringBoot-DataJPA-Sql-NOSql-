package com.nt.Service;

import java.util.List;

import com.nt.Entity.Delivery;

public interface IDeliveryService {

	public String AddDetail(List<Delivery>list);
     public boolean getById(Integer id);	
}
