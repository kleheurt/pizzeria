package dev.ihm;

import java.util.List;

import dev.service.PizzeriaService;

public class OptionListage  {
	
	private String libelle;
	
	public OptionListage(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public String getLibelle() {
		return this.libelle;
	}

	
	public void traiter(PizzeriaService ps) {
		List<?> liste = null;
		
		try {
			liste = ps.lister(Class.forName("dev.entites."+libelle));
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(liste != null)
			for (Object object : liste) System.out.println(object);
	}
}
