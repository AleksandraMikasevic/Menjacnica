package specifikacija;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface SpecifikacijaInterfejsa {
public void dodatiKurs(double kupovni, double srednji, double prodajni, GregorianCalendar datum);
public void obrisatiKurs(GregorianCalendar datum);
public Kurs pronadjiKurs(GregorianCalendar datum);
}
