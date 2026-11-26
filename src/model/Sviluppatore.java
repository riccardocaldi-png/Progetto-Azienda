package model;

import java.util.ArrayList;
import java.util.List;

public class Sviluppatore extends Dipendente {

	private List<String> programmi = new ArrayList<>();
	
	public Sviluppatore(String nome, double stipendioBase, String...Programmi) {
		super(nome, stipendioBase);
		for (String programma : Programmi) {
			this.programmi.add(programma);
		}
	}

	@Override
	public double calcolaStipendio() {		return getStipendioBase();
	}

	@Override
	public Dipendente fromCSV(String riga) {		return null;	
	}

	
	public List<String> getProgrammi() {
		return programmi;
	}
	
	public void addProgramma (String programma) {
		if (programma != null && !programma.isBlank()) {
			this.programmi.add(programma);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "|" + "tipo= Sviluppatore | programmi=" + programmi;
	} 
	
	
 
}
