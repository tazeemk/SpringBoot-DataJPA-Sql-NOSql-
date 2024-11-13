package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.repository.ILibraryMgmt;
@Component
public class LibraryTestMgmtRunner implements CommandLineRunner {
    @Autowired
	private ILibraryMgmt service;
    

	@Override
	public void run(String... args) throws Exception 
	{
      
            //  service.findByaNameEquals("devang gautam").forEach(System.out::println);     
              
             // service.findByaNameLike("%s").forEach(System.out::println);
	
            //  service.findByaNameStartingWith("d").forEach(System.out::println);

	    // service .findBybPriceBetween(50, 100).forEach(System.out::println);;
	
		
		service.findBybIdIn(new int[] {1,2,3,4} ).forEach(System.out::println);
		
	}
	
}
