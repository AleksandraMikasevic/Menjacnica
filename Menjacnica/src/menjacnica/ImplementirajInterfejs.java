package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class ImplementirajInterfejs {
	public void dodatiKurs(double kupovni, double srednji, double prodajni, GregorianCalendar datum){
		LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
		Kurs noviKurs = new Kurs();
		noviKurs.setDatumKursa(datum);
		noviKurs.setKupovni(kupovni);
		noviKurs.setProdajni(prodajni);
		noviKurs.setSrednji(srednji);
		kursevi = Valuta.getKursevi();
		kursevi.add(noviKurs);
		Valuta.setKursevi(kursevi);
	}
	public void obrisatiKurs(GregorianCalendar datum){
		LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
		kursevi = Valuta.getKursevi();
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatumKursa().equals(datum)) kursevi.remove(i);
		}
		Valuta.setKursevi(kursevi);
	}
	
	public Kurs pronadjiKurs(GregorianCalendar datum){
		LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
		Kurs trazeni = null;
		kursevi = Valuta.getKursevi();
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatumKursa().equals(datum)) {
				trazeni = kursevi.get(i);
				break;
			}}
	
		return trazeni;
		
	}

}
