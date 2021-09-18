/*DOMACI
Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme.
Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja. 
Moguce je dodati/ukloniti putnika kao i vozaca. */

package Autobus;

public class AutobusMain {
	public static void main(String[] args) {

		Vozac v1 = new Vozac("Srba Srbic", "Sofer");
//		System.out.println(v1);
	Putnik p1 = new Putnik("Maka Makic", 500);
//		System.out.println(p1);
		Autobus a1 = new Autobus("Auto kodeks", 380, v1, p1);
		System.out.println(a1);

	}
}
