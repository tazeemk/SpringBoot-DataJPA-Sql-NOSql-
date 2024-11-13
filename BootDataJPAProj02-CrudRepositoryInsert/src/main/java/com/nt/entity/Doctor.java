package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@Table(name="Doctor_Info")
@RequiredArgsConstructor
public class Doctor
{
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    @NonNull
	@Column(name="DNAME",length = 40)
	private String Dname;
    @NonNull
    @Column
	private String Dtype;
	@NonNull
	@Column
	private double sal;
	
	public Doctor() 
	{
		System.out.println("Doctor :0 param Constructor");
	}
	
	
}
