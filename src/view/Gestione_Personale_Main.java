package view;

import model.Dipendente;
import model.Sviluppatore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controller.Azienda;

public class Gestione_Personale_Main {

	private static String FILE = "./datiDipendenti";
	
	public static void main(String[] args) {
		List<Dipendente> dipendenti = new ArrayList<>();

		Sviluppatore svil1 = new Sviluppatore("Franco Battiato", 1500, "java", "javascript", "python");
		System.out.println(svil1);
		
		aggiuntaPersonale(dipendenti);

	}
	
	public static boolean aggiuntaPersonale (List<Dipendente> dipendenti) {
		File mioFile = new File(FILE);
		
		try (BufferedReader br = new BufferedReader(new FileReader(mioFile))) {
			br.readLine(); 
			//legge la seconda riga saltando la prima
			String dato;
			
			while ((dato = br.readLine()) != null) { //legge il file FILE e se la riga non è null prosegue
				if (dato.isBlank()) continue; //se la riga non è vuota continua e prova a inserire il dato 
				try {
					dipendenti.add(Azienda.sortDipendente(dato));
				} catch (Exception e) {
					System.out.println("C'è stato un problema");
				} 
			} 
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return false; //ha beccato una eccezione
		}
		
		return true; //è andato a buon fine
	} 
	
	public Dipendente cercaDipendente () {
		return null;
	}
	
	public void rimuoviDipendente () {
		
	}
}


