package dev.ihm;

import java.util.Scanner;

import dev.service.PizzeriaService;

public abstract class OptionMenu {
	
	protected String libelle;
	
	public OptionMenu() {
		super();
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public abstract void afficher();

	public abstract void traiter(PizzeriaService ps, Scanner scan);
}
