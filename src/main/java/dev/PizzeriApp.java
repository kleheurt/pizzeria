package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import dev.ihm.Menu;
import dev.service.PizzeriaService;


public class PizzeriApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManagerFactory emf = null;

		try {
			emf = Persistence.createEntityManagerFactory("pu_pizzeria");

			EntityManager em = emf.createEntityManager();
			
			PizzeriaService ps = new PizzeriaService(em);
			
			Menu menu = new Menu(ps);
			
			menu.traiter();
			
			em.close();
			
			
		} 
		catch (PersistenceException e) {
			System.err.println("Erreur de persistance : " + e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			if (emf != null) {
				emf.close();
			}
		}

		

	}

}
