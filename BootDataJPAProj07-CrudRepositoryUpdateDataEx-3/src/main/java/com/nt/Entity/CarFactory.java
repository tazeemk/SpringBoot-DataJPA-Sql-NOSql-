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
public class CarFactory 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cNo;
	
    @NonNull
	private String cName;
	
    @NonNull
	private String cType;
	
    @NonNull
	private String cCompany;
	
    @NonNull
	private Double price;
    
    @NonNull
    private Integer cQty;
	
}
