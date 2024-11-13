package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Employee;
import com.nt.Repository.IEmployee;
@Service("service")
public class EmployeeService implements IEmployeeService {
     @Autowired
	private IEmployee employee;
	
	
	@Override
	public String InsertEmp(Employee emp) {
		
		Employee emp1 = employee.save(emp);
		
		return emp1.getEid()==null?"Record Not Inserted":"Record Inserted Successfully :";
	}

}
