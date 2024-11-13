package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Delivery;
import com.nt.Service.IDeliveryService;

@Component
public class DeliveryRunner implements CommandLineRunner 
{
    @Autowired
	private IDeliveryService ser;
	
	@Override
	public void run(String... args) throws Exception 
	{
		/*
		 * Delivery d = new Delivery("Electronics","hyd","DHL"); Delivery d1 = new
		 * Delivery("Speaker","Mumbai","HCL"); Delivery d2 = new
		 * Delivery("Grocier","Kolkata","DTDC"); try { String msg =
		 * ser.AddDetail(List.of(d, d1, d2)); System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		
		try {
			boolean msg=ser.getById(3);
			if(msg) {
				System.out.println("Prdouct is Available :");
			}else {
				System.out.println("Product is Not Available :");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
