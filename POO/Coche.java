
public class Coche{
	
	/*1. Crea la clase Coche con dos constructores. Uno no toma parámetros y
	el otro sí. Los dos constructores inicializarán los atributos marca y
	modelo de la clase. Crea dos objetos (cada objeto llama a un
	constructor distinto) y verifica que todo funciona correctamente.
	*/
	
	
	//creamos los atributos 
	
	private String marca;
	private String modelo;
	
	//creamos los contructores:
	
	//CONTRUCTOR (COCHE1) CON PARAMETROS ASIGNADOS EN MAIN:
	// java sabe que este constructor es para coche1 porque recibe un parametro string y un parametro boolean en ese mismo orden,
	public Coche (String p_marca, String p_modelo) { // public nombreclase (typo variable + parametro)
		this.marca = p_marca;      // this.atributo = parametro
		this.modelo = p_modelo;	// this.atributo = parametro
		
	}
	
	//CONSTRUCTOR (COCHE2) CON PARAMETROS NO ESTABLECIDOS EN MAIN: 
	//java sabe que este coche es coche 2 porque no tiene parametros
	public Coche () {
		this.marca = "hyundai";
		this.modelo = "Terracan";
	}
	
	
	//creamos los métodos set y get: para asignar valores y devolverlos.
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
		
		//objeto con los parametros de los atributos asignados
		Coche coche1 = new Coche("Volkswagen", "Polo");
		
		//objeto sin parametros;
		Coche coche2 = new Coche ();
		
		System.out.println("la marca del coche1 es "+coche1.getMarca()+"el modelo del coche 1 es "+coche1.getModelo());
		System.out.println("la marca del coche2 es "+coche2.getMarca()+"el modelo del coche 1 es "+coche2.getModelo());
	}

}
