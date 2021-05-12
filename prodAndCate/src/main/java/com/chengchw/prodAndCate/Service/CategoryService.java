package com.chengchw.prodAndCate.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.prodAndCate.Model.Category;
import com.chengchw.prodAndCate.Model.Product;
import com.chengchw.prodAndCate.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository caterepo;
	
	public CategoryService(CategoryRepository caterepo) {
		
		this.caterepo = caterepo;
	}
	
	
	public List<Category> getAllCat(){
		
		return this.caterepo.findAll();
	}
	
	public Category createCat(Category newcat) {
		
		return this.caterepo.save(newcat);
	}
	
	public List<Category> getCateWithoutProd(Product thisprod){
		
		return this.caterepo.findByProductsNotContaining(thisprod);
		
	}
	
	public Category getCatById(Long id) {
		
		return this.caterepo.findById(id).get();
	}
	
	public Category udateCat(Category newcat) {
		
		return this.caterepo.save(newcat);
	}
	
	
}
