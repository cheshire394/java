
/*2. Crea una clase Coche con un atributo velocidad. Añade a la clase Coche
		los siguientes métodos:
		a. Método constructor sin parámetros.
		b. int getVelocidad(). Este método devuelve la velocidad actual.
		c. Int setVelocidad(). Este método actualiza la velocidad actual.
		d. void acelera (int incremento). Este método actualiza la
		velocidad a incremento kilómetros más.
		e. void frena (int decremento). Este método actualiza la velocidad
		a decremento kilómetros menos.*/
public class CocheEj2 {
	//creamos el atributo en privado
	
	private  int velocidad;
	
	// creamos el metodo constructor sin parametros: public + nombre clase(){}
	public CocheEj2() {
		
		
	}
	
	
	//generamos los metodos set y get que asigna el valor y y devuelve el valor de velocidad
	public int getVelocidad() {
		return velocidad;
	}



	public void setVelocidad(int p_velocidad) {
		this.velocidad = p_velocidad;
	}



	public static void main(String[] args) {
		
		
		//creamos el objeto coche sin parametros
		CocheEj2 coche = new CocheEj2 ();
		
		

	}

}
