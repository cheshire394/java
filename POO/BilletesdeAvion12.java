
public class BilletesdeAvion12 {
	/*
		12. Modifica la clase anterior para establecer costes. Un billete en turista
		costará 200€, en business 400 € y en VIP 600 €. Tanto business como VIP
		llevan el catering y el banno incluidos. Para los viajeros de clase turista que
		deseen contratar estos servicios, el catering costará 20€ y el banno 10€.
		
		
		Además la clase turista llevará una maleta incluida, business tres y VIP no
		tendrá límite en el número de maletas. Cada maleta adicional por encima
		del límite en la clase correspondiente costará 50 €. El viajero podrá
		consultar en cualquier momento el coste total del billete.*/
	
	//creamos constantes para precios
	private final int PRECIO_TURISTA = 200;
	private final int PRECIO_BUSINESS = 400;
	private final int PRECIO_VIP = 600;
	
	private String nombreViajero, nifViajero;
	private int maletas, asiento;
	private int precio;




	private boolean catering, banno, turista = false, vip = false, business = false;








	//constructor por defecto
	public BilletesdeAvion12	() {


	}

	public BilletesdeAvion12(String nombreViajero, String nifViajero, int maletas, int asiento, boolean catering,
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
	public BilletesdeAvion12(BilletesAvion copia) {
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


	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

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
	/*EN EL EJERCICIO 11 ESTE METODO ERA VOID PERO COMO AHORA NECESITAMOS
	 * QUE ESTE METODO SEA LLAMADO EN OTRO METODO, ES IMPRECINDIBLE UTILIZAR
	 * EL VALOR QUE RETORNA PARA QUE PUEDA SER LLAMADO EN EL OTRO METODO
	 * PORQUE VA A SER LA CONDICION QUE EJECUTE UN IF O UN ELSE.
	 * LOS TIPOS DE CLASE SON LOS METODOS DONDE LOS VAMOS A LLAMAR*/
	public  boolean utilizarBanio (boolean banio) {
		if (banio) { // si el parametro bool pasado por main es true
			this.setBanno(true);// damos ese valor al setting
			return true;
			}
		this.setBanno(false);//si pasan false, damos este valor al setting
		return false; //y retorna false
		}

	//LO MISMO QUE EN BAÑO, TENEMOS QUE CAMBIARLO A RETURN (Es exactamete igual)
	public boolean utilizarCatering (boolean comer) {
		if (comer) {
			this.setCatering(true);
			return true;
		}
			this.setCatering(false);
			return false;
	}
	
	
	//mostrar las maletas que lleva cada viajero
	public void mostrarMaletas (int p_maletas) {
		
		//asinamos el valor pasado por parametro al set
		this.setMaletas(p_maletas);
		
			//mostramos  las maletas aqui
		System.out.println("El viajero " + this.getNombreViajero()+
				" viaja con "+this.getMaletas());
	}
	
	

	/*12. Modifica la clase anterior para establecer costes. Un billete en turista
	costará 200€, en business 400 € y en VIP 600 €. Tanto business como VIP
	llevan el catering y el banno incluidos. Para los viajeros de clase turista que
	deseen contratar estos servicios, el catering costará 20€ y el banno 10€.
	
	
	Además la clase turista llevará una maleta incluida, business tres y VIP no
	tendrá límite en el número de maletas. Cada maleta adicional por encima
	del límite en la clase correspondiente costará 50 €. El viajero podrá
	consultar en cualquier momento el coste total del billete.*/
	
	public void claseVip() {
		//precio único no modificado
		this.setPrecio(PRECIO_VIP);
		System.out.println("EL precio de la clase vip es: "+this.getPrecio());
		
		//ASIGNAMOS LOS SETTING TAL Y COMO ESPECIFICA EL ENUNCIADO
		this.setBanno(true);
		this.setCatering(true);
		this.setVip(true);
		this.setTurista(false);
		this.setBusiness(false);
	}
	
	
	public void claseBusiness () {
		//El precio inicial
		this.setPrecio(PRECIO_BUSINESS);
		//ASIGNAMOS LOS SETTINGO CONFORME EL ENUNCIADO SOLICITA
		this.setBanno(true);
		this.setCatering(true);
		this.setVip(false);
		this.setTurista(false);
		this.setBusiness(true);
		//3 maletas estan incluidas en el precio
		int maletasAdicionales = this.getMaletas()-3;
		//si aun así el resultado de la resta es mayor a 0,
		//esa maleta tiene un importe de 50 euros
		if(maletasAdicionales > 0) {
			//multiplicamos las maletas por 50
				maletasAdicionales*= 50;
			this.setPrecio(maletasAdicionales + PRECIO_BUSINESS);
		}
		System.out.println("EL precio business para "
				+this.getMaletas()+ " maletas"
						+ " es de: "+this.getPrecio());

		} 
	

	public void claseTurista () {
		
		//importante, utilizarBanio es un metodo, que retorna un valor
		//el true que aparece en la llamada del metodo, NO ES LO QUE LE PASAS
		//POR PARAMETRO (aunque coincida porque asi esta programado), EL TRUE
		// ES LO QUE RETORNA EL METODO, POR ESO HAS TENIDO QUE CAMBIAR EL METODO
		//A RETURN, PORQUE SINO, NO PODRIAS USARLO EN ESTE METODO.
		/* pero esto no quiere decir que no puedas llamar a un metodo void dentro
		 * de otro metodo, esto es solo necesario cuando necesitas una condición
		 * */
		// creamos una variable que acumele los precios,
		//iniciandose en nuestra constante
		int sumaPrecio = PRECIO_TURISTA;
		/*Desde el if hasta else, solo se ejecuta una opcion 
		 * y portanto solo un sumaPrecio*/
		if (utilizarBanio(true) && utilizarCatering(true)) {
			sumaPrecio += 30;
		}
		else if (utilizarBanio(true)) {
			sumaPrecio += 10;
		}
		else if(utilizarCatering(true)) {
			sumaPrecio += 20;
			
		} else {// si no contrata ningun servicio extra, el precio se mantiene.
			
			this.setPrecio(PRECIO_TURISTA);
		} 
	
		/*Las maletas las vamos a sumar con la variable recogida 
		 * anteriormente, dependiendo del sumaPrecio que se haya
		 * ejecutado se va a sumar ahora con esta variable*/
		
		//Al número de maletas que hemos recogido en main
		//le restamos 1, que es gratis o incluida en precio turista
		//si el numero que da es mayor a 0, multiplicamos las maletas
		//que sean por 50 y lo acumulamos en la suma
		int maletasAdicionales = this.getMaletas()-1;
		if (maletasAdicionales > 0) {
			sumaPrecio += maletasAdicionales * 50;
			
		}
		
		this.setPrecio(sumaPrecio);//asignamos el valor de la suma.
		//y una vez actualizado lo imprimimos los resultado de la suma
		System.out.println("precio turista total : "+this.getPrecio());
		
	}

	public static void main(String[] args) {
		
		BilletesdeAvion12 viajero1 = new BilletesdeAvion12();
		//asignamos caterogia turista
		viajero1.categoria("business");
		//decimos que extras utilizará para ver los resultados (no olvides comentar)
		//los extras que se puedan contradecir.
		viajero1.utilizarBanio(false);
		//viajero1.utilizarBanio(false);
		viajero1.utilizarCatering(true);
		//viajero1.utilizarCatering(false);
		viajero1.mostrarMaletas(5);
		
		//COMPROBAMOS COMO SE MODIFICA EL PRECIO DEL BILLETE SEGUN LAS CONDICIONES
		viajero1.claseTurista(); //ejecutamos la clase que realiza las modificaciones
		System.out.println(viajero1.getPrecio());
		
		viajero1.claseBusiness();
		System.out.println(viajero1.getPrecio());
		
		viajero1.claseVip();
		System.out.println(viajero1.getPrecio());

	}

}
