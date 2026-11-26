package model;

public abstract class Dipendente {
	
		private String nome;
		private double stipendioBase;
		

		public Dipendente(String nome, double stipendioBase) {
			this.nome = nome;
			this.stipendioBase = stipendioBase;
		}
		
		public abstract double calcolaStipendio();
		
		public String getNome() {
			return nome;
		}
		
		public double getStipendioBase() {
			return stipendioBase;
		}

		public void setStipendioBase(double stipendioBase) {
			this.stipendioBase = stipendioBase;
		}

public abstract Dipendente fromCSV (String riga);

@Override
public String toString() {
	return "Dipendente [nome=" + nome + ", stipendioBase=" + stipendioBase + "]";
}



} 
