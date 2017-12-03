package org.polisa.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Polisa {
	private Integer id;
	
	private String nrPolisy;
	
	private LocalDate dPodpisania;
	
	private LocalDate dRozpoczecia;
	
	private LocalDate dZakoczenia;
	
	private BigDecimal skladka;
	
	public Polisa(Integer id, String numer, BigDecimal skladka) {
		this.id = id;
		this.nrPolisy = numer;
		this.dPodpisania = LocalDate.now();
		this.dRozpoczecia = LocalDate.now().plusDays(1);
		this.dZakoczenia = this.dRozpoczecia.plusYears(1);
		this.skladka = skladka;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNrPolisy() {
		return nrPolisy;
	}


	public void setNrPolisy(String nrPolisy) {
		this.nrPolisy = nrPolisy;
	}


	public LocalDate getdPodpisania() {
		return dPodpisania;
	}


	public void setdPodpisania(LocalDate dPodpisania) {
		this.dPodpisania = dPodpisania;
	}


	public LocalDate getdRozpoczecia() {
		return dRozpoczecia;
	}


	public void setdRozpoczecia(LocalDate dRozpoczecia) {
		this.dRozpoczecia = dRozpoczecia;
	}


	public LocalDate getdZakoczenia() {
		return dZakoczenia;
	}


	public void setdZakoczenia(LocalDate dZakoczenia) {
		this.dZakoczenia = dZakoczenia;
	}


	public BigDecimal getSkladka() {
		return skladka;
	}


	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}


	@Override
	public String toString() {
		return "Polisa [id=" + id + ", nrPolisy=" + nrPolisy + ", dPodpisania=" + dPodpisania + ", dRozpoczecia="
				+ dRozpoczecia + ", dZakoczenia=" + dZakoczenia + ", skladka=" + skladka + "]";
	}

}
