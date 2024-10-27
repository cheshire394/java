
public class ArraysEjemplo01 {
	
	//CREAMOS ATRIBUTOS
	private String mensaje;
	
	
	
	//CREAMOS UN CONTRUCTOR sin parametros
	public ArraysEjemplo01() {
	
	}
	//CREAMOS UN CONTRUCTOR parametrizado
	public ArraysEjemplo01(String mensaje) {
	
		this.mensaje = mensaje;
	}
	
	//getter y setter
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

	
	//creamos un objeto publico que no devuelva nada(voi) 
	//en main devuelve a traves de un array objeto
	public void mostrarInformacion() {
		System.out.println("Soy el objeto "+this.getMensaje());
	}
			
	public static void main(String[] args) {

		//creamos un array de tipo int con 3 posiciones
		int[]notas = new int [3];
		double [] temperatura = new double[5];
		String [] nombre = new String[8];
		
		//30 alumnos aprobados--> 30 trues
		boolean[] alumnosAprobados = new boolean[30];
		
		//array de objetos llamamos a la clase.
		//cuando el array lleva el nombre de la clase 
		//estas creando un array de objetos de esa clase
		ArraysEjemplo01[] arrayObjetos = new ArraysEjemplo01[3];
		
		
		
		//VAMOS A RELLENAR LOS ARRAYS
		notas[2] = 1;//El array en su posición 2 tiene un valor de 1.
		temperatura[3] = 25.00;
		nombre[0]= "marcos";
		
		//RELLENAR OBJETOS  
		//opcion1 -->creamos el objeto nombre obj 1
		ArraysEjemplo01 obj1 = new ArraysEjemplo01();
		//al array 0 le damos el valor de obj1
		arrayObjetos[0] = obj1;
		
		//creamos un objeto Anonimo dentro de un array
		arrayObjetos [1] = new ArraysEjemplo01();
		arrayObjetos [1].mostrarInformacion();
		
		//creamos un segundo array de objetos maximo 3:
		ArraysEjemplo01[]arrayObjetos2 = new ArraysEjemplo01[3];
		
		//cadena de arrays::
		arrayObjetos2[0] = new ArraysEjemplo01("obj1");
		arrayObjetos2[1] = new ArraysEjemplo01("obj2");
		arrayObjetos2[2] = new ArraysEjemplo01("obj3");
		
		//recorremos array usando for:
		for(int posicion = 0; posicion<3;posicion++) {
			arrayObjetos2[posicion].mostrarInformacion();
		}
		//podemos hacer lo mismo con lenght LO QUIERE ASI, NO DE LA 
		//OTRA FORMA.
		for(int posicion = 0; posicion< arrayObjetos2.length;posicion++) {
			arrayObjetos2[posicion].mostrarInformacion();
		}
		
		//CON FOR-EACH LE GUSTA MÁS AÚN:
		//for-ecah siempre funciona por copias, nunca con el objeto directamente.
		//solamente es válido cuando quieres recorrer el array entero
		for(ArraysEjemplo01 arrayAuxiliar : arrayObjetos2) {
		// tipo de dato(clse), arr.Auxiliar(es una copia del arrayObjetos)
			arrayAuxiliar.mostrarInformacion();//arrayObjetos[posicion].mostrarInformacion();
		}
		
		
		
		

	}

}
