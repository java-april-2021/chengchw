package com.chengchw.prodAndCate.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.prodAndCate.Model.Category;
import com.chengchw.prodAndCate.Model.Product;
import com.chengchw.prodAndCate.Repository.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository prorepo;
	
	public ProductService(ProductRepository prorepo) {
		
		this.prorepo = prorepo;
	}
	
	public List<Product> getAllProd(){
		
		return this.prorepo.findAll();
	}

	public Product createProd(Product newprod) {
		
		return this.prorepo.save(newprod);
	}
	
	
	public Product getProdById(Long id) {
		
		return this.prorepo.findById(id).get();
	}
	
	public Product updateProdById(Product newProd) {
		
		return this.prorepo.save(newProd);
	}
	
	
	public List<Product> getProdWithoutCat(Category thiscat){
		
		return this.prorepo.findByCategoriesNotContaining(thiscat);		
	}
	
	
}
