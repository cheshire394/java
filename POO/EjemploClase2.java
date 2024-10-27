
public class EjemploClase2 {
	//atributos
	private int passenger;
	private int fuelcap;
	private int mpg;
	
	//métodos get
	public int devolverAtributoPassenger () {
		return this.passenger;
	}
	public int devolverAtributoFuelcap () {
		return this.fuelcap;
	}
	public int devolverAtributoMpg() {
		return this.mpg;
	}
	
	//le das la información: set
	public void asignarAtributoPassenger (int p_passenger) {
		this.passenger = p_passenger;
	}
	public void asignarAtributoFuelcap (int p_fuelcap) {
		this.fuelcap = p_fuelcap;
	}
	public void asignarAtributoMpg (int p_mpg) {
		this.mpg = p_mpg;
	}
	
	//finalmente método main
	public static void main(String[] args) {
		//creamos los objetos
		EjemploClase2 minivan = new EjemploClase2();
		EjemploClase2 sportvan = new EjemploClase2();
		
		
		//asignamos valores a atributos: set
		minivan.asignarAtributoPassenger(12); //minivan.passenger = 12;
		minivan.asignarAtributoFuelcap(23); //minivan.fuelcap = 23
		minivan.asignarAtributoMpg(45); //minivan.mpg = 45
		
		//get
		System.out.println(minivan.devolverAtributoPassenger()); // System.out.println(minivan.passenger)
		
		}
		
		
		
		

	}

