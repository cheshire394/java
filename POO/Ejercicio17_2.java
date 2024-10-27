import java.util.Arrays;

import java.util.Objects;
import java.util.*;
public class Ejercicio17_2 {

	/*EJERCICIO BASTATE COMPLICADO QUE INCLUYE COSAS NUEVAS
	 * */

	/*17.Crea una clase llamada Nombres, capaz de gestionar una lista de
	nombres de un tamaño determinado:
	• El constructor recibirá como parámetro el número máximo de
	nombres que albergará.
	• Tendrá los siguientes métodos:
	• int anadir(String): Añade a la lista el nombre pasado como
	parámetro. Devuelve -1 si la lista está llena, 0 si se añade con éxito y
	1 si ya existía el nombre (no admite repetidos).
	• boolean eliminar(String): Elimina de la lista el nombre pasado como
	parámetro. Devuelve true en caso de éxito y false si no encuentra el
	nombre a eliminar.
	• void vaciar(): Elimina todos los nombres de la lista.
	• String mostrar(int): Devuelve el nombre que se encuentra en la
	posición pasada como parámetro (la primera es la posición 0).
	• int numNombres(): Devuelve el número de nombres que hay
	actualmente.
	• int maxNombres(): Devuelve el número máximo de nombres que
	puede albergar.
	• boolean estaLlena(): Devuelve true si la lista está llena y false en
	caso contrario*/


	//creamos constantes
	final int MAXIMO = 5;

	//CREAMOS ATRIBUTOS
	/*ESTE ATRIBUTO ES DE TIPO ARRAY, ESTO NO QUIERE DECIR QUE SEA
	 * UN OBJETO, QUIERE DECIR QUE DENTRO DEL OBJETO, UNO DE SUS
	 * ATRIBUTOS CONTIENE UN ARRAY DE NOMBRES*/
	private String nombres[]; 
	private  static int contNombres = 0;




	//creamos constructores

	/*El constructor por defecto tiene especial importancia
	 * porque es el el donde vamos a iniciar el atributo de
	 * tipo array, es decir donde le vamos a dar los valores
	 * a esa "lista" de nombres que contiene el array*/
	public Ejercicio17_2() {
		this.nombres = new String[MAXIMO];//ESTO ES CLAVE
		/*aqui es donde estamos creando los nombres de la lista */

	}


	//CONSTRUCTOR PARAMETRIZADO
	public Ejercicio17_2(String[] nombres) {

		this.nombres = nombres;
	}









	//utlizamos el constructor parametrizado para crear un objetos
	//que contiene como máximo 5 nombres


	//GETTER Y SETTER, MAXIMO ES CONSTANTE SOLO TIENE GETTER

	public int getMAXIMO() {
		return MAXIMO;
	}



	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

	public static int getContNombres() {
		return contNombres;
	}


	public static void setContNombres(int contNombres) {
		Ejercicio17_2.contNombres = contNombres;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		return "Ejercicio17_2 [nombres=" + Arrays.toString(this.getNombres()) + "]";
	}




	//METODOS QUE OPERAN

	/*int anadir(String): Añade a la lista el nombre pasado como
	parámetro. Devuelve -1 si la lista está llena, 0 si se añade con éxito y
	1 si ya existía el nombre (no admite repetidos).*/


	public int añadir(String... nuevoNombres) {
		for (String copiaNuevoNombre : nuevoNombres) {
			// 1º condición: Que no haya más de 5 nombres
			if (contNombres >= MAXIMO) {
				System.out.println("Array de nombres completo");
				return -1;
			}

			// 2º condición: No debe estar repetido
			boolean nombreRepetido = false;
			for (int i = 0; i < contNombres; i++) {
				if (copiaNuevoNombre.equals(nombres[i])) {
					System.out.println("El nombre ya existe en el array: " + copiaNuevoNombre);
					nombreRepetido = true;
					break;
				}
			}

			// Si no está repetido, añadirlo al array
			if (!nombreRepetido) {
				nombres[contNombres] = copiaNuevoNombre;
				contNombres++;
			}
		}

		System.out.println("Nombres añadidos correctamente");
		return 0;
	}

	/* boolean eliminar(String): Elimina de la lista el nombre pasado como
		parámetro. Devuelve true en caso de éxito y false si no encuentra el
		nombre a eliminar.*/

	boolean eliminar (String eliminarNom) {


		for (int i = 0; i < nombres.length; i++) {
			//eliminarNom.equals(nombres[i]);
			nombres[i].equals(eliminarNom);
			nombres[i] = null;
			System.out.println("Nombre "+eliminarNom+" eliminado");
			return true;
		}

		System.out.println("Nombre "+eliminarNom+" no encontrado en el array");
		return false;
	}



	public static void main(String[] args) {


		Scanner terminal = new Scanner(System.in);

		// creamos un objeto de nombres, que tiene como max 5 nombres

		Ejercicio17_2 objNombres = new Ejercicio17_2 ();

		//caso correcto
		//objNombres.añadir("Miguel", "Marta", "luis", "fer", "teo");

		//caso correcto co falta de algun nombre para rellenar array
		objNombres.añadir("Miguel", "Marta");
		System.out.println("contador en: "+contNombres);

		//nombres repetidos al array anterior
		// NO LO AÑADE AL ARRAY
		objNombres.añadir("Miguel");
		System.out.println("contador en: "+contNombres);

		//array completo
		objNombres.añadir("fer", "luis", "Juan", "teo");
		System.out.println("contador en: "+contNombres);

		objNombres.eliminar("fer");
		System.out.println("contador en:"+contNombres);
		System.out.println(objNombres.toString());


	}

}
