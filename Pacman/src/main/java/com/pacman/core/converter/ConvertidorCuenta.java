package com.pacman.core.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.model.MCuenta;

@Component("convertidorcuenta")
public class ConvertidorCuenta {
	public List<MCuenta> convertirListaCuenta(List<Cuenta> cuenta){
		List<MCuenta> mcuenta = new ArrayList<MCuenta>();
		for(Cuenta c : cuenta) {
			mcuenta.add(new MCuenta(c));
		}
		return mcuenta ;
	}
	
	public MCuenta convertirCuenta(Cuenta cuenta) {
		return new MCuenta(cuenta) ;
	}
}
