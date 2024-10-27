package delSazCotalloAlicia;

public class Test {

	public static void main(String[] args) {
		System.out.println("Bienvenido a mis mascotas");
		//creo la tienda
		Tienda tienda = new Tienda("miMascostas"); 


		//creo articulos de la tienda String nombre, int cantidad, double precio y los insertamos a la lista

		Articulo articulo1 = new Articulo("pienso", 2, 36.56);
		Articulo articulo2 = new Articulo("collares", 5, 39.56);
		Articulo articulo3 = new Articulo("correas", 2, 45.56);
		Articulo articulo4 = new Articulo("pañales", 4, 36.56);

		try {

			tienda.inserta(articulo1);
			tienda.inserta(articulo2);
			tienda.inserta(articulo3);
			tienda.inserta(articulo4);
			
			tienda.vende("yuguyfuy", 8797);
			tienda.vende("pienso", 1);
			
			

			

		}catch(NoExiste e) {
				
			System.out.println(e.mensaje());

			}
		}

	}


