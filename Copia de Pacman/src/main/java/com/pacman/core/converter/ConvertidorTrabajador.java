package com.pacman.core.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.pacman.core.entity.Trabajador;
import com.pacman.core.model.MTrabajador;


@Component("convertidortrabajador")
public class ConvertidorTrabajador {
	public List<MTrabajador> convertirListaTrabajador(List<Trabajador> trab) {
		List<MTrabajador> mtrabajador = new ArrayList<MTrabajador>();
		for(Trabajador t : trab) {
			mtrabajador.add(new MTrabajador(t)) ;
		}
		return mtrabajador ;
	}
}
