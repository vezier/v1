package com.pacman.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="cuenta")
@Entity
public class Cuenta implements Serializable{
	//@GeneratedValue
	@Id
	@Column(name="id_cuenta")
	private String idcuenta ;
	@Column(name="estado_cuenta")
	private int estado_cuenta ;
	@ManyToOne
	@JoinColumn(name="id_mesa")
	private Mesa mesa ;
	
	// Constructors
	
	public Cuenta() {

	}

	public Cuenta(String idcuenta, int estado_cuenta, Mesa mesa) {
		this.idcuenta = idcuenta;
		this.estado_cuenta = estado_cuenta;
		this.mesa = mesa;
	}
	
	// Getter and Setter

	public String getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(String idcuenta) {
		this.idcuenta = idcuenta;
	}

	public int getEstado_cuenta() {
		return estado_cuenta;
	}

	public void setEstado_cuenta(int estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}	
	
}
