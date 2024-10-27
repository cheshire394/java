//ejemplo de metodo sobrecarga 
public class EjemploSobrecarga {
	
	//son metodos de instancia porque necesita que haya objetos para ejecutarse
	
	//Metodo sobrecargado1
	public void daw1 (int param1) {
		System.out.println("Metodo sobrecargado:1 ");
		
	}
	
	//Metodo sobrecargado2
	public void  daw1 (String p1) {
		System.out.println("Metodo sobrecargado:2 ");
		
	}
	
	//Metodo sobrecargado3
	public int daw1 (int param1, double param2) {
		System.out.println("Metodo sobrecargado:3 ");
		return 0;
	}
	
	
	//línea main 
	public static void main(String[] args) {
		EjemploSobrecarga obj1 = new EjemploSobrecarga();
		
		
		
		//creamos una variable, y lo hacemos dentro del main para que sea variable y no atributo
		int var1 = obj1.daw1(5,1.0);
		obj1.daw1("5");//llama al sobrecarga 2
		obj1.daw1(5); //llama al sobrecarga 1
		obj1.daw1(5, 5.4); //llama al sobrecarga 3
	}

}
