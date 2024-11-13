
  package com.nt.Runner;
  
  import java.util.Arrays;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Employee; import com.nt.Service.IEmployeeService;
 @Component 
  public class EmployeeRunner implements CommandLineRunner {
  @Autowired
	 private org.springframework.core.env.Environment env;
  
  public EmployeeRunner(org.springframework.core.env.Environment env) {
	  this.env=env;
  }
  
  @Autowired
  private IEmployeeService emp1;
  
  @Override public void run(String... args) throws Exception { Employee e = new
  Employee("Devang", "President", "New York", 90800.22);
  
 System.out.println(" "+Arrays.toString(env.getActiveProfiles()));
 
  
  try {
  
  String msg = emp1.InsertEmp(e); System.out.println(msg); }catch(Exception e1)
  { e1.printStackTrace();
  
  }
  
  }
  
  
  }
 
