package com.nt.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("service")
@Transactional
public class EmployeService implements IEmployeeService
{
	
	 private static Logger login = LoggerFactory.getLogger(EmployeService.class);

	 
	@Autowired
	private IEmployeeRepo erepo;
	
	/*
	 * @Override public String AddUserRecord(List<Emp> list) {
	 * 
	 * List<Emp> li =erepo.saveAll(list);
	 * 
	 * return li.size()+"Records Inserted Successfully :"; }
	 */

	/*
	 * @Override public List<Employee> ShowAllUser(double statsal ,double endsal) {
	 * List<Employee>list1=erepo.ShowAllUser(statsal,endsal); return list1; }
	 */

	@Override
	public List<Employee> ShowPartially(double name, double job) {
	login.debug("Performing Single Column Select Operaton by using Query Method :");
	login.info("Injecting IEmployee Reposiory Object Where i write Query method Objects :");
		List<Employee>list1=erepo.ShowPartially(name, job);
	
		return list1;
	}

	
	
	
	@Override
	public List<Employee> GetAllcol(String job1,String job2,String job3) {
		login.debug("Performing Multiple Column Select Operaton by using Query Method :");
		login.warn("Exception is propogate to runner class Handle Their :");
		return erepo.GetAllcol(job1,job2,job3);
	}




	@Override
	public List<Object[]> ShowRecordCol(String desg1, String desg2) {
		
		return erepo.ShowRecordCol(desg1, desg2);
	}




	@Override
	public String[] showSingle(String desg) {
		
		return erepo.showSingle(desg);
	}




	@Override
	public List<Object[]> ShowallAggrigate() {
		
		return erepo.ShowallAggrigate();
	}




	@Override
	public String HikeEmpSalarybydesg(String desc, double sal) {
		int count = erepo.HikeEmpSalarybydesg(desc, sal);
		return count +desc+ ":  Salary are Hiked to :"+sal +" percentage:";
	}
	
	
	
	@Override
	public String removeEmpByDesg(double start, double end) {
	             int count =erepo.removeEmpByDesg(start, end);
		return count +" : No of Records Are Deleted : ";
	}
	
}
