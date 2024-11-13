package com.nt.Runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.CollageDept;
import com.nt.Service.ICollageDeptService;

@Component
public class CollageDeptTestRunner implements CommandLineRunner {
	@Autowired
	private ICollageDeptService service;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * CollageDept cd = new CollageDept("MCA", "Devang", "Computer Application",
		 * 987743.3); CollageDept cd1 = new CollageDept("BCA", "Shahid",
		 * "Computer Fundatmentals", 87743.3); CollageDept cd2 = new CollageDept("MBBS",
		 * "Sanu", "Medical Science", 4987743.3); try{
		 * 
		 * String msg =serivce.AddRecord(List.of(cd,cd1,cd2)); System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 * 
		 * }
		 */
		/*
		 * CollageDept up = new CollageDept(4, "Comander", "Musa Kareem", "Cheif",
		 * 932109873.3);
		 * 
		 * try {
		 * 
		 * String msg = service.UpdateRecord(up); System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */

		// findbyId Methods

		/*
		 * try { //1st Way
		 * 
		 * 
		 * System.out.println("1st to use findbyId() using Optional cLass"); CollageDept
		 * msg =service.SingleRById(1); System.out.println(msg);
		 * 
		 * 
		 * //2nd Way
		 * 
		 * Optional<CollageDept>opt=service.SingleRById(21); if(opt.isPresent()) {
		 * 
		 * CollageDept d=opt.get(); System.out.println(d); }else {
		 * System.out.println("User Not Found :"); }
		 * 
		 * 
		 * 
		 * 
		 * }catch(Exception e) { e.printStackTrace();
		 * 
		 * }
		 */

		
		
		//Partial Update(Updating only single value in table)
		
		try {
			  String d =service.PartialUpdate(1, 20.0);
			  System.out.println(d);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
