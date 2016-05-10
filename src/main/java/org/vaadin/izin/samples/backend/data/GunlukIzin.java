package org.vaadin.izin.samples.backend.data;

import java.sql.Timestamp;
import java.util.Date;

public class GunlukIzin {
	
	

	private Long id;
	private String sebep;
	private Timestamp izinBasTarih;
	private Timestamp izinBitTarih;
	private int durum;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSebep() {
		return sebep;
	}
	public void setSebep(String sebep) {
		this.sebep = sebep;
	}
	public Timestamp getIzinBasTarih() {
		return izinBasTarih;
	}
	public void setIzinBasTarih(Timestamp izinBasTarih) {
		this.izinBasTarih = izinBasTarih;
	}
	public Timestamp getIzinBitTarih() {
		return izinBitTarih;
	}
	public void setIzinBitTarih(Timestamp izinBitTarih) {
		this.izinBitTarih = izinBitTarih;
	}
	public int getDurum() {
		return durum;
	}
	public void setDurum(int durum) {
		this.durum = durum;
	}
	
	

}
