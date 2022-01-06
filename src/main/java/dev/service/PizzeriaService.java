package dev.service;

import java.util.List;

import javax.persistence.EntityManager;

import dev.entites.Customer;
import dev.exception.PizzeriaException;

public class PizzeriaService {
	
	private EntityManager em;
	
	public PizzeriaService(EntityManager em) {
		this.em = em;
	}
	
	public List<?> lister(Class<?> cls){
		return em.createQuery("select x from "+cls.getSimpleName()+" x", cls).getResultList();
	}
	
	public void inserer(Object o) {
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
	}
	
	public void maj(int id, Customer c) throws Exception {
		Customer client = em.find(Customer.class, id);
		if(client == null) throw new PizzeriaException("Client introuvable");
		em.getTransaction().begin();
		client.setAddress(c.getAddress());
		client.setName(c.getName());
		client.setPhone(c.getPhone());
		em.getTransaction().commit();
	}
	

}
