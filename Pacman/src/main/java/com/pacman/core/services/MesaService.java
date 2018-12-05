package com.pacman.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pacman.core.converter.ConvertidorMesa;
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MMesa;
import com.pacman.core.repository.MesaRepositorio;

@Service("serviciomesa")
public class MesaService {
	@Autowired
	@Qualifier("repositoriomesa")
	private MesaRepositorio repositorio ;
	@Autowired
	@Qualifier("convertidormesa")
	private ConvertidorMesa convertidor ;
	
	public boolean insertarMesa(Mesa mesa) {
		try {
			repositorio.save(mesa);
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean actualizarMesa(Mesa mesa) {
		try {
			repositorio.save(mesa);
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean borrarMesa(int num) {
		try {
			//Mesa aux = repositorio.findBynumero(num);
			//repositorio.delete(aux);
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public List<MMesa> obtenerMesa() {
			List<Mesa> aux = repositorio.findAll();
			return convertidor.convertirListaMesa(aux);
	}
	
	public Mesa obtenerMesita(int idmesa) {
		return repositorio.findByNumero(idmesa) ;
	}
}
