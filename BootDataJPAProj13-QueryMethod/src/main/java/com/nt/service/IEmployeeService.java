package com.nt.service;

import java.util.List;

import com.nt.entity.*;

public interface IEmployeeService 
{

	//public String AddUserRecord(List<Emp>list);
	
	//public List<Employee> ShowAllUser(double startsal,double endsal);

	public List<Employee> ShowPartially(double name,double job);
	public List<Employee> GetAllcol(String job1,String job2,String job3);
	public List<Object[]> ShowRecordCol(String desg1,String desg2);
	public String[] showSingle(String desg);
	public List<Object[]> ShowallAggrigate();
	
	public String HikeEmpSalarybydesg(String desc,double sal);

	public String  removeEmpByDesg(double start,double end);
}
