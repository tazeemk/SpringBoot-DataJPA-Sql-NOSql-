package com.nt.Runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.IDoctorServiceImpl;
import com.nt.entity.Doctor;
@Component
public class DoctorRunnerImpl implements CommandLineRunner {
    @Autowired
	private IDoctorServiceImpl doct;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
	Doctor d = new Doctor();
	System.out.println("Enter Doctor Name :");
	
	String name = sc.nextLine();
	
	System.out.println("Enter Doctor Type :");
	
	String dtype = sc.nextLine();
	
	System.out.println("Enter The Salary ");
	
	double sal = sc.nextDouble();
    d.setDname(name);
    d.setDtype(dtype);
    d.setSal(sal);

	try {
		String msg = doct.SetDetial(d);
		System.out.println(msg);
		System.out.println("Gautam pelandu");
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
