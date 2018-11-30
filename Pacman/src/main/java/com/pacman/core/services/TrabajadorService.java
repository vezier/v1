package com.pacman.core.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pacman.core.converter.ConvertidorTrabajador;
import com.pacman.core.entity.Trabajador;
import com.pacman.core.model.MTrabajador;
import com.pacman.core.repository.TrabajadorRepositorio;

@Service("serviciotrabajador")
public class TrabajadorService {
	@Autowired
	@Qualifier("repositoriotrabajador")
	private TrabajadorRepositorio repositorio ;
	@Autowired
	@Qualifier("convertidortrabajador")
	private ConvertidorTrabajador convertidor ;
	
	public boolean insertarTrabajador(Trabajador t) {
		try {
			repositorio.save(t) ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	public boolean modificarTrabajador(Trabajador t) {
		try {
			repositorio.save(t) ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean borrarTrabajador(String rut) {
		try {
			Trabajador aux = repositorio.findByRut(rut);
			repositorio.delete(aux);
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public List<MTrabajador> listarTrabajadores() {
		List<Trabajador> aux = repositorio.findAll();
		return convertidor.convertirListaTrabajador(aux);
	}
}
