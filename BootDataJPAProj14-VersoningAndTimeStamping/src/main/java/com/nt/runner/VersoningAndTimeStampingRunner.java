package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Paytm;
import com.nt.service.IPaytmServiceRepo;
@Component
public class VersoningAndTimeStampingRunner implements CommandLineRunner {

	@Autowired
	private IPaytmServiceRepo repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
	
		/*
		 * Paytm pay = new Paytm(); pay.setAcHolder("Shuja"); pay.setBal(25000.0);
		 * pay.setType("current");
		 */
		
		try {
			/*
			 * String msg = repo.AddUserRecords(pay); System.out.println(msg);
			 */
			
			
			String msg=repo.WithdrawAmount(989898215L, 989898214L, 1000.0);
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
