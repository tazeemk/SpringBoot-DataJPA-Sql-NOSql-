package com.nt.entity;

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
public class RTORegistration 
{
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="RegNumber")
	private Integer Rno;

	
	@NonNull
	@Column(name="Vehicle_Name",length=30)
	private String vName;
	
	@NonNull
	@Column(name="OwnerName")
	private String oName;
	
	@NonNull
	@Column(name="Vehicle_Type")
	private String vType;
	
	@NonNull
	private Integer fee;
	
	
	
}
