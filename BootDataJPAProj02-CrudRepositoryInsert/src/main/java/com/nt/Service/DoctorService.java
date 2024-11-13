package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.IDoctor;
import com.nt.entity.Doctor;
@Service("ser")
public class DoctorService implements IDoctorServiceImpl {
    @Autowired
	private IDoctor obj;
	
	
	@Override
	public String SetDetial(Doctor doc) 
	{
	   
		Doctor doc1 = obj.save(doc);
		System.out.println(doc1);
		return doc1.getId()==null?"Record Not Inserted :":"Record Inserted Successfully :";
	}

}
