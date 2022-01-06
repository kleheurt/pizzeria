package dev.ihm;

import java.util.Map;
import java.util.Scanner;

import dev.service.PizzeriaService;

public class OptionMenuLister extends OptionMenu{
	
	private Map<Integer, OptionListage> options;
	

	public OptionMenuLister(Map<Integer, OptionListage> options) {
		super();
		this.libelle = "Lister";
		this.options = options;
	}
	
	public void afficher() {
		for (Map.Entry<Integer, OptionListage> opt : options.entrySet()) {
			System.out.println("( "+opt.getKey()+" ) "+opt.getValue().getLibelle());
		}
	}

	@Override
	public void traiter(PizzeriaService ps, Scanner scan) {
		this.afficher();
		
		int cle = scan.nextInt();
		
		OptionListage opt = options.get(cle);
		
		if(opt != null) opt.traiter(ps);
		else this.traiter(ps, scan);
		
	}
	
}
