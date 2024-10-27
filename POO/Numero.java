import java.util.*;
public class Numero {
	/*6. Realiza una clase Numero que almacene un número entero y tenga las
siguientes características:
a. Constructor por defecto que inicializa a 0 el número interno.
b. Constructor que inicializa el número interno
c. Método añade que permite sumarle un número al valor
interno. El número a sumar se pasa por parámetro.
d. Método resta que resta un número al valor interno.
e. Método getValor. Devuelve el valor interno.
f. Método getDoble. Devuelve el doble del valor interno.
g. Método getTriple. Devuelve el triple del valor interno
h. Método setNumero. Inicializa de nuevo el valor interno
	Haz una clase de prueba para probar la clase.
Extra: crea un método que asigne un valor aleatorio al número. Para
ello, busca información de cómo crear un número aleatorio.
 */
	private int numero;
	
	//metodo constructor inicializado  con  parametros
	
	public Numero(int numero) {
		
		this.numero = numero;
	}

	//metodo constructor por defecto sin inicializar 0  sin parametros.

	public Numero() {
	
	}
	
	//setter y getter:
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}
	
	//METODOS QUE OPERAN es void porque no devuelve nada solo modifica.
	
	public void suma(int p_suma) {
		this.numero += p_suma;
	}
	
	public void  resta(int p_resta) {
		this.numero -= p_resta;
	}
	
	public void aleatorio (int min, int max) {
		this.numero = min+(int)(Math.random()* max + 1);
	}
	
	public int getTriple() {
		return numero * 3;
	}
	public int getDoble() {
		return numero * 2;
	}
	
	//metodo aleatorio 

	//LINEA MAIN
	public static void main(String[] args) {
		//CREAMOS EL OBJETO
		Numero num1 = new Numero();
		num1.aleatorio(1, 1000);
		System.out.println(num1.toString());
		System.out.println(num1.getDoble());
	}

}
