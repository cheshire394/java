import java.util.*;
public class Ejercicio29 {
	
	/*creamos la matriz con numeros aleatorios, (las dimesiones las da 
	 * el usuario*/
	public static void crearMatriz (int [][] p_matriz) {
		for(int i = 0; i< p_matriz.length; i++) {
			for(int j = 0; j < p_matriz[0].length; j++) {
				p_matriz [i][j] = (int)(Math.random()*(10-1+1)+1);
				//imprimimos los resultado (quitar ln)
				System.out.print(p_matriz[i][j]+ "\t");
			}
			System.out.println();//formato cuadrado a la impresion
		}
	}
	
	/*buscar elemento, en matriz secuencial, es decir recorriendo
	 * cada caracter de la matriz, EN PRIMER LUGAR TENER EN CUENTA
	 * QUE ESTAMOS TRABAJANDO CON UNA MATRIZ BIDIMENSIONAL, POR LO 
	 * HAY QUE EJECUTAR DOS CICLOS FOR PARA RECORRERLA: 
	 * La busqueda secuencial NO requiere una ordenacion previa*/
	
	public static int busquedaSecuencia (int [][]matriz) {
		//creamos un numero aleatorio a buscar
		int num = (int)(Math.random()*(10-1+1)+1);
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				/*con estos dos ciclos recorremos toda la matriz*/
				if(matriz[i][j]== num) {
					System.out.println("EL numero "+num+" se ubica en "
							+ "la fila "+i+" columna: "+j+" del array" );
					return matriz[i][j];
				}
			}
			
		}
		System.out.println("el numero "+num+" no se encuentra en el array");
		return -1; 
	}


	//este metrodo no es váludo porque al ordenar la matriz previamente
	//ya cambia la posición original
    public static int binarySearch(int[][] matriz) {
        int num = (int) (Math.random() * (10 - 1 + 1) + 1);

        for (int i = 0; i < matriz.length; i++) {
            // Ordenar cada fila de la matriz
            Arrays.sort(matriz[i]);

            int izq = 0;
            int der = matriz[i].length - 1;
            int centro = (izq + der) / 2;

            while (izq <= der && matriz[i][centro] != num) {
                if (num < matriz[i][centro]) {
                    der = centro - 1;
                } else {
                    izq = centro + 1;
                }
                centro = (izq + der) / 2; //CENTRO DE ACTUALIZA EN CADA CICLO, PARA SAR EL RESULTADO EN EL IF
            }

            if (izq <= der) {
                // El número se encontró en la fila i
                System.out.println("Número " + num + " encontrado en la fila " + i + ", columna " + centro);
                return centro;
            }
        }

        System.out.println("Número " + num + " no encontrado en la matriz.");
        return -1;
    }

	
	
	
	

	public static void main(String[] args) {
		/*29.Realiza un programa que cargue desde teclado una tabla bidimensional
		de 2x3 de números enteros. Posteriormente el programa pedirá un
		número a buscar, y en caso de encontrarlo indicará el número de fila y
		columna donde se ha encontrado por primera vez.
 		el programa ofrezca al
		usuario la opción de seguir buscando más números: “¿Desea seguir
		buscando?(s/n)”.*/
				
		//creamos variables 
		int fila, colum;
		String aux ; //para buscar más numeros si el usuario quiere
		Scanner terminal = new Scanner (System.in);
		
		System.out.println("Introduce un numero de filas para la matriz: ");
		fila = terminal.nextInt();
		System.out.println("introduce un numero de columnas para la matriz: ");
		colum = terminal.nextInt();
		
		int [][] matriz = new int[fila][colum];
		//crea e imprime el array matriz
		Ejercicio29.crearMatriz(matriz);
		
		//busqueda de un numero en la matriz creada con dos metodos 
		//diferentes, una busqueda es binaria y la otra secuencial.
		Ejercicio29.busquedaSecuencia(matriz);
		Ejercicio29.binarySearch(matriz);
		
		//ejercicio 30
		/*DA FALLO, DA IGUAL DONDE COLOQUE LA LIMPIEZA DEL TECLADO
		 * PREGUNTAR DONDE ESTA EL ERROR.*/
		while (true) {
		    System.out.println("Desea buscar más números: ");
		    aux = terminal.nextLine().toLowerCase();  // Lee la respuesta del usuario y convierte a minúsculas
		    terminal.nextLine();
		    
		    if (aux.equals("si")) {
		        Ejercicio29.busquedaSecuencia(matriz);
		        Ejercicio29.binarySearch(matriz);
		    } else {
		        break;
		    }
		}
		
		System.out.println("FIN DEL PROGRAMA");
		terminal.close();
	}

}
