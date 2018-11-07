package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name="comanda")
@Entity
public class Comanda implements Serializable{
	@GeneratedValue
	@Id
	@Column(name="id_lista")
	private String id_lista ;
	@JoinColumn(name="id_cuenta")
	private Cuenta cuenta ;
	@JoinColumn(name="id_consumible")
	private Consumible consumible ;
	
	//Constructors
	public Comanda() {
		
	}
	
	public Comanda(String id_lista, Cuenta cuenta, Consumible consumible) {
		this.id_lista = id_lista;
		this.cuenta = cuenta;
		this.consumible = consumible;
	}
	
	// Getter and Setter
	public String getId_lista() {
		return id_lista;
	}
	public void setId_lista(String id_lista) {
		this.id_lista = id_lista;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Consumible getConsumible() {
		return consumible;
	}
	public void setConsumible(Consumible consumible) {
		this.consumible = consumible;
	}	
}
