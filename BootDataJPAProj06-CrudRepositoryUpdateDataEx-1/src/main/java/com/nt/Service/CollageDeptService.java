package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.CollageDept;
import com.nt.Repository.ICollageDept;

@Service("service")
public class CollageDeptService implements ICollageDeptService {
	@Autowired
	private ICollageDept collageRepo;

	@Override
	public String AddRecord(List<CollageDept> list) {
		List<CollageDept> list1 = (List<CollageDept>) collageRepo.saveAll(list);

		list1.forEach(data -> data.getDeptId());

		return list1.size() + "Records Has been Inserted : Ids Are =>" + list1;
	}

	// Full Object Modification using save() method
	@Override
	public String UpdateRecord(CollageDept dept) {
		CollageDept d = collageRepo.save(dept);
		if (d.getDeptId() == dept.getDeptId())
			return "Your Record Is Updated Successfully :";
		else
			return "Your Record Is Inserted ";
	}

	@Override
	public CollageDept SingleRById(Integer id) {
		// 2nd Way
		// return collageRepo.findById(id);

		//// 1as way
		Optional<CollageDept> list = collageRepo.findById(id);
		if (list.isPresent())
			return list.get();
		else
			throw new

			IllegalArgumentException("Invalid IDs");

	}

	@Override
	public String PartialUpdate(Integer id, Double sal) 
	{
	
		Optional<CollageDept>opt = collageRepo.findById(id);
		if(opt.isPresent())
		{
		
			CollageDept  obj =opt.get();
			obj.setSal(obj.getSal()+(obj.getSal()*0.10));
			collageRepo.save(obj);
			return id +"RECORD UPDATED SUCCESSFULLY :";
		}else {
		
		 return id+"Invalid Id ";
	}

}
}