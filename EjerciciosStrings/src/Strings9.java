
public class Strings9 {
	
		public static void main(String[] args) {
			
			//Transforma los caracteres del String: “ABCD” a ASCII.
			
			
			String txt = "ABCD abcd";
			
			// With for traditional
			
			//ACUERDATE QUE SIEMPRE QUE UTILICES LENGTH NO PUEDES METER UN = EN EL HASTA.
			for (int i = 0; i < txt.length(); i++) {
				
				//COLOCANDO EL (INT) CAMBIA EL VALOR DE LA VARIABLE A SU NÚMERO ASCII 
				//RESUMIENDO PRIMERO FOR PARA ITERAR CADA UNO DE LOS VALORES
				//DESPUÉS IMPRIMISMO CON VARIABLE.charAt(i) Y PARA ASCII PONERMOS INT DELANTE PARA PASAR A NÚMERO EL VALOR DE LA VARIABLE.
				System.out.println("ASCII: " + (int) txt.charAt(i) + " es equivalente a: " + txt.charAt(i));
				
			}
			
				String ascii = "Hola mundo";
				
				for (int i = 0; i < ascii.length(); i++) {
					System.out.println("El caracter ascii: "+ (int)ascii.charAt(i) +" es equivalente a "+ ascii.charAt(i));
					
				}
			}
			
		}
	
		
		
		
				

