package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Paytm 
{
    @SequenceGenerator(name="seq1",sequenceName = "pa_seq",initialValue = 989898211,allocationSize = 1)
	@GeneratedValue(generator="seq1",strategy = GenerationType.SEQUENCE)
    @Id
    private Long mNo;
	@NonNull
    @Column(length = 40)
    private String acHolder;
    @NonNull
    private String type;
    @NonNull
    private Double bal;
    
    @Version
    @Column(length=30)
    private  Integer CountTransaction; 
	
    @CreationTimestamp
    @Column(insertable = true ,updatable = false)
    private LocalDateTime OpeningDate;
    
    @UpdateTimestamp
    @Column(insertable =false,updatable =true)
    private LocalDateTime LastTransationDate;
}
