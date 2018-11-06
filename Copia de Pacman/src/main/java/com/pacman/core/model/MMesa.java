package com.pacman.core.model;

import com.pacman.core.entity.Mesa;

public class MMesa {
	private String id_mesa ;
	private int numero ;
	private int estado ; // 0 or 1 if depends on
	
	//constructor
	
	public MMesa(Mesa mesa) {
		this.id_mesa = mesa.getId_mesa();
		this.numero = mesa.getNumero();
		this.estado = mesa.getEstado();
	}
	
	public MMesa() {
		
	}
	public MMesa(String id_mesa, int numero, int estado) {
		this.id_mesa = id_mesa;
		this.numero = numero;
		this.estado = estado;
	}
	// getter and setter
	public String getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(String id_mesa) {
		this.id_mesa = id_mesa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
