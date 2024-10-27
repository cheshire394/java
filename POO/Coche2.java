package Tema3_Orientado_a_Objetos;

public class Coche2 {
	/**
   	2.	Crea una clase Coche con un atributo velocidad. Añade a la clase Coche 
		los siguientes métodos:
			a. Método constructor sin parámetros.
			b. int getVelocidad(). Este método devuelve la velocidad actual.
			c. Int setVelocidad(). Este método actualiza la velocidad actual.
			d. void acelera (int incremento). Este método actualiza la 
			   velocidad a incremento kilómetros más.
			e. void frena (int decremento). Este método actualiza la velocidad 
			   a decremento kilómetros menos.
	 **/

	//Atributos
	public double velocidad;
	public String marca;
	public String modelo;

	//*********************************************************************************
	//Contructor sin parámetros
	public Coche2() {
		this.marca = "Desconocido"; //Le digo que el atributo por defecto es desconocido
		this.modelo = "Desconocido";//Le digo que el atributo por defecto es desconocido
		this.velocidad = 0;//Le digo que el atributo por defecto es 0
	}

	//*********************************************************************************
	//Getter y Setter 
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	//*********************************************************************************
	//Método acelerar
	public void acelera(int incremento) { //Cuando el método es void no tiene return

		if (incremento <= velocidad) { //Si el incremento es menor o igual que la velocidad
			System.out.println("No se puede acelerar, la velocidad dada es inferior a la velocidad a la que vas. Tu velocidad es de: " + velocidad);
		}else if(incremento > velocidad) { //Si el incremento es mayor que la velocidad
			this.velocidad = incremento; //Actualiza la velocidad
			System.out.println("Velocidad aumentada a: " + velocidad);
		}

	}
	//Método frenar
	public void frena(int decremento) { //Cuando el método es void no tiene return

		if (decremento <= velocidad) { //Si el decremento es menor o igual que la velocidad
			this.velocidad = decremento; //Actualiza la velocidad
			System.out.println("Velocidad frenada a: " + velocidad);
		}else if(decremento > velocidad) { //Si el decremento es mayor que la velocidad
			System.out.println("No se puede frenar con esa velocidad, es mayor a la velocidad vas: " + velocidad);
		}
	}

	//En ambos métodos ya tienen el system.out.orintln() para que me impriman sus características

	public static void main(String[] args) {

		//Creo el primer coche sin valor
		Coche2 coche1 = new Coche2();

		//Asigno la velocidad del coche(un valor)
		coche1.setVelocidad(20);

		//Uso de los métodos

		//El coche va a 20 por que se lo dije en el objeto

		coche1.frena(10); //Frena a 10 y se actualiza la la velocidad

		coche1.acelera(30);//Acelera a 30 y se actualiza la la velocidad

		coche1.frena(55); //Frena a 55, tiene que dar el error, no se actualiza la velocidad

		//No está el System.out.println(); por que lo puse en los métodos cuando se ejecuten, sino:
		//System.out.println(coche1.frena(10));
		//System.out.println(coche1.acelera(30));
		//System.out.println(coche1.frena(55));
	}
}

