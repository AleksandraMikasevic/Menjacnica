package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
private double kupovni;
private double srednji;
private double prodajni;
private GregorianCalendar datumKursa;
public double getKupovni() {
	return kupovni;
}
public void setKupovni(double kupovni) {
	this.kupovni = kupovni;
}
public double getSrednji() {
	return srednji;
}
public void setSrednji(double srednji) {
	this.srednji = srednji;
}
public double getProdajni() {
	return prodajni;
}
public void setProdajni(double prodajni) {
	this.prodajni = prodajni;
}
public GregorianCalendar getDatumKursa() {
	return datumKursa;
}
public void setDatumKursa(GregorianCalendar datumKursa) {
	this.datumKursa = datumKursa;
}
}


