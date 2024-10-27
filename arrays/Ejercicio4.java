import java.util.*;
public class Ejercicio4 {
	
	
	public static void rellenar(Scanner sc) {
		
		//Scanner terminal = new Scanner(System.in);
		
		int [] num = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero para la posicion "+ i);
			int numero = sc.nextInt();
			num[i]= numero; 
		
		}
		
		for(int i = num.length -1 ; i >= 0; i--) {
			System.out.println(num[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		/*4. Realiza un programa que lea desde teclado 10 números enteros, para
		posteriormente mostrarlos en el orden inverso al que fueron
		introducidos.
*/
		
				Scanner leer = new Scanner (System.in);
				
				rellenar(leer);
		
		int[] arrayNum = new int[10];
		
		for(int i = 0; i<arrayNum.length; i++) {
		System.out.println("Introduca 10 numeros");
		int num = leer.nextInt();
		arrayNum[i]= num;
		}
		for(int j = 9; j >=0; j--) {
			System.out.println(arrayNum[j]);
		}
	}

}


