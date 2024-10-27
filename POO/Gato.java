
public class Gato {
	//creamos los atributos
	private String nombre;
	private int vidas;

	//metodos constructores sin parametros: using fields (para vacio quita los cuadrados)
										//(para rellenos click en cuadrados)
	public Gato() {
		
	}
	
	
	// metodo constructor con parametros con using fields //(para rellenos click en cuadrados)
	public Gato(String nombre, int vidas) {
		super();
		this.nombre = nombre;
		this.vidas = vidas;
	}
	
	//getter y setter
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVidas() {
		return vidas;
	}


	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	//METODO TO STRING: fcilita la impresion de atributos del objeto
	

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", vidas=" + vidas + "]";
	}


	//linea principal MAIN
	public static void main(String[] args) {
		//declaramos un objeto:
		Gato misifu = null; //esto hace referencia a objeto vacio
		
		if (misifu == null) {
		System.out.println("misifu solo esta declarado");
		}else {
			System.out.println("misifu solo esta declarado");
		}
		

	}

}
