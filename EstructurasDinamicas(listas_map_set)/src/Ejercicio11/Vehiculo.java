package Ejercicio11;


import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


import java.util.Iterator;


//
public class Vehiculo implements Comparable<Vehiculo> {


	/*Crea la clase Vehículo formada por los atributos: matrícula, marca,
	modelo, km, caballos. Crea 4 vehículos y añádelos a una colección
	ordenada (TreeSet), ordenados por la matrícula.
	Supongamos que ahora queremos ordenar los vehículos por los km.
	Modifica lo que corresponda para mostrar los vehículos ordenados por
	este atributo.
	Ampliación: intenta ordenar por km y, en caso de empate, por los caballos.*/
	
	private String matricula;
	private String marca;
	private String modelo; 
	private int km;
	private int caballo;
	
	
	
	
	public Vehiculo(String matricula, String marca, String modelo, int km, int caballo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.caballo = caballo;
	}
	
	


	//este metodo se autogenera con implements Comparable, pero hay que modificarlo
	
	
	
	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




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




	public int getKm() {
		return km;
	}




	public void setKm(int km) {
		this.km = km;
	}




	public int getCaballo() {
		return caballo;
	}




	public void setCaballo(int caballo) {
		this.caballo = caballo;
	}


	public int compareTo(Vehiculo otroVehiculo ) {
	    int resultado;

	    if (this.getKm() < otroVehiculo.getKm()) {
	        resultado = -1;
	    } else if (this.getKm() > otroVehiculo.getKm()) {
	        resultado = 1;
	    } else { //es decir si son iguales en km, comparamos en caballo
	        if (this.getCaballo() < otroVehiculo.getCaballo()) {
	            resultado = -1;
	        } else if (this.getCaballo() > otroVehiculo.getCaballo()) {
	            resultado = 1;
	        } else {
	            resultado = 0; // si tanto en caballos como en km son iguales, retorna que son iguales
	        }
	    }

	    return resultado;
	}

	
	//mostrar objetos ordenados
	
	public static void mostrarObjetos (TreeSet<Vehiculo> set) {
		
		Iterator<Vehiculo> it = set.descendingIterator();
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
		
		
	}
	
	
	//mostrar objetos ordenados
	
	public static void eliminarToyotas (TreeSet<Vehiculo> set) {
		
		Iterator<Vehiculo> it = set.descendingIterator();
		
		while(it.hasNext()) {
			
			Vehiculo objetoActual = it.next();	
			
			if(objetoActual.getMarca().equals("Toyota")) it.remove(); // llamar a it, no a set.
				
			
			System.out.println(it.next());
		}
		
		
	}
	
	
	

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km
				+ ", caballo=" + caballo + "]";
	}

	




	public static void main(String[] args) {

		//creamos TreeShet
		TreeSet<Vehiculo> vehiculos = new TreeSet<Vehiculo>();
		
		//creamos 4 vehiculos
		Vehiculo vehiculo1 = new Vehiculo("123ABC", "Toyota", "Corolla", 50000, 150);
		Vehiculo vehiculo2 = new Vehiculo("456DEF", "Ford", "Focus", 60000, 120);
		Vehiculo vehiculo3 = new Vehiculo("789GHI", "Honda", "Civic", 40000, 140);
		Vehiculo vehiculo4 = new Vehiculo("101JKL", "Chevrolet", "Cruze", 55000, 130);

		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		vehiculos.add(vehiculo4);
		
		
	mostrarObjetos(vehiculos); //en orden descendete
	
	System.out.println();
	eliminarToyotas(vehiculos); 
	System.out.println(vehiculos);
	
	
		



	}
	



	
}
