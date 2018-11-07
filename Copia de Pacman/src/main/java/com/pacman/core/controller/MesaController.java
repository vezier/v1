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
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MMesa;
import com.pacman.core.services.MesaService;

@RestController
@RequestMapping("/pacman")
public class MesaController {
	@Autowired
	@Qualifier("serviciomesa")
	MesaService servicio ;
	
	@PutMapping("/mesa")
	public boolean ponerMesa(@RequestBody @Valid Mesa m) {
		return servicio.insertarMesa(m);
	}
	
	@PostMapping("/mesa") 
	public boolean actualizarNota(@RequestBody @Valid Mesa m){
		return servicio.actualizarMesa(m);
	}
	
	@DeleteMapping("/mesa/{id}")
	public boolean borrarNota(@PathVariable("id") int id) {
		return servicio.borrarMesa(id);
	}
	
	@GetMapping("/mesas")
	public List<MMesa> obtenerTodas() {
		return servicio.obtenerMesa() ;
	}
	
}
