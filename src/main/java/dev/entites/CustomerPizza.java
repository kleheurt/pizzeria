package dev.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_pizza")
public class CustomerPizza implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2738848905481319971L;

	@Id
	@ManyToOne
	@JoinColumn(name="customer_order_id")
	private CustomerOrder order;
	
	@Id
	@ManyToOne
	@JoinColumn(name="pizza_id")
	private Pizza pizza;
	
	private int qty;

	public CustomerOrder getOrder() {
		return order;
	}

	public void setOrder(CustomerOrder order) {
		this.order = order;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
