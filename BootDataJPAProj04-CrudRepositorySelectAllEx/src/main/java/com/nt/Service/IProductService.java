package com.nt.Service;

import java.util.List;

import com.nt.Entity.Product;

public interface IProductService 
{

	public String AddProduct(Product prod);
	
	public Iterable<Product> ShowProduct();
	
	public String AddMore(List<Product>list);
}
