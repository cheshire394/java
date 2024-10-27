package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Productos {

	/*Un supermercado nos pide que hagamos una pequeña aplicación que
almacene los productos pasados por el escáner.

La aplicación debe almacenar Productos (clase),
 cada producto al crearse
contiene un nombre, cantidad y un precio. 


Calcular el precio total de una lista (ArrayList) de entre 1 y 8 productos (se pide por consola introducir
productos hasta que se introduzca ”FIN”). 


Mostrar un ticket con todo lo vendido y el precio final como se hacen en los supermercados. 
Más o menos con este formato, lo importante son los datos, no el estilo:*/


	//creamos atributos

	private String nombre;
	private int cantidad; 
	private double precio; 




	//CONSTRUCTORES

	// Constructor para Inventario
	public Productos(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	// Constructor para la cesta
	public Productos(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;

	}





	public Productos() {

	}


	public void comprobarInventario(ArrayList<Productos> inventario, ArrayList<Productos> cesta) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("¿Quieres comprar productos? (si/no): ");
		String respuesta = terminal.nextLine(); 

		if(respuesta.equalsIgnoreCase("si")) {
			while(true) {
				System.out.println("Introduce el nombre del producto ('FIN' para terminar): ");
				String nombre = terminal.nextLine(); 

				//SI EL USUARIO QUIERE SALIR.
				if(nombre.equalsIgnoreCase("FIN")) {
					break;
				}

				System.out.println("Introduce la cantidad: ");
				int cantidad = terminal.nextInt(); 
				terminal.nextLine(); // Consumir la nueva línea

				boolean productoEncontrado = false;

				for(Productos producto : inventario) {
					System.out.println("entro en for");
					if (producto.getNombre().equalsIgnoreCase(nombre) && producto.getCantidad() >= cantidad){
						System.out.println("entro en if");
						productoEncontrado = true;


						//Asignamos el precio según la cantidad comprada
						double precioProducto = producto.getPrecio() * cantidad;

						//actualizamos la cantidad en el inventario
						producto.setCantidad(producto.getCantidad() - cantidad);

						//añadimos a la cesta, el producto seleccionado
						cesta.add(new Productos(nombre, cantidad, precioProducto));
						System.out.println("Producto añadido a la cesta.");
						break;//salimos 
					}
				}

				if(!productoEncontrado) {
					System.out.println("El producto no está disponible en el inventario o no hay suficiente cantidad.");
				}
			}
		}

		else System.out.println("FIN");

		terminal.close(); 
	}
	
	
	
	//mostrar ticket 
	public void mostrarTicket(ArrayList<Productos> cesta) {
	    double total = 0;

	    // Imprimir encabezado del ticket
	    System.out.println("Producto   Cantidad   Precio/Unitario   Total");

	    for (Productos cp : cesta) {
	   

	        // Incrementar el total de la compra
	        total += cp.getPrecio();

	        // Imprimir detalles del producto en el ticket
	        System.out.printf("%-10s %-10d %-17.2f %-10.2f\n", cp.getNombre(), cp.getCantidad(), cp.getPrecio()/cp.getCantidad(), cp.getPrecio());
	    }

	    // Imprimir total a pagar
	    System.out.println("Total a pagar: " + total); //fuera del for
	}



	//creamos getter y setter


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public static void main(String[] args) {

		ArrayList<Productos> inventario = new ArrayList<Productos>(); 

		// Creación de los 8 productos
		Productos productos1 = new Productos("leche", 10, 10);
		Productos productos2 = new Productos("azucar", 5, 24.99);
		Productos productos3 = new Productos("miel", 20, 9.99);
		Productos productos4 = new Productos("Productos 4", 8, 18.50);
		Productos productos5 = new Productos("Productos 5", 15, 12.75);
		Productos productos6 = new Productos("Productos 6", 3, 35.00);
		Productos productos7 = new Productos("Productos 7", 12, 7.49);
		Productos productos8 = new Productos("Productos 8", 6, 28.99);

		// Agregar los productos a la lista
		inventario.add(productos1);
		inventario.add(productos2);
		inventario.add(productos3);
		inventario.add(productos4);
		inventario.add(productos5);
		inventario.add(productos6);
		inventario.add(productos7);
		inventario.add(productos8);



		//creamos una cesta de la compra

		ArrayList<Productos> cesta = new ArrayList<Productos>(); 



		// Creación de una instancia de Productos
		Productos productos = new Productos();


		//coompramos la cantidad de leche  en el inventario
		System.out.println(productos1.getCantidad());

		// Llamada al método para comprar productos
		productos.comprobarInventario(inventario, cesta);

		productos.mostrarTicket(cesta);

		//coompramos la cantidad de leche después de comprar en el inventario
		//	System.out.println(productos1.getCantidad()); //funciona correctamente.





	}

}
