package com.nt.Service;

import java.util.List;

import com.nt.Entity.CarFactory;

public interface ICarFactoryService 
{

	public String AddCarDetail(List<CarFactory>list);
	
	//Updating whole column in table
	public String UpdateRecord(CarFactory car);
	
	public String UpdateSingleRecord(Integer cNo,Integer qty);
	
}
