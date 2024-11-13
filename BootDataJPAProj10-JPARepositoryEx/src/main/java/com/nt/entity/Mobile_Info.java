package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
//@RequiredArgsConstructor

public class Mobile_Info {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer mRegNo;
	//@NonNull
	@Column
	private String mCompany;
	//@NonNull
	@Column
	private String mName;
	//@NonNull
	@Column
	private String mStrorage;
	//@NonNull
	@Column
	private String mRam;

	//@NonNull
	@Column
	private Double mPrice;

	//@NonNull
	@Column
     private String mConfig;

}
