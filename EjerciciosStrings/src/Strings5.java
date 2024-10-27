
public class Strings5 {

		public static void main(String[] args) {
		
			
			//DECLARAMOS LAS VARIABLES:
			int contador_vocales = 0,contador_consonantes = 0;
			
			//declaramos como variable porque luego hay que modificar espacios y comas:
			String frase = "Java, Java, Java, java";
			
			
			//OJITO CON PONER  EN EL (HASTA DONDE UN =  EN EL LENGTH) QUE NO TE COMPILA...
			for (int i = 0; i < frase.length(); i++) {
				//REMPLAZAMOS ESPACIOS Y COMAS POR NOTHING... ACUERDATE DE MODIFICAR EL VALOR DE LA VARIABLE FRASE=.....
				//SINO REMPLACE NO FUNCIONA...TE COMPILA PERO COMO SI NO LO HUBIERAS HECHO.
				frase = frase.replaceAll(" ", "");
				frase = frase.replaceAll(",","");
				
				//AQUI TE VOLVISTE LOCA PROBANDO CONTAINS Y EQUALS (NO ADMITEN (I))
				if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') { 
				contador_vocales++;
				
			}else {
				contador_consonantes++;
				}
			}
				
			//IMPRIMIMOS RESULTADOS:
			System.out.println("La cantidad de vocales es de: "+contador_vocales);
			System.out.println("La cantidad de consonantes es de: "+contador_consonantes);

		}
	}