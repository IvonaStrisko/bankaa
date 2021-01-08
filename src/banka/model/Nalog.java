 package banka.model;

import java.time.LocalDateTime;

public class Nalog {

	private long id;
	private LocalDateTime kreiran;
	private double iznos;
	private LocalDateTime realizovan;
	
	private Racun uplatilac;
	private Racun primalac;
	
	
	public Nalog(long id, LocalDateTime kreiran, double iznos, LocalDateTime realizovan, Racun uplatilac,
			Racun primalac) {
		super();
		this.id = id;
		this.kreiran = kreiran;
		this.iznos = iznos;
		this.realizovan = realizovan;
		this.uplatilac = uplatilac;
		this.primalac = primalac;
	}


	@Override
	public String toString() {
		return "Nalog [id=" + id + ", kreiran=" + kreiran + ", iznos=" + iznos + ", realizovan=" + realizovan
				+ ", uplatilac=" + uplatilac + ", primalac=" + primalac + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Nalog other = (Nalog) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public LocalDateTime getKreiran() {
		return kreiran;
	}


	public void setKreiran(LocalDateTime kreiran) {
		this.kreiran = kreiran;
	}


	public double getIznos() {
		return iznos;
	}


	public void setIznos(double iznos) {
		this.iznos = iznos;
	}


	public LocalDateTime getRealizovan() {
		return realizovan;
	}


	public void setRealizovan(LocalDateTime realizovan) {
		this.realizovan = realizovan;
	}


	public Racun getUplatilac() {
		return uplatilac;
	}


	public void setUplatilac(Racun uplatilac) {
		this.uplatilac = uplatilac;
	}


	public Racun getPrimalac() {
		return primalac;
	}


	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
