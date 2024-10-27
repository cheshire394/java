
public class Ejercicio15_2 {


	private static int sumaParam = 0;
	private int num;
	
	
	//contructor por defecto
	

	public Ejercicio15_2() {
		
	}



	//constructor con parametros LOS ATRIBUTS STATIC NO DEBEN DE INSCRIBIRSE EN LOS CONSTRUCTORES
	public Ejercicio15_2(int num) {

		this.num = num;
		
	}

	//constructor copia LOS ATRIBUTS STATIC NO DEBEN DE INSCRIBIRSE EN LOS CONSTRUCTORES
	public Ejercicio15_2(Ejercicio15_2 copia) {

		this.num = copia.getNum();
		
	}

	




	//getter y setter
	public static int getSumaParam() {
		return sumaParam;
	}



	public static void setSumaParam(int sumaParam) {
		Ejercicio15_2.sumaParam = sumaParam;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	//to string
	@Override
	public String toString() {
		return "Ejercicio15_2 [num=" + num + "]";
	}
	
	//EQUALS
	
	
	//METODOS QUE OPERAN
	public static void pasoParam (int...p_numeros) {
		for(int copiaNumeros : p_numeros) {
			
			//RECUERDA QUE CUANDO OPERAMOS CON EACH, TRABJAMOS CON SU COPIA
			sumaParam += copiaNumeros;
			System.out.println("Número introducido: "+ copiaNumeros);
		
		}//cierre each
		//contador de numeros introducidos, sin crear contador.
		System.out.println("TOTAL DE NUMEROS: "+p_numeros.length);
		//imprimimos resultado de la suma
		System.out.println("La SUMA TOTAL ES: "+ getSumaParam());
	}
	
	/* 
	 * 15. Sobrecarga el método anterior de tal manera que reciba de forma fija 2
	números reales pudiendo venir a continuación más números enteros
	como parámetros o no. El método devolverá la suma de todos los
	parámetros que se le pasen en la llamada.*/
	
	/*DEBEMOS CONOCER QUE LA SOBRECARGA REQUIERE LA CREACION DE 
	 * OBJETOS (SON METODOS DE INSTACIA, NO DE CLASE, NUNCA SON STATIC)*/
	
	public void sobreCarga (double num1, double num2, int...numVariables) {
		System.out.println("el numero double primero: "+num1);
		System.out.println("el numero double dos: "+num2);
		for(int copiaNumVariables : numVariables) {
			//RECUERDA QUE CUANDO OPERAMOS CON EACH, TRABJAMOS CON SU COPIA
			System.out.println("Número introducido: "+ copiaNumVariables);
		
		}//cierre each
	
	}


	public static void main(String[] args) {
		/*
		 * 14. Implementa un método que sume todos los parámetros (números
		enteros) que le lleguen (no se conoce de antemano el número de
		parámetros)
		 * 
		 * 
		 * 15. Sobrecarga el método anterior de tal manera que reciba de forma fija 2
		números reales pudiendo venir a continuación más números enteros
		como parámetros o no. El método devolverá la suma de todos los
		parámetros que se le pasen en la llamada.*/
		
		Ejercicio15_2 objSobreCarga = new Ejercicio15_2();
		
		//ejercicio 14
		Ejercicio15_2.pasoParam(1, 2, 3, 4, 5);
		
		
		System.out.println("EJEMPLO SOBRECARGA(EJERCICIO 15)");
		//ejercicio 15 
		//los dos primeros parametros son fijos, el resto son variables
		objSobreCarga.sobreCarga(5.1,5.2,6,7,8,9);
		

	}

}
