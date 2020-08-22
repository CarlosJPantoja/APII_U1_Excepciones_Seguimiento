package model;

import java.util.ArrayList;

public class MiniMarket {
	private ArrayList<Person> persons;
	private int intentos;
	
	public MiniMarket() {
		persons = new ArrayList<Person>();
		intentos = 0;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
}
