package com.pontoeletronico.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_registro;
	private String tagRfid;
	private long id_tipo;
	private LocalDateTime data;
	
	public Registro() { }
	
	public Registro(String tagRfid, long id_tipo, LocalDateTime data) {
		this.tagRfid = tagRfid;
		this.id_tipo = id_tipo;
		this.data = data;
	}

	public String getTag_rfid() {
		return tagRfid;
	}

	public void setTag_rfid(String tagRfid) {
		this.tagRfid = tagRfid;
	}
	public int getId_registro() {
		return id_registro;
	}
	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}
	public long getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(long id_tipo) {
		this.id_tipo = id_tipo;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
