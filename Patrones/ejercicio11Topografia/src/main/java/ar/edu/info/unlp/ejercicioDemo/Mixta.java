package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> componentes;
	
	//En el constructor limito que la construccion de una topogarfia mixta sea de 4 partes total
	// ya que no se puede agregar un componente es imposible que hay más 
	public Mixta(Topografia c1,Topografia c2,Topografia c3,Topografia c4) {
		super();
		this.componentes = new ArrayList<Topografia>();
		componentes.add(c1);
		componentes.add(c2);
		componentes.add(c3);
		componentes.add(c4);
	}


	@Override
	public double getProporcionAgua() {
		return this.componentes.stream()
				.mapToDouble(c -> c.getProporcionAgua())
				.sum()/(this.componentes.size());
	}
	@Override
	public boolean isEquals(Topografia topografia) {
		return this.componentes.equals(topografia.getTopografia());
	}

}
//Usar el equals de las listas para ir comparando cada elemento e implemntar el equals entre topografias
