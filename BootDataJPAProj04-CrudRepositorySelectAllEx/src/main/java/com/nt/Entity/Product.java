package com.nt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@RequiredArgsConstructor
public class Product 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
	private Integer pId;
	
	@NonNull
	@Column
	private String pName;
	
	@NonNull
	@Column
	private String pType;
	
	@NonNull
	@Column
	private Double pSal;
	
}
