package org.vaadin.izin.samples.backend.data;

import java.util.Date;

public class YillikIzin {

	private Long id;
	private String izinTur;
	private Date izinBasTarih;
	private Date izinBitTarih;
	private int durum;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIzinTur() {
		return izinTur;
	}
	public void setIzinTur(String izinTur) {
		this.izinTur = izinTur;
	}
	public Date getIzinBasTarih() {
		return izinBasTarih;
	}
	public void setIzinBasTarih(Date izinBasTarih) {
		this.izinBasTarih = izinBasTarih;
	}
	public Date getIzinBitTarih() {
		return izinBitTarih;
	}
	public void setIzinBitTarih(Date izinBitTarih) {
		this.izinBitTarih = izinBitTarih;
	}
	public int getDurum() {
		return durum;
	}
	public void setDurum(int durum) {
		this.durum = durum;
	}
	
	

}
