

public class Finanzas {
	/**
	  4. Realiza una clase Finanzas que convierta dólares a euros y viceversa. 
		Codifica los métodos dolaresToEuros (double dolares) y eurosToDolares
		(double euros). Prueba que dicha clase funciona correctamente 
		haciendo conversiones entre euros y dólares.

	 **/

	//Atributos
	private double euros;
	private double dolares;

	//Sin constructores

	//Método de dolar a euro
	double dolaresToEuros(double p_dolares) {
		this.dolares = p_dolares; //Le digo que el dato que me da, es igual que el atributo
		p_dolares = p_dolares*1.05; //El dato dato lo cálculo para que me de los euros
		//Cada vez que se ejecute este método imprima la siguiente frase
		System.out.println("Tus " + dolares + " Euros son: " + p_dolares + " Dolares");
		return p_dolares; //Como es un método necesito un return (el dato que le he dado y que he calculado después)
	}

	//Método de euro a dolar
	double eurosToDolares(double p_euros) {
		this.euros = p_euros; //Le digo que el dato que me da, es igual que el atributo
		p_euros = p_euros*0.94; //El dato dato lo cálculo para que me de los dolares
		//Cada vez que se ejecute este método imprima la siguiente frase
		System.out.println("Tus " + euros + " Dolares son: " + p_euros + " Euros");
		return p_euros;//Como es un método necesito un return (el dato que le he dado y que he calculado)
	}



//Método main (principal)
	public static void main(String[] args) {

		//Creo un objeto sin darle ningún valor
		Finanzas convertir = new Finanzas();

		//Uso los métodos dandoles valor
		convertir.dolaresToEuros(5.00); //Nombre del objeto, luego el método, y el valor
		convertir.eurosToDolares(5.00); //Nombre del objeto, luego el método, y el valor

		//No hay System.out.println(); por que lo estoy usando en los métodos, sino:
		//System.out.println(convertir.dolaresToEuros(5.00));
		//System.out.println(convertir.eurosToDolares(5.00));
	}

}