package com.pacman.core.controller;

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
import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MCuenta;
import com.pacman.core.services.CuentaService;
import com.pacman.core.services.MesaService;

@RestController
@RequestMapping("/pacman")
public class CuentaController {
	@Autowired
	@Qualifier("serviciocuenta")
	CuentaService servicio ;
	@Autowired
	@Qualifier("serviciomesa")
	MesaService serviciomesita ; // lo importe para buscar el objeto mesa
	
	@PutMapping("/cuenta") 
	 public boolean ponerCuenta(@RequestBody @Valid MCuenta c) {
		Mesa fufu = serviciomesita.obtenerMesita(c.getMesa()) ;
		Cuenta aux = new Cuenta(c.getId_cuenta(),c.getEstado_cuenta(),fufu);
		return servicio.insertarCuenta(aux) ;
	}
	
	@PostMapping("/cuenta")
	public boolean modificarCuenta(@RequestBody @Valid MCuenta c) {
		Mesa fufu = serviciomesita.obtenerMesita(c.getMesa());
		Cuenta aux = new Cuenta(c.getId_cuenta(),c.getEstado_cuenta(),fufu) ;
		return servicio.modificarCuenta(aux);
	}
	
	@DeleteMapping("/cuenta/{idcuenta}")
	public boolean eliminarCuenta(@PathVariable("idcuenta") String idcuenta) {
		return servicio.eliminarCuenta(idcuenta) ;
	}
	
	@GetMapping("/cuentas")
	public List<MCuenta> obtenerTodos(){
		return servicio.listarCuentas();
	}
}
