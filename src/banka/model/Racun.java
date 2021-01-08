package banka.model;

import java.util.ArrayList;
import java.util.List;


public class Racun {

	private long id;
	private int sifra;
	private String vlasnik;
	private double stanje;
	private double raspolozivoStanje;
	private String riletovAtribut;
	
	private List <Nalog> nalogZaUplatu = new ArrayList<>();
	private List <Nalog> nalogZaIsplatu = new ArrayList<>();
	
	


	@Override
	public String toString() {
		return "Racun [id=" + id + ", sifra=" + sifra + ", vlasnik=" + vlasnik + ", stanje=" + stanje
				+ ", raspolozivoStanje=" + raspolozivoStanje + ", nalogZaUplatu=" + nalogZaUplatu + ", nalogZaIsplatu="
				+ nalogZaIsplatu + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}


	public Racun(long id, int sifra, String vlasnik, double stanje, double raspolozivoStanje, List<Nalog> nalogZaUplatu,
			List<Nalog> nalogZaIsplatu) {
		super();
		this.id = id;
		this.sifra = sifra;
		this.vlasnik = vlasnik;
		this.stanje = stanje;
		this.raspolozivoStanje = raspolozivoStanje;
		this.nalogZaUplatu = nalogZaUplatu;
		this.nalogZaIsplatu = nalogZaIsplatu;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(raspolozivoStanje);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sifra;
		temp = Double.doubleToLongBits(stanje);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vlasnik == null) ? 0 : vlasnik.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racun other = (Racun) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(raspolozivoStanje) != Double.doubleToLongBits(other.raspolozivoStanje))
			return false;
		if (sifra != other.sifra)
			return false;
		if (Double.doubleToLongBits(stanje) != Double.doubleToLongBits(other.stanje))
			return false;
		if (vlasnik == null) {
			if (other.vlasnik != null)
				return false;
		} else if (!vlasnik.equals(other.vlasnik))
			return false;
		return true;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getSifra() {
		return sifra;
	}


	public void setSifra(int sifra) {
		this.sifra = sifra;
	}


	public String getVlasnik() {
		return vlasnik;
	}


	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}


	public double getStanje() {
		return stanje;
	}


	public void setStanje(double stanje) {
		this.stanje = stanje;
	}


	public double getRaspolozivoStanje() {
		return raspolozivoStanje;
	}


	public void setRaspolozivoStanje(double raspolozivoStanje) {
		this.raspolozivoStanje = raspolozivoStanje;
	}


	public List<Nalog> getNalogZaUplatu() {
		return nalogZaUplatu;
	}


	public void setNalogZaUplatu(List<Nalog> nalogZaUplatu) {
		this.nalogZaUplatu = nalogZaUplatu;
	}


	public List<Nalog> getNalogZaIsplatu() {
		return nalogZaIsplatu;
	}


	public void setNalogZaIsplatu(List<Nalog> nalogZaIsplatu) {
		this.nalogZaIsplatu = nalogZaIsplatu;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
