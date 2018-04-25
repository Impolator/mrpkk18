package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	//
	
	private String vorname;
	private String nachname;
	protected boolean female;
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname (String vorname) {
		this.vorname
	}
}
