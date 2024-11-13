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

import com.nt.entity.LibraryMgtm;
import com.nt.service.ILibraryService;
@Component
public class LibraryTestMgmtRunner implements CommandLineRunner {
    @Autowired
	private ILibraryService service;
    
    @Autowired
    private ApplicationContext application;
	@Override
	public void run(String... args) throws Exception 
	{
	
/*  		LibraryMgtm l = new LibraryMgtm("RDSharma","MG Gandi Lib","Devang Gautam",789);
  		LibraryMgtm l1 = new LibraryMgtm("NCERT","VBSPU Lib","Gautam Sins" ,890);
		
  		LibraryMgtm l2= new LibraryMgtm("Java base","nit Lib","Shuja Gendu",89);
  		LibraryMgtm l3 = new LibraryMgtm("Once Upon","Gandi Lib","Batla ",909);
  		LibraryMgtm l4= new LibraryMgtm("Bad Elements"," Batla Lib","Gautam Fucker",589);
		try 
		{
  		
			String msg = service.addBooks(Arrays.asList(l,l1,l2,l3,l4));
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
    
/*
 * try { org.springframework.core.env.Environment env =
 * application.getEnvironment();
 * System.out.println(Arrays.toString(env.getActiveProfiles()));
 * 
 * //Page<LibraryMgtm>page =service.ShowInPage(2, 3);
 * //System.out.println(page.isLast());
 * //System.out.println(page.getTotalPages()); //List<LibraryMgtm> l
 * =page.getContent(); // l.forEach(System.out::println);
 * service.GetFilterData("NCERT", "VBSPU Lib", true,
 * "lName").forEach(System.out::println);;
 * 
 * }catch(Exception e) { e.printStackTrace(); }
 */
try {
	String msg=service.DeletePartially(53, " ");
	System.out.println(msg);
}catch(Exception e) {
	e.printStackTrace();
}
	
	}
}
