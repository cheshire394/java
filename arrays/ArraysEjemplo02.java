import java.util.Arrays;

public class ArraysEjemplo02 {

	public static void main(String[] args) {
		
		// Declaracion e inicialización de arrays
		
		//opción 1 vector
		
		int [] arrayEntero1 = new int [5];
		
		//recorremos array
		for(int i = 0; i <= arrayEntero1.length; i++) {
			//imprime el indice y el valor de la celda
			System.out.println(i + ">"+ arrayEntero1[i]);
		}
		
		
		
		//CREAMOS ARRAYS Y ASIGNAMOS VALORES EN LA CREACION
		int [] arrayEntero2 = {1,2,3,4,5};
		
		//ejercicio --> genera una media de los numeros que forman parte de este array
			//creamos un sumador de notas
			int suma =0;
			//si pones menor = hay que poner -1
			for (int i = 0; i < arrayEntero2.length; i++ ) {
				suma = suma + arrayEntero2[i];
				System.out.println("el resultado de la "+suma);
			} 
			//creamos la media
			System.out.println("la media del array es="+ suma / arrayEntero2.length );
		
			//HACEMOS EL MISMO EJERCICIO CON  FOR EACH
			int suma2 = 0;
			for(int  n: arrayEntero2) {
				suma2 = suma2 + n; //suma2 += n;
				System.out.println("la media del for each"+ suma2); 
			}
		//recorremos el array2
		for(int x:arrayEntero2) 
			System.out.println(x);
		}
		
		
		
		
		
		//opcion2 de objetos
	
		ArraysEjemplo02 [] arrayEnteroObj = new ArraysEjemplo02[5];
	
	}


