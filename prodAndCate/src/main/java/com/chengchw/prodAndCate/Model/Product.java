package com.chengchw.prodAndCate.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private float price;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "categories_products", 
				joinColumns = @JoinColumn(name = "product_id"),
				inverseJoinColumns = @JoinColumn(name = "category_id"))
	private List<Category> categories;
	
	public Product() {}

	public Product(String name, String description, float price) {
		
		this.name = name;
		this.description = description;
		this.price = price;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Category> getCategory() {
		return this.categories;
	}

	public void setCategory(Category category) {
		
		
		this.categories.add(category);
	}
	
	public void clearCategories() {
		
		this.categories = new ArrayList<Category>();
	}
	
	
		//System.out.println("yes");
		
//		if (this.categories == null) {
//			
//			this.categories.save(Arrays.asList(new Category[]{category}));
//			
//		}
//		
//		else {
//			this.categories.add(category);
//		}
//		//System.out.println(this.categories);	
	
	
	

}
