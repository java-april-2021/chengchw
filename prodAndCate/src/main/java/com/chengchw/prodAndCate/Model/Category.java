package com.chengchw.prodAndCate.Model;

import java.util.ArrayList;
import java.util.List;

//import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import javax.persistence.Table;
import javax.persistence.ManyToMany;

import com.chengchw.prodAndCate.Model.Product;

@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "categories_products", 
	joinColumns = @JoinColumn(name = "category_id"),
	inverseJoinColumns = @JoinColumn(name = "product_id"))
	
	private List<Product> products;
	
	public Category() {}

	public Category(String name) {
		
		this.name = name;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(Product newproduct) {
		this.products.add(newproduct);
	}
	
	public void clearProducts() {
		
		this.products = new ArrayList<Product>();
	}
	
	
	
}
