package com.cookpowder.products;

import java.time.LocalDateTime;

public class ProductNotfoundException extends RuntimeException {

	private String message;
	  LocalDateTime timestamp;
	  int statuscode;
	  public ProductNotfoundException()
	  {
	    
	  }
	  public ProductNotfoundException(String message,LocalDateTime timestamp,int statuscode)
	  {
	    super(message);
	    this.message=message;
	    this.timestamp=timestamp;
	    this.statuscode=statuscode;
	  }
	  public int getStatuscode() {
	    return statuscode;
	  }
	  public void setStatuscode(int statuscode) {
	    this.statuscode = statuscode;
	  }
	  public String getMessage() {
	    return message;
	  }
	  public void setMessage(String message) {
	    this.message = message;
	  }
	  public LocalDateTime getTimestamp() {
	    return timestamp;
	  }
	  public void setTimestamp(LocalDateTime timestamp) {
	    this.timestamp = timestamp;
	  }
	  
	  
	  
	}

	


