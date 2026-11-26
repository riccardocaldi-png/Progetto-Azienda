package model;

public class ConsulentePiva extends Dipendente {
	public int durataLavoro;

	public ConsulentePiva(String nome, double stipendioBase, int durataLavoro) {
		super(nome, stipendioBase);
		this.durataLavoro = durataLavoro;
	}


	public int getDurataLavoro() {
		return durataLavoro;
	}


	public void setDurataLavoro(int durataLavoro) {
		this.durataLavoro = durataLavoro;
	}


	@Override
	public double calcolaStipendio() {
		return 0;
	}

	@Override
	public Dipendente fromCSV(String riga) {
		return null;
	}
}
