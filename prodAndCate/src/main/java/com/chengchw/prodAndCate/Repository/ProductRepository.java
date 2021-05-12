package com.chengchw.prodAndCate.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.prodAndCate.Model.Category;
import com.chengchw.prodAndCate.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findAll();
	
	List<Product> findByCategoriesNotContaining(Category thisCat);
}
