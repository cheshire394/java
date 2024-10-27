import java.nio.file.spi.FileSystemProvider;

public class Viajes {
/*En una agencia de viajes se guarda la siguiente información por cada
	viaje: Ciudad de origen y ciudad de destino, código, importe del viaje
	por persona, número de adultos, número de niños. Se pide hacer una
	clase Viaje que contenga al menos los siguientes métodos:
	● Constructor. El código del viaje se forma con las dos primeras letras
	del origen (en mayúsculas), las dos primeras letras del destino (en
	mayúsculas) y el número de viaje.
	Nota: hay que usar funciones de la clase String
	● Método que reserve un número de plazas pasado como parámetro.
	Si no tiene plazas suficientes no reserva ninguna. Los niños tienen
	un 20% de descuento sobre el valor del billete. Devuelve el importe
	total de la reserva, 0 si no se puede realizar.
	● Método que modifique el número de plazas de un viaje, sólo si es
	posible, es decir nunca puede haber más reservas que plazas.
	Retorna si se ha podido realizar o no la modificación.
	● Método toString.
	● Método que muestre el total recaudado por la agencia.
	Codificar un main que realice las siguientes operaciones:
	● Crear dos viajes.
	● Mostrad la información de ambos viajes.
	● Reservad varias plazas de ambos viajes.
	● Modificad el número de plazas del primer viaje.
	● Mostrad de nuevo la información de ambos viajes.
	● Mostrad el total recaudado por la agencia*/

	
	private  int plazas = 50;

	private String origen;


	private String destino;
	private double importe;
	private int numAdulto;
	private int numNino;
	private int codigo;
	
	
	
	//constructor sin parametros
	public Viajes() {
		
	}
	
	
	//constructor con parametros
	public Viajes(String destino, double importe, int numAdulto, int numNino, int codigo) {

		this.destino = destino;
		this.importe = importe;
		this.numAdulto = numAdulto;
		this.numNino = numNino;
		this.codigo = codigo;
	}
	
	//seter y getter
	

	public String getOrigen() {
		return origen;
	}
	
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public int getNumAdulto() {
		return numAdulto;
	}


	public void setNumAdulto(int numAdulto) {
		this.numAdulto = numAdulto;
	}


	public int getNumNino() {
		return numNino;
	}


	public void setNumNino(int numNino) {
		this.numNino = numNino;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	/*Método que modifique el número de plazas de un viaje, sólo si es
	posible, es decir nunca puede haber más reservas que plazas.
	Retorna si se ha podido realizar o no la modificación. */
	public int numeroReservas (int reservas) {
		if (this.getplazas() ==  )
		return reservas = this.getNumAdulto() + this.getNumAdulto();
		
	}
	
	/*Método que reserve un número de plazas pasado como parámetro.
	Si no tiene plazas suficientes no reserva ninguna*/
	public void numeroPlazas (int p_numPlazas) {
		p_numPlazas = this.getNumAdulto() + this.getNumNino();
		if  (getPlazas() < p_numPlazas) {
			System.out.println("No quedan plazas");
			
		}else { this.setPlazas(this.getPlazas() - p_numPlazas); 
			
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Viajes [plazas=" + plazas + 
				", origen=" + origen + ","
				+ " destino=" + destino + 
				", importe=" + importe
				+ ", numAdulto=" + numAdulto + 
				", numNino=" 
				+ numNino + ", codigo=" + codigo + "]";
	}


	//LINEA MAIN
	public static void main(String[] args) {

	

	}

}
