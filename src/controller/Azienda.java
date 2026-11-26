package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import model.Dipendente;

public class Azienda {

	 public static Dipendente sortDipendente (String dato) {
		 
		String[] campi = dato.split(",");
		
		String tipoDiDipendente = campi[0];
		
		switch (tipoDiDipendente) {
		case "Sviluppatore": 
			
			break;
		case "Manager": 
			
			break;
		case "ConsulenteEsterno": 
	
			break;
		case "ConsulentePiva": 
			
			break;
		 
		return null;
	 }

} 