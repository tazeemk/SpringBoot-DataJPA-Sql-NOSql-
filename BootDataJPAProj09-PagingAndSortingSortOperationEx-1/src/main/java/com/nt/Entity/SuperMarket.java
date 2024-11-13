package com.nt.Entity;

import org.hibernate.annotations.JoinColumnOrFormula;

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
@Table
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class SuperMarket 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
	private Integer pId;

	@Column
	@NonNull
	private String pName;
	
	@Column
	@NonNull
	private String pType;
	
	@Column
	@NonNull
	private String pBlock;
	
	@Column
	@NonNull
	private Integer pQty;
	
	@Column
	@NonNull
    private Double pPrice;
	
}
