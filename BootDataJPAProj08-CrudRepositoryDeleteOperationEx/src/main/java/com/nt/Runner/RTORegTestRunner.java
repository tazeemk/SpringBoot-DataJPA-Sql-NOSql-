package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.IRTORegistrationService;
import com.nt.entity.RTORegistration;

@Component
public class RTORegTestRunner implements CommandLineRunner {
	@Autowired
	private IRTORegistrationService ser;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * RTORegistration r = new
		 * RTORegistration("G-Wagon","Devang","OFF-Roading",21202); RTORegistration r1 =
		 * new RTORegistration("Ferrai","sahid","sport",32102); RTORegistration r2 = new
		 * RTORegistration("GTR 4X","Sanu","super-Racer",312102);
		 */

             //try {
            //	String msg = ser.AddDetail(List.of(r,r1,r2));
           //	System.out.println(msg);
           //	
           //}catch(Exception e) {
           //	e.printStackTrace();
            //}
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println("=======================================");
		 * 
		 * System.out.println("Deleting Single Records By DeleteById"); try { String
		 * msg= ser.removeByid(1); System.out.println(msg); }catch(Exception e) {
		 * e.printStackTrace();
		 * 
		 * }
		 */
		
		
		
		
		
		

		/*
		 * System.out.println("=============================================");
		 * System.out.println("Delete Multiple Records Based On Ids :");
		 * 
		 * try { String msg = ser.removeAllById(List.of(1, 4, 76));
		 * System.out.println(msg); } catch (Exception e) { e.printStackTrace(); }
		 */


	
	
	
	
	         
		
		/*
		 * System.out.println("=============================================");
		 * System.out.println("Deleting All Records :");
		 * 
		 * try { String msg = ser.removeAll(); System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		
		
		
		
		
		
		
		/*
		 * r.getRno(); try {
		 * 
		 * String msg = ser.remove(1); System.out.println(msg); }catch(Exception e) {
		 * e.printStackTrace();
		 * 
		 * }
		 */
		
		
		
		
		
		
		RTORegistration r = new RTORegistration();
		
		try {
			String msg =ser.removeAll(List.of(r));
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
	}
	

}
