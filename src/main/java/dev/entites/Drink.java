package dev.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Drink {
	
	@Id
	private String name;
	
	private int price;

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
	
	@Override
	public String toString() {
		return this.name;
	}
	

}
