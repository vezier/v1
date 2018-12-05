package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="cuenta")
@Entity
public class Cuenta implements Serializable{
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Id
	@Column(name="id_cuenta")
	private int idcuenta ;
	@Column(name="estado_cuenta")
	private int estadocuenta ;
	
	// Constructors
	
	public Cuenta() {
		this.estadocuenta= 1;
	}

	public Cuenta(int idcuenta, int estado_cuenta) {
		this.idcuenta = idcuenta;
		this.estadocuenta = estado_cuenta;
	}
	
	// Getter and Setter

	public int getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}

	public int getEstadocuenta() {
		return estadocuenta;
	}

	public void setEstadocuenta(int estadocuenta) {
		this.estadocuenta = estadocuenta;
	}
	
}
