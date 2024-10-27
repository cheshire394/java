import java.util.*;
public class Ejercicio2 {

	
	public static void rellenarVector(Scanner sc) {
		
		Scanner terminal = new Scanner(System.in);
		
		int [] vector = new int [10];
		
		
		
		for(int i = 0; i < vector.length; i++) {
		System.out.println("Introduce un numero para la posicion "+i);
		vector[i] = terminal.nextInt();
		
		}
		
		for(int i = 0; i < vector.length; i++) {
			
			if(vector[i] %2 == 0) {
				System.out.print(" "+vector[i]+ " ");
			}
			
		}
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		/*2.Realiza un programa que lea desde teclado 10 números y posteriormente
		muestre solamente los que sean pares.
		*/
	
	
		Scanner terminal = new Scanner (System.in);
		

			
		rellenarVector(terminal);
	
		terminal.close();
	
}
}
