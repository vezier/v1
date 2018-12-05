package com.pacman.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pacman.core.converter.ConvertidorCuenta;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MCuenta;
import com.pacman.core.repository.CuentaRepositorio;

@Service("serviciocuenta")
public class CuentaService {
	@Autowired
	@Qualifier("repositoriocuenta")
	private CuentaRepositorio repositorioc ;
	@Autowired
	@Qualifier("convertidorcuenta")
	private ConvertidorCuenta convertidor ;
	@Autowired
	@Qualifier("serviciomesa")
	private MesaService serviciomesita ;
	
	public boolean insertarCuenta(Cuenta cuenta) {
		try {
			repositorioc.save(cuenta);
			return true ;
		} catch(Exception e) {
			return false ;
		}
		
	}
	
	public boolean modificarCuenta(Cuenta cuenta) {
		try {
			repositorioc.save(cuenta) ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean eliminarCuenta(int id) {
		try {
			Cuenta aux = repositorioc.findByIdcuenta(id) ;
			repositorioc.delete(aux);
			return true ;
		} catch (Exception e) {
			return false ;
		}
		
	}
	
	public List<MCuenta> listarCuentas(){ //metodo obtiene todos 
		List<Cuenta> aux = repositorioc.findAll() ;
		return convertidor.convertirListaCuenta(aux);
	}
	
	public Cuenta devolverCuenta(int idcuenta) {
		return repositorioc.findByIdcuenta(idcuenta);
	}
}
