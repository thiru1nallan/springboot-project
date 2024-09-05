package com.cookpowder.products;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=
			ProductNotfoundException.class)
	 
	public @ResponseBody Map HandleException(ProductNotfoundException ex) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("timestamp",ex.getTimestamp()+"");
		hm.put("status", ex.getStatuscode()+"");
		hm.put("message", ex.getMessage());

		return hm;
		
	}
	
	@ExceptionHandler(value=ProductAlreadyExistException.class)
	 
	public @ResponseBody Map HandleException(ProductAlreadyExistException ex) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("timestamp",ex.getTimestamp()+"");
		hm.put("status", ex.getStatuscode()+"");
		hm.put("message", ex.getMessage());

		return hm;
		
	}

}
