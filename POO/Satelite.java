import java.util.Objects;

public class Satelite {

	private int altura;
	private double longitud, latitud;

	//atributo contador de satélites:
	private static int numSatelites= 0;

	//utlizamos el constructor por defecto para asignar parametros a Satelite2(sin parametros):
	public Satelite() {
		this.setAltura(67000);
		this.setLatitud(49780);
		this.setLongitud(47000);
		numSatelites++;

	}
		//constructo parametrizado
	public Satelite(int altura, double longitud, double latitud) {
		this.altura = altura;
		this.longitud = longitud;
		this.latitud = latitud;
		numSatelites++;

	}


	/*contructor copia  del obj satelite0bj
	 *
	 *un satélite puede registrarse como parte de una formación o constelación de satélites
	 *recogerá las coord del satelite en base a los datos del satelite de referencia y registrar
	 *lo en la lanzadera espacia */


	public Satelite (Satelite sateliteObj) {
		this.altura = sateliteObj.getAltura();
		this.latitud = sateliteObj.getLatitud();
		this.longitud = sateliteObj.getLongitud();
		numSatelites++;

	}

	//getter y setter

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}


	public static int getNumSatelites() {
		return numSatelites;
	}

	public static void setNumSatelites(int numSatelites) {
		Satelite.numSatelites = numSatelites;
	}

	//CREAMOS EL MÉTODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // los dos obj son el mismo objeto (obj copia con misma memoria)
			return true;
		if (obj == null) // el objeto alias esta vacio
			return false;
		if (this.getClass() != obj.getClass())  //(RECUERDA AÑADIR THIS) los objetos son de distinta clase
			return false;
		Satelite other = (Satelite) obj; //objeto copia (con distintos espacios de memoria)
		//RECUERDA MODIFICAR LOS ATRIBUTOS PARA UTILIZAR SIEMPRE LOS GETTER:
		return getAltura() == other.getAltura() && Double.doubleToLongBits(getLatitud()) == Double.doubleToLongBits(other.getLatitud())
				&& Double.doubleToLongBits(getLongitud()) == Double.doubleToLongBits(other.getLongitud());
	}

	//metodo to string para imprimir los parametros: RECUERDA QUE HAY QUE USA LOS THIS.GETTER
	@Override
	public String toString() {
		return "Satelite [altura=" + this.getAltura()  + ", longitud=" + this.getLongitud() + ", latitud=" + this.getLatitud() + "]";
	}

	//METODOS PASO VALOR  QUE OPERAN:

	//1:se implementa un metodo imprimirPosicion (String msg) que mostrará [la logitud = ****
	//latitud = **** altura = ****] el metodo no devuelve ningun valor:
	//msg será codificado en la línea de Main.
	public void imprimirPosicion(String msg) {
		msg = "[longitud = "+ getLongitud() + "latitud = "+ getLatitud()+"]";
		System.out.println(msg);
	}

	//2 metodo PASO VALOR void variarAltura (int nuevaAltura), que modifique la altura del satelite:
	/*--> el valor puede ser positivo o negativo (acerca y aleja de la tierra)
	 * , pero tendrá en cuenta la altura en la que se encontraba
	 *  para no chocar contra la tierra, es decir la resta de lo que habia y la altura de
	 *  lo que le restemos no puede ser menor a 0 o negativo, de dar un valor negativo
	 *  LA ALTURA NO SE VA HA MODIFICAR.*/

	public void variarAltura (int nuevaAltura) {
		nuevaAltura += this.getAltura();
		//SOLO HAZLO SI ES MAYOR A 0
		if (nuevaAltura > 0 ) {
			this.setAltura(nuevaAltura);
		}
	}



	//3 METODO PASO VALOR void variarPosicion(double nuevaLongitud, double nuevaLatitud)
	//--> la nueva posicion era establecida en los parametros del método.

	public void variarPosicion (double nuevaLongitud, double nuevaLatitud) {
		this.setLongitud(nuevaLongitud);
		this.setLatitud(nuevaLatitud);
	}



	//4 METODO PASO VALOR VOID moverSatelite(double nuevaLongitud, double nuevaLatitud, int nuevaAltura)
	// --> pista, utiliza los dos métodos anteriores para cambiar la posición
	public void moverSatelite(double nuevaLongitud, double nuevaLatitud, int nuevaAltura) {
		this.variarPosicion(nuevaLongitud, nuevaLatitud);
		this.variarAltura(nuevaAltura);

	}

	//5 METODO enOrbita() que devuelve (return) false si el satelite está en tierra (0 o -)
	//y true si está en el el espacio (>0)
	public boolean enOrbita() {
		if (this.getAltura() == 0) {
			return false;
		}else {
			return true;
		}
	}




	/* metrodo : tipoSatelite()   "BASADOS EN ALTURA (INT)"--> 
	 *
	 * --> ET en tierra = 0
	 * --> SC alt < 700000 metros
	 * --> LEO alt >= 700000 metros  y hasta = 1400000 metros
	 * --> MEO alt >1400000 y hasta = 20000000 metros
	 * --> GEO ALT > 20000000 HASTA 35786000 metros
	 * --> HEO alt 35786000 metros> 
	 * -->*/

	public String tipoSatelite() {
		if (this.getAltura() == 0) {
			return "ET";
		}
		else if (this.getAltura() < 700000) {
			return "SC";
		}
		else if (this.getAltura() < 1400000) {
			return "LEO";}

		else if (this.getAltura() < 20000000) {
			return "MEO";
		}
		else if (this.getAltura() < 35786000) {
			return "GEO";
		}
		else if (this.getAltura() < 35786000) {
			return "GEO";}
		else {
			return "HEO";
		}
	} //CIERRE METODO


	/* Metodo comprobarSatelite "return" (Satelite sat)
	 * _--> compurba si dos satelites son el mismo (satelite1copia)
	 * --> son de dos formaciones o contelaciones diferentes (disitinta clase) en el caso de que
	 * las coord coincidan pero no hagan referencia al mismo satelite.
	 * --> si las coord coinciden pero no hagan referencia al mismo satelite(satelite2copia)*/

	//UTILIZA EL ESQUEMA EQUALS, LE QUITA EL @Overrride, para poder modificarlo, el tipo de dato de equals por
	//defecto es bool, pero ahora queremos que return sea un string por lo cual esa es la primera modificacion que hace
	//despues el metodo no se va a llamar equals aunque tenga esa funcion, el nombre del objeto alias nos lo da el enuncia
	
	public String comprobarSatelite (Satelite sat) {
		if (this == sat) { //tienen la misma referencia 
			return "Ambos son el mismo satelite";
		} else if (this.getAltura() == sat.getAltura()&& //comparte los mismos atributos aunque no sea el mismo objeto
				this.getLatitud() == sat.getLatitud() &&
				this.getLongitud()== sat.getLongitud()
				) {
			return "Los dos satélites pertenecen a la misma constelació o formación";
		}else { // si no tiene lo mismos atributos, ni son el mismo objeto, cada obj es de su padre y de su madre.
			return "Los dos satélites orbitan de manera independiente";
		}
	}

	/* dados se debe comprobar si pertenecen a la misma formacion 
	 * comprobarFormacion(Satelite satelites) "NO RETURN, ES VOID"que pasando un número
	 * variable de satélites, utiliza la función anterior (comprobaSatelite) para mostrar
	 * el mensaje correspondiente al comparar el satelite que invoca el metodo
	 * con la formacion de satelites pasado por parametro */
	
		public  void comprobarFormacion (Satelite...satelites) {
			for(Satelite sat : satelites) {
				System.out.println(this.comprobarSatelite(sat));
			}
		}


	/*metodo mostrarSatelitesRegistrados() "VOID" que mostrará el siguiente mensaje
	 * #####
	 * # satelites registrados: x
	 * #####
	 * */
		//AQUI VAMOS A UTILIZAR EL ATRIBUTO static CONTADOR:
		public static void mostrarSatelitesRegistrados() {
			System.out.println("#####");
			System.out.println("# satelites registrados:" + Satelite.getNumSatelites());
			System.out.println("#####");
		}


	//MAIN 
	public static void main(String[] args) {

		// creamos objetos con parametros:
		Satelite satelite1 = new Satelite(35000,45.6792,46.9876);
		//CREAMOS UN OBJETO COPIA DE SATELITE 1: QUE OCUPA EL MISMO ESPACIO DE MEMORIA:
		Satelite satelite1Copia = satelite1;
		
		
		//creamos objeto sin parametros:
		Satelite satelite2 = new Satelite();
		//CREAMOS UN OBJ COPIA DE SATELITE 2: QUE OCUPA DISTINTO ESPACIO DE MEMORIA:
		Satelite satelite2Copia = new Satelite(satelite2);
		
		//vamos a llamar al EQUALS MODIFICADO cuyo nombre del método es: COMPROBARSATELITE en vez equals
		//PERO TIENE UNA FUNCION Y ESTRUCTURA SEMENJANTE:
		//recuerda que el metodo retorna, por los que SOP solo va a llamar al metodo:
		System.out.println(satelite1.comprobarSatelite(satelite2)); // retorna el else del metodo equals modificado
																	//son totalmente diferentes
		System.out.println(satelite1.comprobarSatelite(satelite1Copia));// retorna que son el mismo objeto, misma ref.
		System.out.println(satelite2.comprobarSatelite(satelite2Copia)); // retorna que comparte atrib. pero son distintos

		
		//utilizamos el METODO EQUALS PURO Y DURO (1º if equals) para comprobar si son el mismo objeto.
		//estamos creando variables para imprimir, pero se podría imprimir como en el ejemplo anterior 
		// y no creamos variables inecesarias.
		boolean mismoObjeto = satelite1.equals(satelite1Copia);
		//imprime resultado: 
		System.out.println(mismoObjeto);
		// 4 if de equals que compra atributos
		boolean mismoObjeto2 = satelite2.equals(satelite2Copia);
		//imprime resultado:
		System.out.println(mismoObjeto2);
		//COMPARAMOS DOS OBJETOS QUE NO SON IGUALES: FALSE
		boolean mismoObjeto3 = satelite1.equals(satelite2);
		System.out.println(mismoObjeto3);
		
		//usamos to string para imprimir posicion, pero no soy capaz de utilizar imprimirPosicion:
		String msg = satelite1.toString();
		
		System.out.println("La posicion de lo objeto es:" +msg);
		//System.out.println(satelite1.imprimirPosicion(msg)); // da error lo dejo comentado.
		//sop (satelite1.imprimirPosicion(satelite1.toString()); // tambien da error
		
		
		//UTILIZAMOS E IMPRIMIMOS METODOS PASO VALOR:
		
		satelite1.variarAltura(-27945); //altura original era 35000 en el metodo sumabamos la altura; devuele 7000
		System.out.println(satelite1.getAltura());
		//ahora vamos a hacer que el satelite se choque contra la tierra y vamos a ver como entonces 
		//mover altura no le asigna la nueva altura: es decir, no se llega a ejecutar el metodo y se queda en 7000.
		satelite1.variarAltura(-40000);
		System.out.println(satelite1.getAltura());
		
		satelite1.variarPosicion(35000, 45000);//longitud y latitud;
		System.out.println(satelite1.getLatitud() + satelite1.getLongitud());
		
		
		
		

	}
}