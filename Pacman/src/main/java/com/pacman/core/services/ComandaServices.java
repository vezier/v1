package com.pacman.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pacman.core.converter.ConvertidorComanda;
import com.pacman.core.entity.Comanda;
import com.pacman.core.entity.Consumible;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MComanda ;
import com.pacman.core.repository.ComandaRepositorio;
import com.pacman.core.repository.CuentaRepositorio;

import java.util.ArrayList;
import java.util.List; 

@Service("serviciocomanda")
public class ComandaServices {
	@Autowired
	@Qualifier("repositoriocomanda")
	private ComandaRepositorio repositorio ;
	@Autowired
	@Qualifier("convertidorcomanda")
	private ConvertidorComanda convertidor ;
	@Autowired
	@Qualifier("repositoriocuenta")
	private CuentaRepositorio repocuenta ;
	@Autowired
	@Qualifier("serviciocuenta")
	private CuentaService serviciocuenta ;
	@Autowired
	@Qualifier("serviciomesa")
	private MesaService serviciomesa ;
	@Autowired
	@Qualifier("servicioconsumible")
	private ConsumibleService servicioconsumible ;
	
	public boolean insertarComanda(MComanda comanda) {
		try {
			Mesa mesita = serviciomesa.obtenerMesita(comanda.getNumeromesa());
			if(mesita.getCuenta() == null) {
				Cuenta cuenta = new Cuenta();
				serviciocuenta.insertarCuenta(cuenta);
				mesita.setCuenta(cuenta);
				serviciomesa.actualizarMesa(mesita);
			}
			ArrayList<Integer> aux = comanda.getIdconsumible() ;
			for(int i = 0 ; i < aux.size(); i++) {
				Consumible cons = servicioconsumible.devolverConsumible(aux.get(i));
				Comanda comandita = new Comanda();
				comandita.setCuenta(mesita.getCuenta());
				comandita.setConsumible(cons);
				comandita.setComentario(comanda.getComentario());
				repositorio.save(comandita);
			}
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean modificarComanda(Comanda comanda) {
		try {
			repositorio.save(comanda) ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	
	public boolean borrarComanda(int idlista) {
		try {
			Comanda comanda = repositorio.findByIdlista(idlista) ;
			repositorio.delete(comanda); ;
			return true ;
		} catch (Exception e) {
			return false ;
		}
	}
	/*
	public List<MComanda> listarComanda(String idcuenta) {
		Cuenta cuenta = repocuenta.findByIdcuenta(idcuenta);
		List<Comanda> comandas = repositorio.findByCuenta(cuenta);		
		return convertidor.convertirListaComanda(comandas);
	}
	*/
}
