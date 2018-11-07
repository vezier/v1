package com.pacman.core.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.pacman.core.entity.Mesa;
import com.pacman.core.model.MMesa;

@Component("convertidormesa")
public class ConvertidorMesa {
	public List<MMesa> convertirListaMesa(List<Mesa> mesas) {
		List<MMesa> mmesas = new ArrayList<MMesa>();
		for(Mesa m : mesas) {
			mmesas.add(new MMesa(m));
		}
		return mmesas ;
	}
}
