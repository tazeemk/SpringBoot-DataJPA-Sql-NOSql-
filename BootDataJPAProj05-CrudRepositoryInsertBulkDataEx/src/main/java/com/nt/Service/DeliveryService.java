package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Delivery;
import com.nt.Repository.IDelivery;
@Service("service")
public class DeliveryService implements IDeliveryService {
    @Autowired
	private IDelivery delivery;
	
	
	
	@Override
	public String AddDetail(List<Delivery> list) 
	{
	
		List<Delivery>list1 = (List<Delivery>)delivery.saveAll(list);
		
		list1.forEach(data->{
			data.getId();
		});
		
		return list1.size()+" Records are Inserted : And Ids are :"+list1;
	}



	@Override
	public boolean getById(Integer id) {
		boolean flag =delivery.existsById(id);
		return flag;
	}

}
