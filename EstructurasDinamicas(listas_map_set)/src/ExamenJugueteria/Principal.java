package delSazAlicia;

import java.util.HashSet;

public class Principal {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<Juguetes> miJugueteria = Almacen.crearAlmacen();
		
		//int codigo_unico, String marca, int edad_recomendada, int[] dimensiones, String descripcion,
		//int unidades
		
		Juguetes juguete1 = new Juguetes (1,"toy",5,new int[] {22,11,3}, "no toxico", 3);
		Juguetes juguete2 = new Juguetes (2,"toy",6,new int[] {22,11,3}, "no toxico", 3);
		Juguetes juguete3 = new Juguetes (3,"toy",7,new int[] {22,11,3}, "no toxico", 3);
		Juguetes juguete4 = new Juguetes (4,"toy",2,new int[] {22,11,3}, "no toxico", 3);
		
		Almacen.crearAlmacen();
		Almacen.aniadirJuguete(miJugueteria,juguete1);
		Almacen.aniadirJuguete(miJugueteria,juguete2);
		Almacen.aniadirJuguete(miJugueteria,juguete3);
		Almacen.aniadirJuguete(miJugueteria,juguete4);
		
		
		System.out.println("ALMACEN CREADO ");
		System.out.println(miJugueteria);
		
		
		
		System.out.println("El nuevo almacen ha sido movido");
		HashSet<Juguetes> nuevoAlmacen = Almacen.moverAlmacen(miJugueteria);
		System.out.println(nuevoAlmacen);
		
		
		System.out.println("Vamos a añidir dos juguetes más");
		Juguetes juguete5 = new Juguetes (5,"toy",5,new int[] {22,9,3}, "no toxico", 9);
		Juguetes juguete6 = new Juguetes (6,"toy",6,new int[] {12,11,3}, "no toxico", 6);
		Almacen.aniadirJuguete(nuevoAlmacen,juguete5);
		//Almacen.aniadirJuguete(nuevoAlmacen,juguete6); no añado para comprobar si existe en el almacen
		System.out.println(nuevoAlmacen.toString());
		
		System.out.println("¿El juguete existe en la lista?");
		Almacen.comprobarJuguete(nuevoAlmacen,juguete6); // no existe
		Almacen.comprobarJuguete(nuevoAlmacen,juguete1); // si existe
		
		//REVISAR
		System.out.println(" Eliminar un jugete que existe: ");
		Almacen.eliminarJuguete(nuevoAlmacen, juguete6);
		System.out.println(nuevoAlmacen);
		
		
		//ELiminar almacen
		//System.out.println("Eliminamos el amacen original, aunque ya deberia estar eliminado al mover el almacen");
		Almacen.eliminarAlmacen(miJugueteria);
		
		System.out.println("Almace lo hemos convertido a tipo LIST con iterator");
		System.out.println(Almacen.almacenEnLista(nuevoAlmacen));
		System.out.println(Almacen.almacenEnLista(nuevoAlmacen).getClass()); // no dice el tipo que es.
		
		System.out.println("Almace lo hemos convertido a tipo ARRAY con iterator");
		//System.out.println(Almacen.almacenEnArray(nuevoAlmacen));
		//System.out.println(Almacen.almacenEnArray(nuevoAlmacen).getClass()); // no dice el tipo que es.
		
		//Almacen.ordenarAlmacen(nuevoAlmacen);


	}

}
