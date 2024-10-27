
public class Ejercicio13_2 {
	/*13. Implementa un método que recibe un número variable de parámetros de
	entrada de tipo String e imprima el número de parámetros recibidos y a
	continuación la posición del parámetro y su valor. Ejemplo:
	Llamada al método:
	pruebaParametros('Ana', 'Juan', 'Adrián');
	Salida:
	El número de parámetros es 3
	Posición 0: Ana
	Posición 1: Juan
	Posición 2: Adrián*/
	
	//creamos variables
	private String param; 
	private static int contParam = 0;
	
	
	//constructor por defecto
	public Ejercicio13_2() {
		//asignamos parametros por defecto
		this.param = "Anonimo";
	}

	
	//constructor con parametros
	public Ejercicio13_2(String param) {
	
		this.param = param;
	}

	//ONTRUCTOR COPIA
	
	public Ejercicio13_2(Ejercicio13_2 copia ) {		
		this.param = copia.getParam();
		this.contParam = copia.getContParam();
	}





	//getter y setter
	public String getParam() {
		return param;
	}
	
	

	public void setParam(String param) {
		this.param = param;
	}

	public static int getContParam() {
		return contParam;
	}

	public static void setContParam(int contParam) {
		Ejercicio13_2.contParam = contParam;
	}

	//creamos metrodo to string
	@Override
	public String toString() {
		return "Ejercicio13_2 [param=" + this.getParam() + "]";
	}
	
	//METODO PASO PARAMETROS VARIABLES
	//NO HACE FALTA CREAR OBJETOS, ES UN METODO DE CLASE
	public static void pasoParametros (String...parametros) {
		//creamos un ciclo for que ademas de mostrarnos
		//los nombres intruduciodos nos, va  a mostrar 
		//su posición 
		for(int i = 0; i < parametros.length; i++) {
			contParam++; //contamos los parametros pasados
			//EL FALLO QUE COMETISTE FUE OLVIDARTE DEL [i] dentro
			//de los parametros
			System.out.println("Posición "+i+": "+parametros[i]);
		}
		//1 PODEMOS CONTAR PARAMETROS USANDO LENGTH, SIN NECESITADAD 
		//DE CREAR UN  METODO Y UN CONTADOR.
		//System.out.println("El numero de parametros pasados es : "+parametros.length);
		
		//2) OPCION ES UTILIZANDO UN CONTADOR PERO SIN EL METODO
		//EN UNA OPCION UTILIZAMOS EL GETTER. 
		System.out.println("el numero de parametros es "+contParam);
		System.out.println("el numero de parametros es "+getContParam());
	}
	
	/*//creamos metodo para mostrar los parametros
	 * FUNCIONA PERO VAMOS A VER OTRAS OPCIONES MAS SENCILLAS*/
	public static void contadorParametros () {
		System.out.println("Número parametros pasados "+contParam);
	}

	//Linea manin
	public static void main(String[] args) {
		
		//creamos variables para asignarar parametros
		
		
		Ejercicio13_2.pasoParametros("Juan", "Fran", "Raúl");
		//Ejercicio13_2.contadorParametros();
		
		
	}

}
