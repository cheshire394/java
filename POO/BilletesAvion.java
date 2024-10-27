import java.util.*;
public class BilletesAvion {

	/*1.Vamosa crear una clase de BilletesAvión. Cada billete tendrá un nombre
	y un NIF de viajero que puede viajar en una de las tres clases: turista,
	business o VIP. Cuando llegue a facturar se le asignará un asiento
	determinado. Además, puede haber contratado el catering o no, el poder
	ir al banno o no. También se debe guardar el número de maletas que lleva.
	Un cliente puede hacer una reserva inicial dando solo su nombre y nif o
	eligiendo una clase además.*/

	private String nombreViajero, nifViajero;
	private int maletas, asiento;
	private boolean catering, banno, turista = false, vip = false, business = false;








	//constructor por defecto
	public BilletesAvion() {


	}

	public BilletesAvion(String nombreViajero, String nifViajero, int maletas, int asiento, boolean catering,
			boolean banno,boolean turista, boolean vip, boolean business) {

		this.nombreViajero = nombreViajero;
		this.nifViajero = nifViajero;
		this.maletas = maletas;
		this.asiento = asiento;
		this.catering = catering;
		this.banno = banno;
		this.turista = turista;
		this.vip = vip;
		this.business = business;


	}

	//constructor copia
	public BilletesAvion(BilletesAvion copia) {
		this.nombreViajero = copia.getNombreViajero();
		this.nifViajero = copia.getNifViajero();
		this.maletas = copia.getMaletas();
		this.asiento = copia.getAsiento();
		this.catering = copia.isCatering();
		this.banno = copia.isBanno();
		this.turista = copia.isTurista();
		this.vip = copia.isBusiness();
		this.business = copia.isBusiness();

	}
	//creamos getter y setter



	public boolean isTurista() {
		return turista;
	}


	public void setTurista(boolean turista) {
		this.turista = turista;
	}


	public boolean isVip() {
		return vip;
	}


	public void setVip(boolean vip) {
		this.vip = vip;
	}


	public boolean isBusiness() {
		return business;
	}


	public void setBusiness(boolean business) {
		this.business = business;
	}


	public String getNombreViajero() {
		return nombreViajero;
	}


	public void setNombreViajero(String nombreViajero) {
		this.nombreViajero = nombreViajero;
	}


	public String getNifViajero() {
		return nifViajero;
	}


	public void setNifViajero(String nifViajero) {
		this.nifViajero = nifViajero;
	}


	public int getMaletas() {
		return maletas;
	}


	public void setMaletas(int maletas) {
		this.maletas = maletas;
	}


	public int getAsiento() {
		return asiento;
	}


	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}


	public boolean isCatering() {
		return catering;
	}


	public void setCatering(boolean catering) {
		this.catering = catering;
	}


	public boolean isBanno() {
		return banno;
	}


	public void setBanno(boolean banno) {
		this.banno = banno;
	}
	
	//METODO TO STRING
	
	@Override
	public String toString() {
		return "BilletesAvion [nombreViajero=" + this.getNombreViajero() + ", nifViajero=" + this.getNifViajero() + ", maletas=" + this.getMaletas()
				+ ", asiento=" + this.getAsiento() + ", catering=" + this.isCatering() + ", banno=" +this.isBanno() + ", turista=" + this.isTurista()+
				 ", vip=" + this.isVip() + ", business=" + this.isBusiness() + "]";
	}

	//METODOS QUE OPERAN

	// ELIGE UNA CATEGORIA
	public void categoria (String categoria) {
		if(categoria.equalsIgnoreCase("vip")) {
			this.setVip(true);
			this.setTurista(false);
			this.setBusiness(false);
			System.out.println("el viajero "+this.getNombreViajero()+" viajará "
					+ "en la categoria: "+categoria);
			//la respuesta se imprime cuando llamamos al metodo en main

		}else if (categoria.equalsIgnoreCase("business")) {
			this.setBusiness(true);
			this.setVip(false);
			this.setTurista(false);
			System.out.println("el viajero "+this.getNombreViajero()+" viajará "
					+ "en la categoria: "+categoria);
			//la respuesta se imprime cuando llamamos al metodo en main
			
		}else {//categoria por defecto
			this.setTurista(true);
			this.setVip(false);
			this.setBusiness(false);
			System.out.println("el viajero "+this.getNombreViajero()+" viajará "
					+ "en la categoria: "+categoria);
			//la respuesta se imprime cuando llamamos al metodo en main
		}

	}
	

	//metodo que reserva por categoria y asigna asiento
	public int reservaPorCategoria(boolean categoria) {
		int asiento = (int)(Math.random()*(120-1+1)-1);
		if(categoria)  {
			if (asiento != this.getAsiento()) {
				this.setAsiento(asiento);
				System.out.println("el viajero "+this.getNombreViajero()+
						"ha reservado por categoria ");
				return asiento;
			}
			else {

				do {
					asiento = (int)(Math.random()*(120-1+1)-1);
				}while(asiento != this.getAsiento());
				this.setAsiento(asiento);
				System.out.println("el viajero "+this.getNombreViajero()+
						"ha reservado por categoria ");
				
			}return asiento;
		}
		return -1;
		}


	//metodo realizar reserva y asignar asiento:
	public int reservarPorNombre (String nombre, String dni) {
		//si nombre y dni no está vacio
		int asiento = (int)(Math.random()*(120-1+1)-1);

		if (!nombre.isEmpty() && (!dni.isEmpty())) {


			if (asiento != this.getAsiento()) {
				this.setAsiento(asiento);
				System.out.print("El asiento asignado para " +nombre+" es: ");
				return asiento;
				
			}
			else {

				do {
					asiento = (int)(Math.random()*(120-1+1)-1);
				}while(asiento != this.getAsiento());
				
				this.setAsiento(asiento);
			}
			System.out.print("El asiento asignado es: ");
			return asiento;
			
		}
		return -1;
		}


	//asignar asiento:--asignados por categoria o nombre

	// contratar servicios extra
	public  void utilizarBanio (boolean banio) {
		if (banio) {
			this.setBanno(true);
		}else {
			this.setBanno(false);
		}
	}
	
	public void utilizarCatering (boolean comer) {
		if (comer) {
			this.setCatering(true);
		}else {
			this.setCatering(false);
		}
	}
	
	
	//mostrar las maletas que lleva cada viajero
	public void mostrarMaletas (int p_maletas) {
		this.setMaletas(p_maletas);
		

		System.out.println("El viajero " + this.getNombreViajero()+
				" viaja con "+this.getMaletas());
	}



	public static void main(String[] args) {
		//LAS VARIABLES LAS COLOCAREMOS JUNTO A LOS METODOS PARA MEJORAR
		//EL ENTENDIMIENTO DEL PROGRAMA, PERO DEBERIAN DE ESTAR UBICADAS AQUI

		Scanner terminal = new Scanner(System.in);

		/*String nombreViajero, String nifViajero, int maletas, int asiento, boolean catering,
		boolean banno, boolean turista, boolean vip, boolean business,*/
		BilletesAvion viajero1 = new BilletesAvion();
		BilletesAvion viajero2 = new BilletesAvion();
		//SELECCIONAMOS UNA RESERVA
		String nombre, dni;
		String check;
		
		do {
			
		System.out.println("Introduce su nombre: ");
		nombre =terminal.nextLine();
		System.out.println("Introduce su dni: ");
		dni =terminal.nextLine();
		System.out.println("Compruba los datos introducidos y escriba si, si son"
				+ "correctos");
		check = terminal.nextLine();
		}while(!check.equalsIgnoreCase("si"));
		viajero1.reservarPorNombre(nombre, dni);
		//al, seleccionar este metodo
		//automáticamente se asigna un asiento en la reserva.
		System.out.println(viajero1.getAsiento());
		
		//dejamos asignado  el valor de las variables recogidas:
		viajero1.setNombreViajero(nombre);
		viajero1.setNifViajero(dni);
		
		//como viajero 2 va a reservar por categoria, le vamos a 
		//asignar nombre y dni de otra forma
		viajero2.setNombreViajero("Marta López");
		viajero2.setNifViajero("576584849-J");
		
		viajero2.reservaPorCategoria(true);//al reservar por categoria
		//automaticamente se reserva un asiento:
		System.out.println("El viajero "+viajero2.getNombreViajero()+ " tiene el asiento " 
		+viajero2.getAsiento());
		
		
		System.out.println();//decorativo.
		
		//selecionamos una categoría
		String categoria;
		System.out.println("Si desea viajar como bussiness o vip escriba la palabra: "
				+ "sino, escriba turista, *nota: si escribe otra palabra"
				+ "por defecto viajará en turista.");
		categoria =terminal.nextLine();
		
		viajero1.categoria(categoria);
		viajero1.categoria(categoria);

		
		
		//mostramos las maletas del viajero Juan
		int maletas = 0;
		System.out.println("Introduzca el número de maletas: ");
		maletas =terminal.nextInt();
		//asignamos la cantidad introducida en el metodo--> this.setMaletas(maletas);
		viajero1.mostrarMaletas(maletas);
		
		System.out.println(" maletas");//decorativo
		
		
		
		//CONTRATAMOS SERVICIOS EXTRA 
		boolean extraBannio, extraCatering; 
		System.out.println("si desea poder utilizar el baño, escriba true, "
				+ "sino, introduce false");
		extraBannio = terminal.nextBoolean();
		
		System.out.println("desea contratar servicio de catering, escriba true, "
				+ "sino intruduce false");
		extraCatering = terminal.nextBoolean();
		
		//Fin de asignacion de valores a los atributos. imprimimos toString
		//como demostración final de que todos los valores han sido asignados
		//tal y como el usuario los ha introducido.
		System.out.println("Destalle del pedido");
		System.out.println(viajero1.toString());
		System.out.println(viajero2.toString());
		
		
		terminal.close();
	}



}
