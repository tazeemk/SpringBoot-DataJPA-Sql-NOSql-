package com.nt.Entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Table
@Entity
@Data
@RequiredArgsConstructor
public class Employee 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
	private Integer eid;
	
	@NonNull
	@Column
	private String sName;
	@NonNull
	@Column
	private String dept;
	@NonNull
	@Column
	private String Loc;
	@NonNull
	@Column
	private Double sal;
	public Employee() {
		System.out.println("Employee :0 param Constructor ");
	}
	
}
