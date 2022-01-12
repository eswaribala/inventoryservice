package com.tata.inventoryservice.services;

import java.util.List;

import com.tata.inventoryservice.models.Product;
import com.tata.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;

	//insert
	
		public Product addProduct(Product product)
		{
						
	    	return this.productRepo.save(product);
			
		}
		
		
		//select
		public List<Product> getAllProducts()
		{
			 
			return  productRepo.findAll();
			
		}
		//select
		public Product getProductById(long productId)
		{
			 
			return  productRepo.findById(productId).orElse(null);
			
		}
	
}
