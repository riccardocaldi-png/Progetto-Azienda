package model;

import java.util.List;

public class Manager extends Dipendente {
	
	private double bonus;
	List<Dipendente> dipendenti;
	List<String> progetti;

	
	public Manager(String nome, double stipendioBase, double bonus) {
		super(nome, stipendioBase);
		this.bonus = bonus;
		addDipendenti();
		addProgetti();
		}
	
	public void addDipendenti(Dipendente...dipendenti) {
		for (Dipendente dipendente : dipendenti) {
			this.dipendenti.add(dipendente);
		}
	}
 
	public void addProgetti (String...progetti) {
		for (String progetto : progetti) {
			this.progetti.add(progetto);
		}
	}
	
	public void addProgramma () {
		
	}
	
	@Override
	public double calcolaStipendio() {
		return 0;
	}

	@Override
	public Dipendente fromCSV(String riga) {
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo = Manager | Dipendenti= "+ dipendenti + " | Progetti= " + progetti ;
	}
	
	 

}
