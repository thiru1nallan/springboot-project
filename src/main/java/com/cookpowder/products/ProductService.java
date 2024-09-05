package com.cookpowder.products;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	List<Aachimasala> powderList=new ArrayList<>();
	
	@Autowired
	powderRepo repo;
	public List<Aachimasala> getThepowders(){
		// this method will give the list of powders objects
		  return repo.findAll() ;
		
	}
	public String addAachimasala(Aachimasala aa){
		repo.save(aa);
		return "success";
	}
	
  public String removeAachimasala(String name)	{
	  boolean check=false;
	    for(Aachimasala aachimasala:repo.findAll())
	    {
	      if(aachimasala.getName().equals(name))
	      {
	        repo.delete(aachimasala);
	        check=true;
	      }
	      
	    } 
	    if(!check)
	    throw new ProductNotfoundException("Product not exist",LocalDateTime.now(),HttpStatus.NOT_FOUND.value());
	    else
	      return "Product removed Successfully";
	  }
  
public String updateAachimasala(String name, int price) {
	// TODO Auto-generated method stub
	boolean check=false;
	for(Aachimasala aachimasala:repo.findAll())
	{
		
		if(aachimasala.getName().equals(name)) {
			aachimasala.setPrice(price);
			repo.save(aachimasala);
			check=true;
		}
	}
	  if(!check) throw new ProductAlreadyExistException("Product not exist",LocalDateTime.now(),HttpStatus.NOT_FOUND.value());
	  else
			return "Product Successfully updated";
		
	 // return "Aachimasala not found";
	}

	
}
	


