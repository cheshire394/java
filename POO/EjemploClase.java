
public class EjemploClase {
	//declaramos los atributos, los atributos solo se declaran, pero no se inicializan
		public String  nombre;
		public String color;
		public int edad; 
		public boolean animalDomestico;
				
			//declaramos los métodos
			
			//si es necesario,declaramos el método main
		
		

	public static void main(String[] args) {
		//creamos o instanciamos  un objeto de esta clase = nombreClase objeto = new nombreClase();
		EjemploClase mipajaro = new EjemploClase();
	
		mipajaro.nombre = "joy";
		mipajaro.color = "Amarillo";
		mipajaro.edad = 6;
		mipajaro.animalDomestico = true;
		
		System.out.println("Nombre"+mipajaro.nombre);
		System.out.println("color"+mipajaro.color);
		System.out.println("edad" + mipajaro.edad);
		System.out.println("animal domestico "+mipajaro.animalDomestico);
	} 

}
