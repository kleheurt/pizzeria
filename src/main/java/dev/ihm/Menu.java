package dev.ihm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import dev.service.PizzeriaService;

public class Menu {
	
	private Map<Integer, OptionMenu> options;
	private Scanner scan;
	private PizzeriaService ps;
	
	public Menu(PizzeriaService ps) {
		this.ps = ps;
		this.scan = new Scanner(System.in);
		
		this.options = new HashMap<Integer, OptionMenu>();
		
		Map<Integer, OptionListage> optionsList = new HashMap<>();
		optionsList.put(1,new OptionListage("Pizza"));
		optionsList.put(2,  new OptionListage("Customer"));
		optionsList.put(3,  new OptionListage("Drink"));
		OptionMenuLister oml = new OptionMenuLister(optionsList);
		this.options.put(1,oml);
		
	}
	
	
	public void afficher() {
		for (Map.Entry<Integer, OptionMenu> opt : options.entrySet()) {
			System.out.println("( "+opt.getKey()+" ) "+opt.getValue().getLibelle());
		}
		
	}
	
	public void traiter() {
		this.afficher();
		
		int cle = scan.nextInt();
		
		OptionMenu opt = options.get(cle);
		
		if(opt != null) opt.traiter(ps, scan);
		else this.traiter();
	}
	

}
