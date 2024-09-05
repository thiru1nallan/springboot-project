package com.cookpowder.products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aachimasala{
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long Aachimasalaid; 

    public long getAachimasalaid() {
		return Aachimasalaid;
	}
	public void setAachimasalaid(long aachimasalaid) {
		Aachimasalaid = aachimasalaid;
	}
	
	
	public Aachimasala() {
		super();
	}


	private	String name;
	private int price;
    private String quantity;

	public Aachimasala(long aachimasalaid, String name, int price, String quantity) {
		super();
		Aachimasalaid = aachimasalaid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Aachimasala [Aachimasalaid=" + Aachimasalaid + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
    
	
}
