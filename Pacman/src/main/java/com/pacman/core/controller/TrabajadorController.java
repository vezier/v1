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
import com.pacman.core.entity.Trabajador;
import com.pacman.core.model.MTrabajador;
import com.pacman.core.services.TrabajadorService;

@RestController
@RequestMapping("/pacman")
public class TrabajadorController {
	@Autowired
	@Qualifier("serviciotrabajador")
	TrabajadorService servicio ;
	
	@PutMapping("/trabajador")
	public boolean ponerTrabajador(@RequestBody @Valid Trabajador t) {
		return servicio.insertarTrabajador(t);
	}
	
	@PostMapping("/trabajador")
	public boolean modificarTrabajador(@RequestBody @Valid Trabajador t) {
		return servicio.modificarTrabajador(t);
	}
	
	@DeleteMapping("/trabajador/{rut}")
	public boolean eliminarTrabajador(@PathVariable("rut") String rut) {
		return servicio.borrarTrabajador(rut);
	}
	
	@GetMapping("/trabajadores")
	public List<MTrabajador> listarTrabajadores() {
		return servicio.listarTrabajadores() ;
	}
}
