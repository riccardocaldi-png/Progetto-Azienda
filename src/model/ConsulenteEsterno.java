package model;

public class ConsulenteEsterno extends Dipendente {

	private String aziendaOrigine;
	
	public ConsulenteEsterno(String nome, double stipendioBase, String aziendaOrigine) {
		super(nome, stipendioBase);
		this.aziendaOrigine = aziendaOrigine;
	}

	
	
	public String getAziendaOrigine() {
		return aziendaOrigine;
	}


	@Override
	public double calcolaStipendio() {
		return getStipendioBase();
	}

	@Override
	public Dipendente fromCSV(String riga) {
		return null;
	}

}
