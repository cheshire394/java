
public class Finanzas4 {
	/*4. Realiza una clase Finanzas que convierta dólares a euros y viceversa.
	Codifica los métodos dolaresToEuros (double dolares) y eurosToDolares
	(double euros). Prueba que dicha clase funciona correctamente
	haciendo conversiones entre euros y dólares.
		 */
	
	//creamos atributos
	private int dolares;
	private int euros;
	
	
	//METODOS 
	public double dolaresToEuros (double dolares) {
		return dolares * 0.94;
	}
	
	public double eurosToDolares (double euros) {
		return euros * 1.06;
	}
	
	
	
	
	
	
	//creamos getter y setter
	public int getDolares() {
		return dolares;
	}






	public void setDolares(int dolares) {
		this.dolares = dolares;
	}






	public int getEuros() {
		return euros;
	}






	public void setEuros(int euros) {
		this.euros = euros;
	}






	
	
	
	
	
	
	public static void main (String []args) {
		Finanzas4 cartera1 = new Finanzas4();
		System.out.println(cartera1.dolaresToEuros(1.0));
		System.out.println(cartera1.eurosToDolares(1.0));
		
		
		
	}
	
	}


