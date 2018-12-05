package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="mesa")
@Entity
public class Mesa implements Serializable{
	@Id
	@Column(name="numero")
	private int numero ;
	@ManyToOne
	@JoinColumn(name="id_cuenta")
	private  Cuenta cuenta ; // 0 or 1 if depends on	
	
	// Constructors
	
	public Mesa() {
		
	}

	public Mesa(int numero, Cuenta estado) {
		this.numero = numero;
		this.cuenta = estado;
	}
	
	// Getter and Setter
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}	
}
