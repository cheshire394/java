import java.util.Objects;

public class Vehiculo {

	//creamos atributos
	private int motor, vel_max, peso;
	private static int contadorObj;



	//creamos constructor por defecto con parametros por defecto

	public Vehiculo() {
		this.setMotor(150);
		this.setVel_max(160);
		this.setPeso(4000);
		contadorObj++;
	}
	//creamos constructor con parametros
	public Vehiculo(int motor, int vel_max, int peso) {

		this.motor = motor;
		this.vel_max = vel_max;
		this.peso = peso;
		contadorObj++;
	}


	//creamos constructor copia
	public Vehiculo(Vehiculo copia) {

		this.motor = copia.getMotor();
		this.vel_max = copia.getVel_max();
		this.peso = copia.getPeso(); 
		contadorObj++;
	}


	//creamos getter y setter
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public int getVel_max() {
		return vel_max;
	}
	public void setVel_max(int vel_max) {
		this.vel_max = vel_max;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public static int getContadorObj() {
		return contadorObj;
	}
	public static void setContadorObj(int contadorObj) {
		Vehiculo.contadorObj = contadorObj;
	}



	//	Creamos metodo to String
	@Override
	public String toString() {
		return "Vehiculo [motor=" + this.getMotor() + ", vel_max=" + this.getVel_max() + ", peso=" + this.getPeso() + "]";
	} 

	//METODOS QUE OPERAN 

	public static  void   contadorObjetos () {
		System.out.println(getContadorObj());

	}

	//clase vehiculo
	public String tipoVehiculo () {
		if((this.getPeso()- this.getVel_max()< 2000)|| 
				(this.getPeso()- this.getMotor()< 2000)
				&& (this.getMotor()== 2180)){
			return "A"; 
		}else if ((this.getPeso()>= 2000) ||(this.getPeso()<= 2180) ){

			return "B";
		}
		return "C"; 
	}

	//comparar vehiculos


	public String compararCaracteristicas() {
		// cuando todas las caracteristicas son iguales
		if(this.getMotor() == this.getPeso()&& 
				this.getMotor()== this.getVel_max()&& 
				this.getPeso()== this.getVel_max()) {
			return "Kart";
		}
		//cuando solo alguna caracteristica es distinta entre si
		else if(this.getMotor() != this.getPeso()|| 
				this.getMotor()!= this.getVel_max()||
				this.getPeso()!= this.getVel_max()) {
			return "rally";
		}
		
		else if(this.getMotor() != this.getPeso()&& 
				this.getMotor()!= this.getVel_max()&& 
				this.getPeso()!= this.getVel_max()) {
			return "f1";
		}
		return "ERROR EN LAS CARACTERISTICAS DEL VEHICULO"; 
	}

	//METODO MOSTRAR INFORMACION: 
	public void  mostrarInformacion(String msg) {
		msg = this.toString() +" tipo "+ this.tipoVehiculo() +" "+ this.compararCaracteristicas();
		System.out.println(msg);
		
	}

		//metodo sin objeto
	public static int SinObjeto (int velMax, int motor) {
		int ratio = velMax/ motor; 
		return ratio; 
		
	}






	public static  void main (String[]args) {
		//creamos objeto con parametros
		Vehiculo vehiculo1 = new Vehiculo(77, 87, 75);
		//probamos el constructo copia
		Vehiculo Copiavehiculo1 = new Vehiculo(vehiculo1);
		Vehiculo vehiculo2 = new Vehiculo();
		Vehiculo vehiculo3 = new Vehiculo();


		//comprobamos que los objetos creados son contados, mediante un método que contiene un getter.
		System.out.print("obejetos creados: ");
		Vehiculo.contadorObjetos() ;


		//comprobamos el tipo de vehiculo: 
		System.out.print("El vehiculo1 es de tipo: " );
		System.out.println(vehiculo1.tipoVehiculo());
		System.out.print("El vehiculo2 es de tipo: " );
		System.out.println(vehiculo2.tipoVehiculo());
		System.out.print("El vehculo3 es de tipo: " );
		System.out.println(vehiculo3.tipoVehiculo());

		//comprobamos si las caracteristicas son iguales:
		System.out.print("tipo de vehiculo 1 según sus caracteristicas: ");
		System.out.println(vehiculo1.compararCaracteristicas());
		System.out.print("tipo de vehiculo 2 según sus caracteristicas: ");
		System.out.println(vehiculo2.compararCaracteristicas());
		System.out.print("tipo de vehiculo 3 según sus caracteristicas: ");
		System.out.println(vehiculo3.compararCaracteristicas());
		
		// comprobamos informacion del vehiculo
		vehiculo1.mostrarInformacion(null);
		vehiculo2.mostrarInformacion(null);
		vehiculo3.mostrarInformacion(null);
		
		//metodo sin objeto
		System.out.print("ratio de Sin objeto es: ");
		System.out.println(Vehiculo.SinObjeto(160, 76));


	}
}











