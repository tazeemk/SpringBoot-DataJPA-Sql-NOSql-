package com.nt.entity;

import jakarta.annotation.Generated;
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
@Table(name="Artist_Info")
@Data
@RequiredArgsConstructor
public class Artist 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer sid;
    @NonNull
	@Column(name="ANAME" ,length = 30)
    private String aname;
	@NonNull
	@Column(length = 40)
	private String Atype;
    @NonNull
	@Column
	private double sal;
    public Artist() {
    	System.out.println("Artist:0 param Constructor :");
    }
	
}
