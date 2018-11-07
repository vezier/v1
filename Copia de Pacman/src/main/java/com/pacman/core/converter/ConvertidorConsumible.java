package com.pacman.core.converter;

import org.springframework.stereotype.Component;
import com.pacman.core.entity.Consumible;
import com.pacman.core.model.MConsumible;

import java.util.ArrayList;
import java.util.List; 

@Component("convertidorconsumible")
public class ConvertidorConsumible {
	public List<MConsumible> convertirListaConsumible(List<Consumible> consumibles){
		List<MConsumible> mconsumible = new ArrayList<MConsumible>();
		for(Consumible c : consumibles) {
			mconsumible.add(new MConsumible(c));
		}
		return mconsumible ;
	}
}
