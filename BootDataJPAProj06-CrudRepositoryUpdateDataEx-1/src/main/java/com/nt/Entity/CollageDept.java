package com.nt.Entity;

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
@Table
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class CollageDept 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
	private Integer deptId;
	
	@NonNull
	private String dName;
	
	@NonNull
	private String dHOD;
	
	@NonNull
	private String dSubject;
	
	@NonNull
	private Double sal;
	
}
