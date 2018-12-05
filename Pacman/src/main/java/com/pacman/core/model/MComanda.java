package com.pacman.core.model;

import java.util.ArrayList;

import com.pacman.core.entity.Comanda;

import antlr.collections.List;

public class MComanda {
	private int numeromesa ;
	//private String idcuenta ;
	private ArrayList<Integer> idconsumible ;
	private String comentario ;
	
	//Constructors
	public MComanda() {
	}
	/*
	public MComanda(Comanda comanda) {
		//this.idlista = comanda.getIdlista();
		this.idcuenta = comanda.getCuenta().getIdcuenta();
		this.idconsumible = comanda.getConsumible().getIdconsumible();
	}
	*/
	
	
	public MComanda(int numeromesa, ArrayList<Integer> idconsumible,String comentario) {
		//this.idlista = idlista;
		this.numeromesa = numeromesa;
		this.idconsumible = idconsumible;
		this.comentario = comentario ;
	}
	
	// Getter and Setter
	
	/*
	public int getIdlista() {
		return idlista;
	}
	
	

	public void setIdlista(int idlista) {
		this.idlista = idlista;
	}
	*/

	public int getNumeromesa() {
		return numeromesa;
	} 
	
	public void setNumeromesa(int numeromesa) {
		this.numeromesa = numeromesa;
	}
	public ArrayList<Integer> getIdconsumible() {
		return idconsumible;
	}
	public void setIdconsumible(ArrayList<Integer> idconsumible) {
		this.idconsumible = idconsumible;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}	
	
	
}
