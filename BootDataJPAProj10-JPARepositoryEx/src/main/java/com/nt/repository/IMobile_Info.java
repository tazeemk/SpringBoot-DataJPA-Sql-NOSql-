package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Mobile_Info;

public interface IMobile_Info extends JpaRepository<Mobile_Info, Integer>,PagingAndSortingRepository<Mobile_Info, Integer>{

}
