package com.pacman.core.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacman.core.entity.Comanda;
import com.pacman.core.entity.Consumible;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.model.MComanda;
import com.pacman.core.services.ComandaServices;
import com.pacman.core.services.ConsumibleService;
import com.pacman.core.services.CuentaService;

@RestController
@RequestMapping("/pacman")
public class ComandaController {
	@Autowired
	@Qualifier("serviciocomanda")
	ComandaServices servicioComanda ;
	
	@Autowired
	@Qualifier("serviciocuenta")
	CuentaService serviciocuenta ;
	
	@Autowired
	@Qualifier("servicioconsumible")
	ConsumibleService servicioconsumible ;
	
	@PutMapping("/comanda")
	public boolean insertarComanda(@RequestBody @Valid MComanda mcomanda) {
		Cuenta cuenta = serviciocuenta.devolverCuenta(mcomanda.getIdcuenta());
		Consumible consumible = servicioconsumible.devolverConsumible(mcomanda.getIdconsumible());
		Comanda comanda = new Comanda();
		comanda.setIdlista(mcomanda.getIdlista());
		comanda.setCuenta(cuenta);
		comanda.setConsumible(consumible);
		return servicioComanda.insertarComanda(comanda);
	}
	
	@GetMapping("/comandas/{idcuenta}")
	public List<MComanda> listarComandasDeCuenta(@PathVariable("idcuenta") String idcuenta) {
		return servicioComanda.listarComanda(idcuenta);
	}
}
