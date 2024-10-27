
public class Rebajas3 { //ESTA INCOMPLETO
	/*3. Crea una clase Rebajas con un método descubrePorcentaje() que
descubra el descuento aplicado en un producto. El método recibe el
precio original del producto y el rebajado y devuelve el porcentaje.

*/ //EL EJERCICIO NO PIDE REALIZAR CONSTRUCTOR USAMOS  POR DEFECTO
	
	
	//NO NECESITTA NI GETTER NI SETTER NI ATRIBUTOS NI CONSTRUCTOR
	
	
	
	//MÉTODO POR DEFECTO
	public double descubrePorcentaje(double precioOriginal, double precioRebajado){
		return (precioOriginal - precioRebajado) / precioOriginal *100;
	}

	
	
	

	//LINEA MAIN
	public static void main(String[] args) {
		Rebajas3 tv = new Rebajas3 ();
		double precioProducto = 100.0;
		double precioRebajado = 70.0;
		
		
		// objeto.método					//precio origina y precio pagado
		System.out.println(tv.descubrePorcentaje(precioProducto, precioRebajado));
		
	}

}
