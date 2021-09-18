/*Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).*/

package Autobus;

public class Vozac extends Covek {
	private String Zvanje;

	public Vozac(String imeIPrezime, String Zvanje) {
		super(imeIPrezime);
		this.Zvanje = Zvanje;
	}

	public String getZvanje() {
		return Zvanje;
	}

	public void setZvanje(String Zvanje) {
		this.Zvanje = Zvanje;
	}

	@Override
	public String toString() {

		return "Vozac " + super.getImeIPrezime() + "\nZanimanje " + Zvanje;
	}
}
