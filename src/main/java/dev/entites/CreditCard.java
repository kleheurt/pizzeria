package dev.entites;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CreditCard {
	
	@Id
	private int id;
	
	private String name;
	private String number;
	
	@OneToMany
	private Set<CustomerOrder> orders;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Set<CustomerOrder> getOrders() {
		return orders;
	}
	public void setOrders(Set<CustomerOrder> orders) {
		this.orders = orders;
	}
	
	

}
