import java.util.*;
public class Lingotes {
	/*
	 * Crea la clase peso, la cual tendrá las siguientes características: a. Deberá
	 * tener un atributo donde se almacene el peso de un objeto. b. En el
	 * constructor se le pasará el peso y la medida en la que se ha tomado ('Lb'
	 * para libras, 'Li' para lingotes, 'Oz' para onzas, 'P' para peniques, 'K' para
	 * kilos, 'G' para gramos y 'Q' para quintales. c. Deberá tener los siguientes
	 * métodos: i. getLibras. Devuelve el peso en libras ii. getLingotes. Devuelve
	 * el peso en lingotes iii. convertirPeso(String medida). Devuelve el peso en la
	 * medida que se pase como parámetro. d. Para la realización del ejercicio toma
	 * como referencia los siguientes datos: i. 1 Libra = 16 onzas = 453 gramos ii.
	 * 1 Lingote = 32.17 libras = 14.59 kg iii. 1 Onza = 0.0625 libras= 28.35 gramos
	 * iv. 1 Penique = 0.05 onzas = 1.55 gramos v. 1 Quintal = 100 libras = 43.3 kg
	 * e. Crea además una clase de prueba para testear y verificar los
	 */

	// atributos
	private double peso;
	private String medida;

	// metodos constructor por defecto,
	// UTILIZAREMOS ESTE CONSTRUCTOR PARA ASIGNAR LOS PARAMETOS
	public Lingotes() {
		this.medida = "Li";
		this.peso = 6.9;
	}

	// contructor con paramentros
	public Lingotes(double peso, String medida) {

		this.peso = peso;
		this.medida = medida;
	}

	// constructor copia
	public Lingotes(Lingotes copia) {
		this.peso = copia.getPeso();
		this.medida = copia.getMedida();
	}

	// GETTER Y SETTER

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}




	public double getLibras() {
		double pesoLibras;
		switch (this.getMedida()) {

		case "Lb":
			pesoLibras = this.getPeso();
			break;
		case "Li":
			pesoLibras= this.getPeso() * 32.17;
			break;

		case "Oz":
			pesoLibras= this.getPeso() * 0.0625;
			break;
		case "P":
			double p_onzas = this.getPeso() * 0.05;
			pesoLibras= p_onzas * 0.0625;
			break;
		case "K": // ESTA CONVERSION NO TERMINO DE ENTENDERLA
			pesoLibras= this.getPeso() * 453 / 1000;
			break;
		case "G":
			pesoLibras= this.getPeso() * 453;
			break;
		case "Q":
			pesoLibras= this.getPeso() * 100;
			break;
		default: return -1;

		}
		return pesoLibras;
	}


	public double getLingotes () {
		double pesoLingotes;
		switch(this.getMedida()) {

		case "Lb":
			pesoLingotes = this.getPeso() * 32.17;
			break;
		case "Li":
			pesoLingotes= this.getPeso();//mismo valor que el entregado
			break;

		case "Oz":
			double p_libras = this.getPeso()*0.0625;//paso libras
			pesoLingotes= p_libras * 16; //de libras a onzas
			break;
		case "P": double p_gramo = this.getPeso() * 1.55; //pasamos a gramos
		pesoLingotes = p_gramo / 1000; // y de gramos a kg

		break;
		case "K": 
			pesoLingotes= this.getPeso() * 14.59;
			break;
		case "G":
			pesoLingotes= this.getPeso() * 1.55;
			break;
		case "Q": double p_libras2 = this.getPeso() * 100; //pasamos a libras
		pesoLingotes= p_libras2 *32.17; //y de libras a lingotes
		break;
		default: return -1;

		}
		return pesoLingotes;
	}

	/*i. 1 Libra = 16 onzas = 453 gramos

	 *ii 1 Lingote = 32.17 libras = 14.59 kg 

	iii. 1 Onza = 0.0625 libras= 28.35 gramos

	 iv. 1 Penique = 0.05 onzas = 1.55 gramos 

	v. 1 Quintal = 100 libras*/

	/*convertirPeso(String medida). Devuelve el peso en la
	 * medida que se pase como parámetro*/

	public double convertirPeso(String p_medida) {
		double pesoMedida;
		switch(p_medida) {

		case "Lb":
			pesoMedida = this.getLibras();
			break;
		case "Li":
			pesoMedida = this.getLingotes();
			break;

		case "Oz":
			pesoMedida = getLibras()* 0.0625;
			break;
		case "P": //el parentesis pasa a onzas y 
			pesoMedida = (getLibras() * 16) /0.05; 

			break;
		case "K": 
			pesoMedida= (this.getPeso() * 16)/453000;
			break;
		case "G":
			pesoMedida= this.getLibras() * 453;
			break;
		case "Q": pesoMedida = this.getLingotes() / 32.17; 
		// Convertir de lingotes a libras y luego a quintales
		break;
		default: return -1;

		}
		return pesoMedida;
	}

	public static void main(String[] args) {

		double peso;
		String medida;
		Scanner terminal = new Scanner(System.in);

		System.out.print("Introduzca un peso a: ");
		peso = terminal.nextDouble();
		System.out.print("Introduzca una medida a: ");
		medida = terminal.next();

		// creamos el objeto, sin parametros (asignados con next int)
		Lingotes objeto = new Lingotes(peso, medida);


		//llamamos al método
		System.out.print("pasamos a Libras = ");
		System.out.println(objeto.getLibras());
		System.out.print("pasamos a lingotes= ");
		System.out.println(objeto.getLingotes());
		
		//indica a que peso quieres convertir
		System.out.println(objeto.convertirPeso("G"));
			



		terminal.close();
	}

}
