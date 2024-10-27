

public class Rebajas {

	/**
	   3. 	Crea una clase Rebajas con un método descubrePorcentaje() que 
			descubra el descuento aplicado en un producto. El método recibe el 
			precio original del producto y el rebajado y devuelve el porcentaje.

	 **/

	//Sin atributos
	//Sin constructores
	//Sin getters y setters
	//Sin toString
	
	float descubrePorcentaje(float preciooriginal, float preciorebajado) {
		
		//Cálculo porcentaje:[(Precio Original - Precio Rebajado) / Precio Original] x 100
		
		//Creo la variable porcentaje, le digo que es igual a un int (para que me redondee el porcentaje)
		// Y por último hago el cálculo para conseguir el porcentaje
		int porcentaje = (int) (((preciooriginal-preciorebajado)/preciooriginal)*100);
		
		//Cada vez que se ejecute el método ya imprima el resultado
		System.out.println("El porcentaje de descuento fue: " + porcentaje + "%");
		
		//El método necesita un return
		return porcentaje;

	}
	//Método main
	public static void main(String[] args) {

//Creo el objeto sin darle un valor
		Rebajas zapas = new Rebajas();

		//Lamo al método, primero nombrando el objeto, luego el método y entre parentesis el precio original y luego el rebajado.
		zapas.descubrePorcentaje(45,35);

		//No hay System.out.println(); por que ya lo metí en el método, sino estuviese en el método:
		//System.out.println(zapas.descubrePorcentaje(45,35));

	}

}