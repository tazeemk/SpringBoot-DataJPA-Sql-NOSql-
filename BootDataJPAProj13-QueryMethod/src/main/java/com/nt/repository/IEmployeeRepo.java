package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>,CrudRepository<Employee, Integer>
{
	
	//@Query("from Employee ") 
	
	//@Query("select emp from  Employee emp")  
	   //*****Ordinal Positional Parameter
	//@Query(" from  Employee where SAL>=?1 and SAL<=?2")
	
	    //*****Named Parameter
		/*
		 * @Query("from Employee where SAL>=:startsal and SAL<=:endsal") public
		 * List<Employee> ShowAllUser(double startsal,double endsal);
		 */
	 
	    //***Named Parameter with @Param
	@Query("from Employee where SAL>=:min and SAL<=:max")
	public List<Employee> ShowPartially(@Param("min")double name,@Param("max")double job);
	
	
	     //***Selecting all col values
	@Query("from Employee where JOB in (:job1,:job2,:job3)")
	public List<Employee> GetAllcol(String job1,String job2,String job3);
	
         //***Selecting multiple cols values
	@Query("select ENAME,SAL,JOB from Employee where JOB in (:desg1,:desg2)")
	public List<Object[]> ShowRecordCol(String desg1,String desg2);
	
	     //Selecting Single Cols Values
	@Query("select ENAME from Employee where JOB=:desg")
	public String[] showSingle(String desg);

	        //Performing Aggrigate Operation
	@Query("select count(*),MAX(SAL),MIN(SAL),AVG(SAL),SUM(SAL) from Employee")
	public List<Object[]> ShowallAggrigate(); 
	
	
	        //Performing Update Operation using Query
	
	@Modifying
	@Query("update Employee set SAL=SAL+(SAL*:PERCENTAGE/100.0) where JOB=:desc")
	public int HikeEmpSalarybydesg(String desc,double PERCENTAGE);
	
	
	       //Perform Delete Operation using Query
	
	@Modifying
	@Query("delete from Employee where SAL>=:start and SAL<=:end ")
	public int removeEmpByDesg(double start,double end);
	
}
