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
@Table
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class LibraryMgtm 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bId;
	
	@Column
	@NonNull
	private String bName;
	
	@Column
	@NonNull
	private String lName;
	
	@Column
	@NonNull
	private String aName;
	
	@Column
	@NonNull
	private Integer bPrice;
}
