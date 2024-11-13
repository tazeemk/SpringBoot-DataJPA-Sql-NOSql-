package com.nt.Service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Product;
import com.nt.Repository.IProduct;
@Service("service")
public class ProductService implements IProductService {
    @Autowired
	private IProduct productRepo;
	
	
	
	@Override
	public String AddProduct(Product prod) {
		
		Product product1 = productRepo.save(prod);
		
		return product1.getPId()==null?"Record Not Inserted :":" Record Inserted Successfully :";
	}



	@Override
	public Iterable<Product> ShowProduct() {
	
		//Save Objects
		
		Iterable<Product>list =productRepo.findAll();
		
		
		
		return list;
	}



	@Override
	public String AddMore(List<Product> list) {
		
		List<Product>list1=(List<Product>)productRepo.saveAll(list);
		
		list1.forEach(data->{
			data.getPId();
		});
		return list1.size()+"Record Inserted :" ;
	}

	
	
	
	
	
	
	/*
	 * @Override public Iterator<Product> ShowProduct() { // TODO Auto-generated
	 * method stub return null; }
	 */
}
