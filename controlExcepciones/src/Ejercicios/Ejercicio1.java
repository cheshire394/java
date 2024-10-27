package Ejercicios;

public class Ejercicio1 {
	
	
	 public static int[] crearArray(){
	        // Crear un arreglo de enteros con el tamaño especificado
	        int[] array = new int[5];
	        // Llenar el arreglo con valores predeterminados o con lógica personalizada
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int)(Math.random()*(9 -1)+1);
	        }
	        
	        //provocar el metodo para que de error en una posicion que no existe
	      array[6]= 10; 
	        return array; // Devolver el arreglo creado
	    }
	 
	public static void main(String[] args) {
		/*Escrib código para generar excepción ArrayIndexOutOfBoundsException.*/
		
	
		
		
		
		try {
			crearArray();
			
		}catch(ArrayIndexOutOfBoundsException exc) {

			System.out.println(exc.getMessage() + " El array tiene una longitud menor");
		}

		
		
	

	}

}

