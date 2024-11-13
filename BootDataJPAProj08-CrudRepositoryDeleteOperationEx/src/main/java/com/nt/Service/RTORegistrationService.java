package com.nt.Service;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.IRTORegistration;
import com.nt.entity.RTORegistration;

@Service("service")
public class RTORegistrationService implements  IRTORegistrationService
{
   @Autowired
	IRTORegistration reg;

   
   
   
   //=========================================================================================
                             //SaveAll
   
   
   @Override
public String AddDetail(Iterable<RTORegistration> list) {
	Iterable<RTORegistration>list1 =reg.saveAll(list);
	       long l =StreamSupport.stream(list1.spliterator(), false).count();
	return l +": Records Are Inserted :";
}





//==============================================================================================
                              //DeleteById

@Override
public String removeByid(int id) 
{

	Optional<RTORegistration> opt = reg.findById(id);
	if(opt.isPresent()) 
	{
	    reg.deleteById(id);
		return "User found And Deleted :";
	}
	return "User Not Found Please Enter Valid Id :";
}
   



//===============================================================================================
                          // DeleteAllById
   
   @Override
	public String removeAllById(Iterable<Integer> ids) {
	   
	   Iterable<RTORegistration>list=reg.findAllById(ids);
       long count   =StreamSupport.stream(list.spliterator(), false).count();	   
	           reg.deleteAllById(ids);
		return count+" :NO OF RECORDS ARE DELETED :";
	}
   

   
   
   //===============================================================================================
                        //deleteAll()
   
   
   @Override
    	public String removeAll() {
    	            reg.deleteAll();
    		return "Deleting All Records :";
    	}
	
   
   
   //===============================================================================================
                         //delete(S entity)
    
   
   @Override
	public String remove(int rto) {
		    Optional<RTORegistration>rt=reg.findById(rto);
	   if(rt.isPresent()) {
		  RTORegistration r=rt.get();
	   reg.delete(r);
		return "All Records Deleted Successfully :";
	}
	   return "Not Founded :";
	   }
   
   
   
   
   //================================================================================================
                                  //deleteAll(Iterable<T>entites)
   
   @Override
	public String removeAll(Iterable<RTORegistration> list) {
		Iterable<RTORegistration>list1=reg.findAll();
	   reg.deleteAll(list1);
		return "Deleted Successfully ";
	}
   
   
   
   
   
   
}
