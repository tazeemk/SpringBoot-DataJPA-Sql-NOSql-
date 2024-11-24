package com.nt.Runnner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.Entity.SuperMarket;
import com.nt.Service.ISuperMarketService;
@Component
public class SuperMarketTestRunner implements CommandLineRunner {
    @Autowired
	private ISuperMarketService service;
	
	@Override
	public void run(String... args) throws Exception 
	{
		/*
		 * // SuperMarket s = new SuperMarket("Chips","Snack","B11",400,90.2); //
		 * SuperMarket s2 = new SuperMarket("Soft Drinks","Bevagers","B31",600,60.2); //
		 * SuperMarket s3 = new SuperMarket("Dairy Products","Liquid","B21",200,40.2);
		 * // SuperMarket s4 = new SuperMarket("Kitchen Tools","Hard","B41",1100,990.2);
		 * // SuperMarket s5 = new SuperMarket("Soaps","Detergents","B22",1000,10.2); //
		 * SuperMarket s6 = new SuperMarket("Vegetables","Food","B10",200,20.2); //
		 * SuperMarket s7 = new SuperMarket("Breads","Food","B06",140,50.2); //
		 * SuperMarket s8 = new SuperMarket("Pulses","Cerels","B01",800,190.6); // try {
		 * // // String msg = service.AddRecords(List.of(s,s2,s3,s4,s5,s6,s7,s8)); //
		 * System.out.println(msg); // }catch(Exception e) { // e.printStackTrace(); //
		 * }
		 */	

		
		
		//           UPDATE
		
		
		
		/*
		 * try {
		 * 
		 * String msg =service.UpdateRecordByid(4,"Band"); System.out.println(msg);
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		
		
		
		
		
		
		
		
		
	
	
	 //                SORTING
		
		/*
		 * try { service.ShowSortRecord(false, "pType").forEach(System.out::println);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		 
	
		//                 PAGING
	
	
		
		/*
		 * try {
		 * 
		 * Page<SuperMarket>s =service.ShowPageByPage(1, 3);
		 * s.toList().forEach(System.out::println);
		 * 
		 * System.out.println("No of Records in Eachpage :"+s.getNumberOfElements());
		 * System.out.println("Page Number :"+s.getNumber());
		 * 
		 * System.out.println("Is FirstPage :"+s.isFirst());
		 * System.out.println("Is LastPage :"+s.isLast());
		 * System.out.println("PageCount :"+s.getTotalPages());
		 * 
		 * }catch(Exception e) {
		 * 
		 * }
		 */
		
		
		
		
		
		try {
			
			service.ShowAllProInOnePage(4,true,"pName");
			System.out.println("Changes occur in ");
		}catch(Exception e) {
			
		}
		
		
		
		
		
	}

}
