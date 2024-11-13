package com.nt.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Paytm;
import com.nt.repository.IPaytmMgtm;
@Service("pay")
public class PaytmService implements IPaytmServiceRepo {
    @Autowired
	private IPaytmMgtm paytmRepo;
	
    Logger logger = LoggerFactory.getLogger(PaytmService.class);
	
	@Override
	public String AddUserRecords(Paytm list) {
		
	logger.debug("Service Method Performming Insert Operation :");
	          Long no =paytmRepo.save(list).getMNo();
		return no+" :Your Account is Successfully Created :";
	}

	
	@Override
	public String WithdrawAmount(Long SoumNo, Long DesMno, double AmtTrans) 
	{
		logger.debug("Service Method Performming Money Transition Operations :");
	         Paytm pay = null;   
	         Paytm pay1 = null;
		       Optional<Paytm>list    =paytmRepo.findById(SoumNo);
		       Optional<Paytm>list1 =paytmRepo.findById(DesMno);
		
		       if(list.isPresent()) {
		    	   pay=list.get();
		    	   if(list1.isPresent()) {
		    		  pay1 =list1.get(); 
		    		  
		    		pay.setBal(pay.getBal()-AmtTrans);
		    		paytmRepo.save(pay); 
		    	   pay1.setBal(pay1.getBal()+AmtTrans);
		    	   paytmRepo.save(pay1);
		    	   return AmtTrans+"Transferred from Account No :"+pay.getMNo() +" :TO "+pay1.getMNo() + " : Available Balance is :"+pay.getBal();
		    	   }else {
		    		   return "Inavlid ";
		    	   }
		    	   }
		    	   else { 
		    	   return "Invalid Account Number :";
		    	   }
		       
	}
}
