import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		//importamos la biblioteca java:
		Scanner terminal = new Scanner (System.in);
		
		//Le pedimos al usuario que ingre los kw/h consumidos y definimos la variable como Double:
		System.out.println("Introduce los kw consumidos actualmente: ");
		Double kwactual = terminal.nextDouble();
		
		System.out.println("Introduce los kw consumidos en la última lectura: ");
		double kwultima = terminal.nextDouble();
		//sumamos el total de las variables.
		double kw = kwultima + kwactual;
		
		//cerramos terminal
		terminal.close();
		
		/*14. Con objeto de fomentar el ahorro energético, el recibo de la
electricidad se elabora de forma que el precio de cada Kw/h consumido
es más caro cuanto más se consume:
2€ de gastos fijos
0,50€/Kwh para los primeros 100 Kwh
0,70€/Khw para los siguientes 150 Kwh
1€/Kwh para el resto */
		
		//	Lo importante para resolver este ejercicio bien es tener en cuenta la restas de los porcentajes:
		if (kw <= 100) {
			//La primera operación es sencilla, ya que no hay que restar nada:
			double total = (kw * 0.50) + 2.0;
			System.out.println("El precio a pagar es de : "+ total);
		}
		/*sin embargo si el cliente supera los 100 kw, los precios varian en función de la cantidad, por ello en 
		KW70 hemos restado 100 kw a la cuantia que inserte el cliente, para calcular el precio solo a partir de 
		los 101 kw y después en la linea de CÓDIGO TOTAL, hemos multiplicado esos 100 kw por 0.50 que es su precio
		y se los hemos sumado a la variable kw70 */
			else if (kw >101 && kw <= 250) {
				double kw70 = (kw - 100) *  0.70 + 2;
				double total = kw70 + (100 * 0.50) ;
			System.out.println("El precio a pagar es de de : "+total);
			}
		/*finalmente, si las anteriores lineras no se ejecutan es porque los kw consumidos superan los 150, 
		 simplemente los 100 primeros los * por 0.50; los 50 siguientes * 0.70cent y al kw que te inserta el 
		usuario le restamos 150kw de más, para multiplicar * 1 euros solo los que sobrepasen los 150.*/
			else { 
				double total = (100 * 0.50) + (50 * 0.70) + (kw - 150 * 1.00)  +  2;	
			System.out.println("El precio a pagar es de : "+total);
			
		}
		
		
	}

}
