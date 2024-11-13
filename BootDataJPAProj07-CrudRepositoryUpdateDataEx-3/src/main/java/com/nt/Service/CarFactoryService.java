package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.CarFactory;
import com.nt.Repository.ICarFactory;

@Service("server")
public class CarFactoryService implements ICarFactoryService
{
	@Autowired
	private ICarFactory carRepo;

	@Override
	public String AddCarDetail(List<CarFactory> list) {
	Iterable<CarFactory> car1 = (List<CarFactory>)carRepo.saveAll(list);
	          car1.forEach(data->data.getCNo());
		return " Record Inserted Successfully : ";
	}

	
	//Updating Whole ROw
	@Override
	public String UpdateRecord(CarFactory car) {
		
		CarFactory car1 = carRepo.save(car);
		if(car1.getCNo()==car.getCNo()) {
				return "Record Updated Sucessfully :";
		}else 
		{
		return "Record Inserted :";	
		}
		}

	@Override
	public String UpdateSingleRecord(Integer cNo, Integer qty) {
		Optional<CarFactory>opt = carRepo.findById(cNo);
		if(opt.isPresent()) {
			     CarFactory car =opt.get();
			     car.setCQty(qty);
			     carRepo.save(car);
			     
			return "Record Updated :";
		}else {
		return "Invalid Car Number :";
		}
		}

}
