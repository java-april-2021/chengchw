package com.chengchw.prodAndCate.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.chengchw.prodAndCate.Model.Category;
import com.chengchw.prodAndCate.Model.Product;
import com.chengchw.prodAndCate.Service.CategoryService;
import com.chengchw.prodAndCate.Service.ProductService;

@Controller
public class ProdCatController {

	private final ProductService prodSer;
	private final CategoryService catSer;
	//private final CategoryProductService catprodSer;
	
	public ProdCatController(ProductService prodSer,CategoryService catSer) {
		
		this.catSer = catSer;
		this.prodSer = prodSer;
	}
	
	
	@RequestMapping("/products/new")
	public String prodPage(@ModelAttribute("newprod") Product newprod, Model model) {
		List<Product> allprod = this.prodSer.getAllProd();
		model.addAttribute("allProds",allprod);
		
		return "newprodpage.jsp";
	}
	
	@PostMapping("/createprod")
	public String createProd(@ModelAttribute("newprod") Product newprod) {
		
		//System.out.println(newprod.getDescription());
		
		this.prodSer.createProd(newprod);
		
		
		
		return "redirect:/products/new";
		
	}
	
	@RequestMapping("/categories/new")
	public String catPage(@ModelAttribute("newcat") Category newcat, Model model) {
		
		List<Category> allcat = this.catSer.getAllCat();
		model.addAttribute("allCat", allcat);
		
		return "newcatpage.jsp";
	}
	
	@PostMapping("/createcat")
	public String createCat(@ModelAttribute("newcat") Category newcat) {
		
		this.catSer.createCat(newcat);
	
		return "redirect:/categories/new";
		
	}
	
	@PostMapping("/chooseproduct")
	public String viewproduct(@RequestParam("selectprodid") Long id) {
		
		
		return "redirect:/products/" + id;
	}
	
	@RequestMapping("/products/{prodid}")
	public String viewprodpage(@PathVariable(value = "prodid") Long prodid, 
							    Model model) {
		
		Product showprod = this.prodSer.getProdById(prodid);
		System.out.println(showprod.getCategory());
		model.addAttribute("showprod", showprod);
		
		List <Category> allunlistcat = this.catSer.getCateWithoutProd(showprod);
		
		model.addAttribute("allunlistcat",allunlistcat);
		
		return "prodpage.jsp";
	}
	
	@PostMapping("/addcadegory/{prodid}")
	public String addCatToProd(@RequestParam("selectcatid") Long catid,@PathVariable(value = "prodid") Long prodid) {
		
		System.out.println(catid);
		System.out.println(prodid);
		System.out.println(this.prodSer.getProdById(prodid).getCategory().isEmpty());
		Category addCat = this.catSer.getCatById(catid);
		Product addProd = this.prodSer.getProdById(prodid);
		//this.catSer.getCatById(catid).setProducts(addProd);
		
		
		addProd.setCategory(addCat);
		//addCat.setProducts(addProd);
		this.prodSer.updateProdById(addProd); 
		this.catSer.udateCat(addCat);
		System.out.println(this.prodSer.getProdById(prodid).getCategory());
		
		return  "redirect:/products/" + prodid;
	}
	
	@PostMapping("/choosecategory")
	public String viewcategory(@RequestParam("selectcatid") Long id) {
		
		return "redirect:/categories/" + id;
	}
	
	@RequestMapping("/categories/{catid}")
	public String viewcatpage(@PathVariable(value = "catid") Long id, Model model) {
		
		
		Category showcat = this.catSer.getCatById(id);
		List<Product> allunlistprod = this.prodSer.getProdWithoutCat(showcat);
		model.addAttribute("showcat",showcat);
		model.addAttribute("allunlistprod",allunlistprod);
		
		
		return "catepage.jsp";
	}
	
	@PostMapping("/addproduct/{catid}")
	public String addProdToCat(@RequestParam("selectprodid") Long prodid,@PathVariable(value = "catid") Long catid) {
		
		System.out.println(catid);
		System.out.println(prodid);
		Category addCat = this.catSer.getCatById(catid);
		Product addProd = this.prodSer.getProdById(prodid);
		//this.catSer.getCatById(catid).setProducts(addProd);
		//addProd.setCategory(addCat);
		addCat.setProducts(addProd);
		this.prodSer.updateProdById(addProd); 
		this.catSer.udateCat(addCat);
		System.out.println(this.prodSer.getProdById(prodid).getCategory());
		
		return  "redirect:/categories/" + catid;
	}
	
	
	@GetMapping("/resercat/{catid}")
	public String resetcat(@PathVariable(value = "catid") Long catid) {
		
		Category addCat = this.catSer.getCatById(catid);
		List<Product> placeholder = addCat.getProducts();
		addCat.clearProducts();
		System.out.println(addCat.getProducts());
		this.catSer.udateCat(addCat);	
		System.out.println(addCat.getProducts());
		
		return "redirect:/categories/" + catid;
	}
	
	@GetMapping("/reserprod/{prodid}")
	public String resetprod(@PathVariable(value = "prodid") Long prodid) {
		Product addProd = this.prodSer.getProdById(prodid);
		//Category addCat = this.catSer.getCatById(catid);
		//List<Product> placeholder = addCat.getProducts();
		addProd.clearCategories();
		//System.out.println(addCat.getProducts());
		this.prodSer.updateProdById(addProd);
		//System.out.println(addCat.getProducts());
		
		return "redirect:/products/" + prodid;
	}
	
	
	
}
