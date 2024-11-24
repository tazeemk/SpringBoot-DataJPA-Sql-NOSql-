package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Mobile_Info;
import com.nt.service.IMobile_InfoService;

@Component
public class Mobile_InfoTestRunner implements CommandLineRunner {
	@Autowired
	private IMobile_InfoService service;

	@Override
	public void run(String... args) throws Exception {

		Mobile_Info m = new Mobile_Info("samsung", "galaxyXultra", "128", "4gb", 89000.0, "5g");
		Mobile_Info m1 = new Mobile_Info("samsung", "galaxy20s", "64", "6gb", 9000.0, "4g");
		Mobile_Info m2 = new Mobile_Info("samsung", "galaxyultra", "256", "8gb", 89000.0, "5g");
		Mobile_Info m3 = new Mobile_Info("IPhone", "16 Pro", "128", "4gb", 89000.0, "5g");
		Mobile_Info m4 = new Mobile_Info("IPhone", "15 ProMax", "512", "12gb", 189000.0, "5g");
		Mobile_Info m5 = new Mobile_Info("IPhone", "13 ProMax", "128", "6gb", 99000.0, "5g");
		Mobile_Info m6 = new Mobile_Info("IPhone", "12 Plus", "56", "4gb", 69000.0, "4g");
		Mobile_Info m7 = new Mobile_Info("Realme", "5i", "128", "4gb", 19000.0, "4g");
		Mobile_Info m8 = new Mobile_Info("Realme", "Narco12", "256", "6gb", 35000.0, "5g");
		Mobile_Info m9 = new Mobile_Info("Realme", "R2Ultra", "512", "12gb", 55000.0, "5g");
		Mobile_Info m10 = new Mobile_Info("Realme", "T2", "128", "4gb", 13000.0, "4g");
		Mobile_Info m11 = new Mobile_Info("Realme", "20s", "256", "8gb", 23000.0, "5g");
		Mobile_Info m12 = new Mobile_Info("Moto", "M11", "128", "4gb", 89000.0, "5g");
		Mobile_Info m13 = new Mobile_Info("Moto", "Devnag22", "512", "20gb", 289000.0, "4g");
		Mobile_Info m14 = new Mobile_Info("Moto", "ShujaL32", "256", "4gb", 51000.0, "4g");
		try {

			String msg = service
					.AddMoreRecords(Arrays.asList(m, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14));
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * try { String msg=service.RemoveRecord(Arrays.asList(14,15,null,1332));
		 * System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 * 
		 */

		/*
		 * try {
		 * List<Mobile_Info>list1=service.ShowRecordAfterFilter(1,3,null,"5g",true,
		 * "mPrice"); list1.forEach(System.out::println);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 * 
		 */
	}

}
