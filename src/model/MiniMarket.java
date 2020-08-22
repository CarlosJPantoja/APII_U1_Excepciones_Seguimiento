package model;

import java.util.ArrayList;

import customExceptions.*;

import java.time.LocalDate;

public class MiniMarket {
	private ArrayList<Person> persons;
	private int intentos;
	
	public MiniMarket() {
		persons = new ArrayList<Person>();
		intentos = 0;
	}
	
	public String addPerson(int type, String numDocument) {
		String msg = "";
		try {
			int day = LocalDate.now().getDayOfMonth();
			int n = Integer.parseInt(String.valueOf(numDocument.charAt(numDocument.length()-2)));
			boolean dayPar = isPar(day);
			boolean nPar = isPar(n);
			if((dayPar==false && nPar==false) || (dayPar==true && nPar==true)) {
				throw new DiaException("hoy no es su pico y cedula");
			}
			Person newPerson = new Person(type, numDocument);
			persons.add(newPerson);
			msg = "Se agrego correctamente";
		} catch(DocumentoException e) {
			msg = "No se pudo agregar, "+e.getMessage();
		} catch(DiaException e) {
			msg = "No se pudo agregar, "+e.getMessage();
		} finally {
			intentos++;
		}
		return msg;
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}

	public boolean isPar(int n) {
		boolean par = false;
		if(n%2 == 0) {
			par = true;
		}
		return par;
	}
	
	public int getIntentos() {
		return intentos;
	}
}
