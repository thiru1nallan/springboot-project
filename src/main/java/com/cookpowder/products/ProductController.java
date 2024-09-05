package com.cookpowder.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
	private ProductService service;
	
	  @Autowired
	  public ProductController(ProductService service) {
		  this.service=service;
	  }
	
	@GetMapping("/powder")
	public String getpowder(Model model){
		List<Aachimasala>powder=service.getThepowders();
		model.addAttribute("products", powder);
		return "powder";
		 
	}
	
	@PostMapping("/powder")
	public String addAachimasala(@RequestBody Aachimasala aachimasala) {
		return service.addAachimasala(aachimasala);
	}
	
    @PutMapping("/powder")
	public String updateAachimasala(@RequestParam String name,int price) {
		return service.updateAachimasala(name,price);
	}
    @DeleteMapping("/powder/{name}")
	public String deleteAachimasala(@PathVariable	 String name) {
		return service.removeAachimasala(name);
	}
	
	
}
