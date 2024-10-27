
public class ChocosPapas {

	/*staurante mejicano de Israel cuya especialidad son las papas con
		chocos nos pide diseñar un método con el que se pueda saber cuántos
		clientes pueden atender con la materia prima que tienen en el almacén.
		El método recibe la cantidad de papas y chocos en kilos y devuelve el
		número de clientes que puede atender en el restaurante teniendo en
		cuenta que, por cada tres personas, Israel utiliza un kilo de papas y
		medio de chocos.*/

	//creamos las variables
	private double chocosK, papasK;
	//el numero de clientes atendidos inicialmente va a ser 0.
	private int numClientes = 0;


	public ChocosPapas() {

	}


	public ChocosPapas(double chocosK, double papasK) {

		this.chocosK = chocosK;
		this.papasK = papasK;
		
	}

	// CREAMOS CONSTRUCTOR COPIA
	public ChocosPapas(ChocosPapas copia) {
		this.chocosK = copia.getChocosK();
		this.papasK = copia.getPapasK();
		this.numClientes = copia.getNumClientes();

	}
	//creamos GETETR Y SETTER
	public double getChocosK() {
		return chocosK;
	}


	public void setChocosK(double chocosK) {
		this.chocosK = chocosK;
	}


	public double getPapasK() {
		return papasK;
	}


	public void setPapasK(double papasK) {
		this.papasK = papasK;
	}


	public int getNumClientes() {
		return numClientes;
	}


	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	/*El método recibe la cantidad de papas y chocos en kilos y devuelve el
		número de clientes que puede atender en el restaurante teniendo en
		cuenta que, por cada tres personas, Israel utiliza un kilo de papas y
		medio de chocos.*/
		//NO vamos a crear comensales:
	public int calcularClientesAtendidos() {
        // Definir la relación de consumo por cada tres personas
        int personasPorKiloPapas = 3;
        int personasPorMedioKiloChocos = 3;

        // Calcular la cantidad de clientes atendidos por papas y chocos
        int clientesPapas = (int) (this.getPapasK() / personasPorKiloPapas);
        int clientesChocos = (int) (this.getChocosK()/ personasPorMedioKiloChocos);

        // Devolver la cantidad mínima de clientes atendidos
        return Math.min(clientesPapas, clientesChocos);
    }


	/*
		11. Modifica el programa anterior creando una clase que permita
		almacenar los kilos de papas y chocos del restaurante. Implementa los
		siguientes métodos:*/
		//a. public void addChocos(int x). 
		//Añade x kilos de chocos a los ya existentes.
		
		public void addChocos(int x) {
			int kilosChocos = (int) this.getChocosK() + x;
			this.setChocosK(kilosChocos); 
		}
		
		//b. public void addPapas(int x).
		//Añade x kilos de papas a los ya existentes.
		public void addPapas(int x) {
			int kilosPapas = (int) this.getPapasK() + x;
			this.setPapasK(kilosPapas); 
		}
		
	
		//c. public int getComensales().
		//Devuelve el número de clientes que
		//puede atender el restaurante (este es el método anterior).
	
	
		//d. public void showChocos().
		//Muestra por pantalla los kilos de
		//chocos que hay en el almacén.
		public void showChocos() {
			System.out.println("El almacen contiene: "+this.getChocosK()
			+"kilos de chocos");
		}
	
		//e. public void showPapas(). 
		public void showPapas() {
			System.out.println("El almacen contiene: "+this.getPapasK()
			+"kilos de Papas");
		}
		//Muestra por pantalla los kilos de
		//papas que hay en el almacén*/



	public static void main(String[] args) {
		
		ChocosPapas miRestaurante = new ChocosPapas(0, 1);//(chocs, papas)

        int clientesAtendidos = miRestaurante.calcularClientesAtendidos();
        System.out.println("El restaurante puede atender a " +clientesAtendidos);
        
        
        //adicionamos más chocos y papas en el almacen
        miRestaurante.addChocos(6);//ahora almacen tiene  6k de chocos
        miRestaurante.addPapas(8);//ahora almacen tiene 9k de chocos
        
        //imprimimos el metodo mostrar para comprobar que hemos
        //adicionado correctamente las cantidades
        miRestaurante.showChocos();
        miRestaurante.showPapas();
        
        //como ahora hemos cambiado las cantidades kilos en alamacen
        //podremos atender a más clientes, comprobamos a cuantos
        clientesAtendidos = miRestaurante.calcularClientesAtendidos();miRestaurante.calcularClientesAtendidos();
        System.out.println("El restaurante puede atender a " + clientesAtendidos + " clientes.");
	}

}
