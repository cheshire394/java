
public class Consumo {
	/*9. Implementa una clase Consumo, la cual forma parte de la centralita
electrónica de un coche y tiene las siguientes características:
• Atributos:
o kms: kilómetros recorridos con el coche
o litros: litros de combustible consumido
o vmed: velocidad media
o pgas: importe gastado en la gasolina*/

	private int kms;
	private double litros;
	private int vmed;
	private double pgas;
	
	private static int contador=0;

		




	//CONSTRUCTOR POR DEFECTO
	public Consumo() {
		contador++;
	}




	//CONSTRUCTOR CON TODOS LOS PARAMETROS
	public Consumo(int kms, double litros, int vmed, double pgas) {

		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
		contador++;
	}


	//CONSTRUCTOR COPIA

	public Consumo(Consumo copia) {
		this.kms= (int) copia.getKms();
		this.litros = copia.getLitros();
		this.vmed = (int) copia.getVmed();
		this.pgas = copia.getPgas();
		contador++;
	}


	//creamos getter y setter
	public static int getContador() {
		return contador;
	}
	
	
	public static void setContador(int contador) {
		Consumo.contador = contador;
	}
	public double getKms() {
		return kms;
	}





	public void setKms(double kms) {
		this.kms = (int) kms;
	}





	public double getLitros() {
		return litros;
	}





	public void setLitros(double litros) {
		this.litros = litros;
	}





	public double getVmed() {
		return vmed;
	}





	public void setVmed(int vmed) {
		this.vmed = vmed;
	}





	public double getPgas() {
		return pgas;
	}





	public void setPgas(double pgas) {
		this.pgas = pgas;
	}







	/*
• Métodos:
o getTiempo: indicará el tiempo empleado en realizar el viaje*/
	public int getTiempo() {
		int tiempo= (int) (this.getVmed()/ this.getKms());
		//convertimos a minutos para obterner un integer
		tiempo = tiempo * 60;
		return tiempo;
	}
	

	
/*o consumoMedio: consumo medio del vehículo (en litros
cada 100 km)*/
	
	public double consumoMedio() {
		return (this.getLitros()*this.getKms())/100;
	}
	
/*o consumoEuros: consumo medio del vehículo (en euros
cada 100 kilómetros)*/
	
	public double consumoEuros() {
		return (this.getPgas()*100)/ this.getKms();
		
	}
	
	//calcula a que precio esta la gasolina
	public double precioGasolinaLitro() {
		return this.getPgas() / this.getLitros();
	}

	//calcula cuantos viajes se han realizado
	public static void  totalViajes () {
		System.out.println("El numero total de viajes es: "+contador);
	}



	public static void main(String[] args) {
		//int kms, double litros, double vmed, double pgas
		Consumo viaje1= new Consumo( 50, 10.50, 100, 35.87);
		
		//comprobamos tiempo viaje 1:
		System.out.println("El tiempo de viaje ha sido: "
		+viaje1.getTiempo()+" minutos");
	
		//imprimimos el consumo medio
		System.out.println("El consumo medio a los 100 km es de "
		+viaje1.consumoMedio()+" litros");
		
		//imprimimos el consumo medio
				System.out.println("el precio gasolina a los 100 km es de "
				+viaje1.consumoEuros()+" euros");
				
		//el precio de la gasolina por litro es de
				System.out.println("El precio "
						+ "de la gasolina por litro "
						+ "es de: "+viaje1.precioGasolinaLitro());
				
		//el número total de viajes creados es:
				Consumo.totalViajes();
	}
	

}
