package com.pacman.core.services;

import org.springframework.stereotype.Service;

import com.pacman.core.repository.ConsumibleRepositorio;
import com.pacman.core.converter.ConvertidorConsumible;
import com.pacman.core.entity.Consumible;
import com.pacman.core.model.MConsumible;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Service("servicioconsumible")
public class ConsumibleService {
	@Autowired
	@Qualifier("repositorioconsumible")
	private ConsumibleRepositorio repositorio ;
	@Autowired
	@Qualifier("convertidorconsumible")
	private ConvertidorConsumible convertidor ;
	
	public boolean insertarConsumible(Consumible consumible) {
		try {
			repositorio.save(consumible);
			return true ;
		} catch(Exception e) {
			return false ;
		}
	}
	
	public boolean actualizarConsumible(Consumible consumible) {
		try {
			repositorio.save(consumible) ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean borrarConsumible(int id) {
		try {
			Consumible aux = repositorio.findByIdconsumible(id) ;
			repositorio.delete(aux);
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public List<MConsumible> listarConsumibles(){ //metodo obtiene todos 
		List<Consumible> aux = repositorio.findAll() ;
		return convertidor.convertirListaConsumible(aux);
	}
	
	public Consumible devolverConsumible(int idconsumible) {
		return repositorio.findByIdconsumible(idconsumible);
		
	}
}
