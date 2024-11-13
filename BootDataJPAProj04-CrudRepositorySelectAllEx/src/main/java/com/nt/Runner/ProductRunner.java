package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Product;
import com.nt.Service.IProductService;

@Component
public class ProductRunner implements CommandLineRunner 
{  
	
   @Autowired
   private IProductService ser;
	@Override
	public void run(String... args) throws Exception 
	{
	
		/*
		 * Product p = new Product(); Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter Product Name :"); String name = sc.nextLine();
		 * System.out.println("Enter Product Type :"); String type = sc.nextLine();
		 * System.out.println("Enter Product Price :"); double sal = sc.nextDouble();
		 * p.setPName(name); p.setPType(type); p.setPSal(sal);
		 * 
		 * try { String msg = ser.AddProduct(p); System.out.println(msg);
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		
		
		/*
		 * try {
		 * 
		 * Iterable<Product>list =ser.ShowProduct();
		 * list.forEach(data->System.out.println(data));
		 * System.out.println("=============================");
		 * list.forEach(System.out::println);
		 * 
		 * System.out.println("=============================");
		 * 
		 * for(Product l : list) { System.out.println(l); }
		 * 
		 * System.out.println("=============================");
		 * 
		 * 
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		
		Product p = new Product("Kawaaski Ninja ","Sport Bike",989999.09);
		Product p1 = new Product("Bentily ","Sport Car",989992239.09);
		Product p2 = new Product("Kawaaski H2R ","Sport Bike",2989999.09);
		try {
			
			String msg = ser.AddMore(List.of(p, p1, p2));
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
 
}

