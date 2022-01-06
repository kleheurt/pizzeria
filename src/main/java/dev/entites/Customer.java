package dev.entites;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	private int id;
	
	private String name;
	private String address;
	private String phone;
	
	@OneToMany(mappedBy="customer")
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<CustomerOrder> getOrders() {
		return orders;
	}
	public void setOrders(Set<CustomerOrder> orders) {
		this.orders = orders;
	}
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
