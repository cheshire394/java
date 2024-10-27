import java.util.*;
public class Ejercicio2 {
	
	//convierte el siguente numero en hexadecimal 
	


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número decimal: ");
	        int decimalNumber = scanner.nextInt();
	        scanner.close();
	        
	        //imprime la variable
	        String hexadecimal = convertToHexadecimal(decimalNumber);
	        System.out.println("El número en hexadecimal es: 0x" + hexadecimal);
	    }

	    public static String convertToHexadecimal(int decimalNumber) {
	        if (decimalNumber < 16) {
	            return Integer.toHexString(decimalNumber).toUpperCase();
	        } else {
	            int remainder = decimalNumber % 16;
	            char hexDigit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + (remainder - 10));
	            return convertToHexadecimal(decimalNumber / 16) + hexDigit;
	        }
	    }
	}

	