package delSazAlicia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Almacen implements Comparable<Almacen>{


	public static HashSet<Juguetes> crearAlmacen(){

		return new HashSet<Juguetes>();

	}

	public static void aniadirJuguete(HashSet<Juguetes> estructura, Juguetes juguete) {
		estructura.add(juguete);

	}

	public static void eliminarAlmacen(HashSet<Juguetes> estructura) {

		estructura.clear();
	}


	public static HashSet<Juguetes> moverAlmacen(HashSet<Juguetes> estructura){
		//metodo que mueve el almacen pasado por parametro a  un nuevo set
		HashSet<Juguetes> nuevoAlmacen = (HashSet<Juguetes>) estructura.clone(); 
		eliminarAlmacen(estructura); //elimimanos el almacen clonado llamando al método elimina
		//mejorable con addAll.
		return nuevoAlmacen; 

	}


	public static void eliminarJuguete(HashSet<Juguetes>nuevoAlmacen, Juguetes juguete ) {
		//remove no solo funciona por posicion
		java.util.Iterator<Juguetes> it =  nuevoAlmacen.iterator();

		while(it.hasNext()) {

			it.next(); 

			if(juguete.equals(it))it.remove(); //utilizamos la posicion del objeto para eliminarlo
			//else System.out.println("El objeto "+ juguete.getCodigo_unico()+ " No existe en este Set");
		}
	}

	public static void comprobarJuguete(HashSet<Juguetes>nuevoAlmacen, Juguetes juguete ) {
		boolean existe = false; 
		java.util.Iterator<Juguetes> it =  nuevoAlmacen.iterator();

		while(it.hasNext()) {

			Juguetes jugueteActual = it.next(); 

			if(jugueteActual.getCodigo_unico() == juguete.getCodigo_unico()) {
				existe = true; 
				System.out.println("El jugue "+juguete.getCodigo_unico()+ " esta en el almacén");

			}
		}

		if(!existe) {
			System.out.println("El jugue "+juguete.getCodigo_unico()+ " NO  esta en el almacén");
		}



	}


	public static ArrayList<Juguetes> almacenEnLista(HashSet<Juguetes> nuevoAlmacen){

		ArrayList<Juguetes> lista = new ArrayList<Juguetes>();
		java.util.Iterator<Juguetes> it =  nuevoAlmacen.iterator();

		while(it.hasNext()) {

			Juguetes elementoActual = it.next(); 

			lista.add(elementoActual);

		}
		
		return  lista;

	}

	public static Juguetes[] almacenEnArray(HashSet<Juguetes> nuevoAlmacen){

		Juguetes [] array = new Juguetes[nuevoAlmacen.size()]; //arrays no es -1 ya que empieza en 0
		int posicion = 0;
		java.util.Iterator<Juguetes> it =  nuevoAlmacen.iterator();

		while(it.hasNext()) {

			Juguetes elementoActual = it.next(); 
			
			array[posicion] = elementoActual;
			posicion++; //el contador tiene que ir despues de dar el valor
		}
		posicion = 0;  //sobra 


		return  array;

	}


	public static void mostrarAlmacen(HashSet<Juguetes> nuevoAlmacen) {

		
		for( Juguetes cp : nuevoAlmacen) {

			System.out.println(cp.toString());
		}


	}


	public static void ordenarAlmacen(HashSet<Juguetes> nuevoAlmacen) {

		TreeSet<Juguetes> tree = new TreeSet<>(nuevoAlmacen);
		for( Juguetes cp : tree) {

			System.out.println(cp.toString());
		}


	}






}
