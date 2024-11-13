package com.nt.Service;

import java.util.List;
import java.util.Optional;

import com.nt.Entity.CollageDept;

public interface ICollageDeptService 
{

	public String AddRecord(List<CollageDept>list);
	
	public String UpdateRecord(CollageDept dept);
	
	public CollageDept SingleRById(Integer id);

	public String PartialUpdate(Integer id,Double sal);
}
