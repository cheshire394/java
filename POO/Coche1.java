
public class Coche1 {
	// declaramos Atributos
	String marca;
	String modelo;
	
	//creamos metodo constructor del objeto 1: el hyundai
	public Coche1(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		
	}
	//creamos el método constructor del objeto2: sin asignar valores, se los damos en Main con el método set.
	public Coche1 () {
		
	}
	
	//zona de setting y getting
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	
	

	public static void main(String[] args) {
	/*	1. Crea la clase Coche con dos constructores. Uno no toma parámetros y
		el otro sí. Los dos constructores inicializarán los atributos marca y
		modelo de la clase. Crea dos objetos (cada objeto llama a un
		constructor distinto) y verifica que todo funciona correctamente.*/
		
		//Aqui creamos el objeto 1 y le inicializamos los atributos
		Coche1 vehiculo1 = new Coche1 ("hyunday", "terracan");
		System.out.println("el coche 1 tiene la marca: "+ vehiculo1.getMarca() + "modelo: "+ vehiculo1.getModelo());
		
		//aqui creamos el objeto 2 pero sin inicializar
		Coche1 vehiculo2 = new Coche1 (); 
		vehiculo2.setMarca("volkswagen");//aqui le estamos dando posteriormente un valor al atributo marca, el otro va a ser null
		System.out.println("el coche 2 tiene la marca: "+ vehiculo2.getMarca() + "modelo: "+ vehiculo2.getModelo());


	}

}
