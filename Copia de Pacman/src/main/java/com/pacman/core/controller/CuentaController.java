package com.pacman.core.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.model.MCuenta;
import com.pacman.core.services.CuentaService;

@RestController
@RequestMapping("/pacman")
public class CuentaController {
	@Autowired
	@Qualifier("serviciocuenta")
	CuentaService servicio ;
	
	@PutMapping("/cuenta")
	 public boolean ponerCuenta(@RequestBody @Valid Cuenta c) {
		return servicio.insertarCuenta(c);
	}
	@GetMapping("/cuentas")
	public List<MCuenta> obtenerTodos(){
		return servicio.listarCuentas();
	}
}
