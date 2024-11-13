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
public class Delivery 
{
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	@NonNull
	@Column(name="DeliveryItem")
	private String ditem;
	@NonNull
	@Column(name="DeliveryAddress")
	private String dAddr;
	@NonNull
	@Column(name="CourierPartner")
	private String cpartner;
	
}
