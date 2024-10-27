package delSazCotalloAlicia;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private String nombre;
	private ArrayList<Articulo> tienda = new ArrayList<Articulo>();

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	} 

	public Articulo busca(String nombre)throws NoExiste {

		Articulo articulo = null; 

		for(Articulo a : tienda) {
			if(a.getNombre().equalsIgnoreCase(nombre));
			articulo = a;
		}
		if(articulo == null) throw new NoExiste("El articulo buscado no existe en la tienda");
		return articulo; 
	}


	//String nombre, int cantidad, double precio
	public void inserta(Articulo a) {

		tienda.add(a);



	}

	public double vende(String nombre, int num) throws NoExiste {

		double unidades = 0.0; 

		//lanza la excepcion en buscar si no existe
		Articulo existeArticulo = busca(nombre);

		try {
			//si existe entonces comprueba unidades y si no salta ninguna excepcion entonces vendemos
			existeArticulo.vende(num);
		}catch(NoDisponible e) {
			System.out.println(e.mensaje());
		}
		unidades = existeArticulo.getCantidad()-num; 

		return unidades; 
	}

}
