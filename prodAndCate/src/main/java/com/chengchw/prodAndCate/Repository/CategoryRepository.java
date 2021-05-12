package com.chengchw.prodAndCate.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.prodAndCate.Model.Category;
import com.chengchw.prodAndCate.Model.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	List<Category> findAll();
	
	List<Category> findByProductsNotContaining(Product thisprod);
}
