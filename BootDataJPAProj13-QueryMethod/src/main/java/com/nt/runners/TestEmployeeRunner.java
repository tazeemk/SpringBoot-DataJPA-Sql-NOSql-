package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.*;
import com.nt.repository.IEmployeeRepo;
import com.nt.service.IEmployeeService;

@Component("runner")
public class TestEmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService empRepo;

	@Override
	public void run(String... args) throws Exception {

		Logger logger = LoggerFactory.getLogger(TestEmployeeRunner.class);
		
		/*
		 * Employee emp = new Employee("sahid", "Doctor", 983322.2); Employee emp1 = new
		 * Employee("Sanu", "Cheif General", 10000.0); Employee emp2 = new
		 * Employee("Musa kareem", "Army Cheif", 20000.0); Employee emp3 = new
		 * Employee("sakib", "manager", 15000.0); Employee emp4 = new Employee("sahil",
		 * "Clerk", 8000.0); Employee emp5 = new Employee("Shuja", "Pulamber", 5000.0);
		 * Employee emp6 = new Employee("Meraj", "UnEmployed", 6000.0); Employee emp7 =
		 * new Employee("Prince", "Drunk", 000.0);
		 * 
		 * 
		 * 
		 * String msg =
		 * empRepo.AddUserRecord(List.of(emp,emp1,emp2,emp3,emp4,emp5,emp6,emp7));
		 * 
		 * System.out.println(msg);
		 */

		// empRepo.ShowAllUser(5000.0,12000.0).forEach(System.out::println);

		// empRepo.ShowPartially(500.0, 10000.0).forEach(System.out::println);

		// empRepo.GetAllcol("clerk","salesman","manager").forEach(System.out::println);
		
		
		
		
		
	//empRepo.ShowRecordCol("salesman", "clerk").forEach(row->{
		//	System.out.println(Arrays.toString(row));
			/*
			 * for(Object e :row) { System.out.print(e +" "); }
			 */
		// System.out.println();
		//});
		
	
		
		
		
		  
		/* String[] msg=empRepo.showSingle("salesman");
		 * System.out.println(Arrays.toString(msg));
		 */

		/*
		 * Object arr = empRepo.ShowallAggrigate();
		 */
		
		
		try {
			/*
			 * logger.debug("Calling Aggragte Operation Method :");
			 * empRepo.ShowallAggrigate().forEach(row->{
			 * System.out.println(Arrays.toString(row)); });
			 */
		  
			
			/*
			 * String msg = empRepo.HikeEmpSalarybydesg("Clerk", 10.0);
			 * System.out.println(msg);
			 */
			
			String msg = empRepo.removeEmpByDesg(2.0, 10.0);
			System.out.println(msg);
			
			
		}catch(Exception e) {
			
			logger.error("Handling Unknown Exception :"+e.getMessage());
			e.printStackTrace();
		}

	}

}
