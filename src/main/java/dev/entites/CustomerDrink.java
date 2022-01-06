package dev.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_drink")
public class CustomerDrink implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5773291139835169618L;

	@Id
	@ManyToOne
	@JoinColumn(name="customer_order_id")
	private CustomerOrder order;
	
	@Id
	@ManyToOne
	@JoinColumn(name="drink_id")
	private Drink drink;
	
	private int qty;

	public CustomerOrder getOrder() {
		return order;
	}

	public void setOrder(CustomerOrder order) {
		this.order = order;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
