package com.pacman.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.pacman.core.entity.Comanda;
import com.pacman.core.model.MComanda ;

@Component("convertidorcomanda")
public class ConvertidorComanda {
	public List<MComanda> convertirListaComanda(List<Comanda> c){
		List<MComanda> mcomandas = new ArrayList<MComanda>();
		for(Comanda com : c) {
			mcomandas.add(new MComanda(com)) ;
		}
		return mcomandas ;
	}
}
