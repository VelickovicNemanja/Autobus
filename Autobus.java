/*Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja. 
Moguce je dodati/ukloniti putnika kao i vozaca.*/

package Autobus;

public class Autobus {
	private String naziv;
	private int cenaKarte;
	private Vozac vozac;
	private Putnik putnik;

	public Autobus(String naziv, int cenaKarte, Vozac vozac, Putnik putnik) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.vozac = vozac;
		this.putnik = putnik;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public Putnik getPutnik() {
		return putnik;
	}

	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}

	public String toString() {
		return "\nAutobus: " + naziv + "\nVozac" + vozac + "Cena karte: " + cenaKarte + "din." + "\n" + putnik;
	}
}
