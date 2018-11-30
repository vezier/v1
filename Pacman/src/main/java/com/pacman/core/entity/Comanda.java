package com.pacman.core.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name="comanda")
@Entity
public class Comanda implements Serializable{
	//@GeneratedValue
	@Id
	@Column(name="id_lista")
	private int idlista ;
	@ManyToOne
	@JoinColumn(name="id_cuenta")
	private Cuenta cuenta ;
	@ManyToOne
	@JoinColumn(name="id_consumible")
	private Consumible consumible ;
	
	//Constructors
	public Comanda() {
		
	}
	
	public Comanda(int idlista, Cuenta cuenta, Consumible consumible) {
		this.idlista = idlista;
		this.cuenta = cuenta;
		this.consumible = consumible;
	}
	
	// Getter and Setter
	public int getIdlista() {
		return idlista;
	}
	public void setIdlista(int idlista) {
		this.idlista = idlista;
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
