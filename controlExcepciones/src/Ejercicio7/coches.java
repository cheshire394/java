package Ejercicio7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class coches {

	private int codigoCliente; 

	private String matricula; 
	private int num_puertas; 
	private HashMap<String, String> marca = new HashMap<>(); 
	private double dimensiones[] = new double[3];
	private double largo, ancho, alto; 

	private Object setDimensiones;

	private Object getDimensiones;


	public coches(int codigoCliente, String matricula, int num_puertas, HashMap<String, String> marca,
			double[] dimensiones) {

		this.codigoCliente = codigoCliente;
		this.matricula = matricula;
		this.num_puertas = num_puertas;
		this.marca = marca;
		this.dimensiones = dimensiones;
	}


	public coches() {
		// TODO Auto-generated constructor stub
	}


	//Getter y setter
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public HashMap<String, String> getMarca() {
		return marca;
	}
	public void setMarca(HashMap<String, String> marca) {
		this.marca = marca;
	}
	public double[] getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(double[] dimensiones) {
		this.dimensiones = dimensiones;
	}


	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public Object getSetDimensiones() {
		return setDimensiones;
	}


	public void setSetDimensiones(Object setDimensiones) {
		this.setDimensiones = setDimensiones;
	}



	@Override
	public String toString() {
		return "coches [codigoCliente=" + codigoCliente + ", matricula=" + matricula + ", num_puertas=" + num_puertas
				+ ", marca=" + marca + ", dimensiones=" + Arrays.toString(dimensiones) + "]";
	}



	public String requisitosMatricula(String matricula) throws ExcepcionString {


		if(!matricula.matches("^[0-9]{4}[A-Z]{3}")) throw new ExcepcionString("SUPER MATRICULA");
		return matricula;

	}
	
	

	public int requisitoPuertas(int puertas) throws ExcepcionNumericos {

		if(puertas < 3 || puertas > 5)throw new ExcepcionNumericos(puertas);

		return puertas; 
	}


	public String sonLetras(String letras) throws ExcepcionString{

		if(!letras.matches("[A-Za-z]+")) throw new ExcepcionString(1); //imprime la parte del metodo que yo quiero

		return letras;
	}







	public HashMap<String,String> añadirMap(String marca , String modelo)throws ExcepcionString {


		//primero aseguramos que son letras... por lanzar excepciones sino..
		sonLetras(marca);
		sonLetras(modelo);

		//si son letras...creamos Clave Valor y las añadimos
		HashMap<String,String> map = new HashMap<String, String>();
		map.put(marca, modelo);

		return map; 

	}



	public double [] añadirDimensiones(int altura, int ancho, int largo)throws ArrayIndexOutOfBoundsException{

		dimensiones[0]=altura;
		this.setAlto(altura);

		dimensiones[1]= ancho;
		this.setAncho(ancho);

		dimensiones[2]= largo; 
		this.setLargo(largo);

		if(this.dimensiones.length > 3)throw new ArrayIndexOutOfBoundsException("CONTRUCTOR ARRAY DE JAVA");


		return this.getDimensiones();
	}


	//int codigoCliente, String matricula, int num_puertas, HashMap<String, String> marca,
	//double[] dimensiones) {

	public void registrarCoche(Scanner terminal)  {


		int codigoCliente = 0;
		String matricula;
		int puertas = 0;
		String marca, modelo;
		int altura, ancho, largo;
		boolean valido = false; 



		while(!valido) {
			try {
				System.out.println("Introduce codigoCliente: ");
				codigoCliente = Integer.parseInt(terminal.nextLine());
				this.setCodigoCliente(codigoCliente);
				valido = true;

			}catch(NumberFormatException letras) {
				System.out.println("codigo debe de ser un número");
			}

		}

		valido = false;

		while(!valido) {

			try {

				System.out.println("Introduce  matricula: ");
				matricula = requisitosMatricula(terminal.nextLine()); 
				this.setMatricula(matricula);
				valido = true; 

			}catch(ExcepcionString matri) {
				matri.personalizadoMatricula();
			}

		}



		valido = false; //resetamos la variable


		while(!valido) {

			try {
				System.out.println("Introduce numero de puertas (min 3 max 5): ");
				puertas = Integer.parseInt(terminal.nextLine()); //control numberException
				puertas = requisitoPuertas(puertas); //excepcion propia


				//si todo esta bien damos este valor al objeto...y salimos de while
				this.setNum_puertas(puertas); 
				valido = true; 


			} catch (ExcepcionNumericos cantidad) {
				System.out.println(cantidad.personalizdoNumeros()+ " El numero de puertas debe comprender entre 3 y 5");

			} catch(NumberFormatException noNumero) {
				System.out.println("No se ha introducido un numero...vuelve a intentarlo");
			}

		}

		valido = false; 


		while(!valido) {

		try {
			
			System.out.println("Introduce la marca del vehiculo: ");
			marca = terminal.nextLine(); 

			System.out.println("Introduce el modelo del vehiculo: ");
			modelo = terminal.nextLine(); 


			// en el metodo añadir Map hacemos:
			
			//crear el map...por eso aqui no ves new Map porque lo estamos haciendo en el metodo.
			//llamar al metodo son letras que lanza la excepcion que controlamos con este try/catch
			this.setMarca(añadirMap(marca, modelo));
			valido = true; 
			
			} catch (ExcepcionString noLetras) {
					noLetras.personalizadoString();
			} 





		}

		valido = false;

		while(!valido) {

			try {

				System.out.println("Introduce altura del vehiculo: ");
				altura = Integer.parseInt(terminal.nextLine()); // lanza numberException

				System.out.println("Introduce ancho del vehiculo: ");
				ancho = Integer.parseInt(terminal.nextLine()); // lanza numberException

				System.out.println("Introduce ancho del vehiculo: ");
				largo = Integer.parseInt(terminal.nextLine()); // lanza numberException

				//Ya estamos seguro que todos son int...llamamos al metodo.
				this.setDimensiones(añadirDimensiones(altura, ancho, largo));
				valido = true;

			}catch(NumberFormatException noNumero) {
				System.out.println("se ha introducido una letra, cuando se esperaba un número");

			}catch(ArrayIndexOutOfBoundsException array) {
				System.out.println("Error: array fuera de rango..");
			}



		}

		System.out.println("Registrando vehiculo " + this.getMatricula());




	}//cierre metodo





}

























