package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.CarFactory;
import com.nt.Service.ICarFactoryService;

@Component
public class CarFactoryRunnerTest implements CommandLineRunner 
{

	@Autowired
	private ICarFactoryService service;

	@Override
	public void run(String... args) throws Exception 
	{
	
		CarFactory car1 = new CarFactory("BMW M4","SportCar","BMW",2909992.3,30);
		CarFactory car2 = new CarFactory("Supra ","SportCar","Toyota",102992.3,90);
		CarFactory car3 = new CarFactory("MayBech","Luxiury","Mercedes",129992.3,20);
		CarFactory car4 = new CarFactory(2,"Rand Lover","SportCar","Devang",19992.3,60);
		CarFactory car5= new CarFactory(5," Ninja 1000RR","Sport Bike","Kawasaki",2322.2,80);
		try {
			//Adding Data
			/*
			 * String msg =service.AddCarDetail(List.of(car1,car2,car3,car4));
			 * System.out.println(msg);
			 */
			
			
			/*
			 * //Updating Whole Row 
			 * String msg = service.UpdateRecord(car5);
			 * System.out.println(msg);
			 */
			
			//Updating Single Value in Column 
			
			String msg = service.UpdateSingleRecord(1, 203);
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
