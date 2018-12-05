package com.pacman.core.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MComanda;
import com.pacman.core.services.ComandaServices;
import com.pacman.core.services.ConsumibleService;
import com.pacman.core.services.CuentaService;
import com.pacman.core.services.MesaService;

@RestController
@RequestMapping("/pacman")
public class ComandaController {
	@Autowired
	@Qualifier("serviciocomanda")
	ComandaServices serviciocomanda ;
	
	@Autowired
	@Qualifier("serviciocuenta")
	CuentaService serviciocuenta ;
	
	@Autowired
	@Qualifier("servicioconsumible")
	ConsumibleService servicioconsumible ;
	
	@Autowired
	@Qualifier("serviciomesa")
	MesaService serviciomesita ;
	
	@PutMapping("/comanda")
	public boolean insertarComanda(@RequestBody @Valid MComanda mcomanda) {
		return serviciocomanda.insertarComanda(mcomanda);
	}
	/*
	
	@DeleteMapping("/comanda/{idlista}")
	public boolean eliminarComanda(@PathVariable("idlista") int idlista) {
		return servicioComanda.borrarComanda(idlista);
	}
	
	@GetMapping("/comandas/{idcuenta}")
	public List<MComanda> listarComandasDeCuenta(@PathVariable("idcuenta") String idcuenta) {
		return servicioComanda.listarComanda(idcuenta);
	}
	
		return true ;
}
*/
}
