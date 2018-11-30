package com.pacman.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacman.core.entity.Consumible;
import com.pacman.core.services.ConsumibleService;
import java.util.List;
import com.pacman.core.model.MConsumible;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pacman")
public class ConsumibleController {
	@Autowired
	@Qualifier("servicioconsumible")
	ConsumibleService servicio ;
	
	@PutMapping("/consumible")
	 public boolean ponerConsumible(@RequestBody @Valid Consumible c) {
		return servicio.insertarConsumible(c);
	}
	
	@PostMapping("/consumible")
	public boolean modificarConsumible(@RequestBody @Valid Consumible c) {
		return servicio.actualizarConsumible(c);
	}
	
	@DeleteMapping("/consumible/{id}")
	public boolean eliminarConsumible(@PathVariable("id") String nombre) {
		return servicio.borrarConsumible(nombre) ;
	}
	
	@GetMapping("/consumibles")
	public List<MConsumible> obtenerTodos(){
		return servicio.listarConsumibles();
	}
	
	@GetMapping("/consumibles/{idconsumible}")
	public Consumible obtenerCon(@PathVariable("idconsumible") String idconsumible) {
		return servicio.devolverConsumible(idconsumible);
	}
}
