
//Ejemplo del uso de la clase equals

import java.util.*;

public class EjemploEquals {
	
	//atributos clase no necesitan crear un objeto para usarlo
	// los atributos de instancia necesitan objetos para usarlos
	//estos son de instancia
	private String nombre;
	


	//METODO SIN PARAMETROS POR DEFECTO:
	
	public EjemploEquals() {
		
	}
	

	//METODO CON PARAMETROS PARA PARAMETROS:
	public EjemploEquals(String nombre) {
		
		this.nombre = nombre;
	}
	//constructor con parametros pero con objeto en vez atributo como parametro.
	public EjemploEquals(EjemploEquals obj) {
		
		this.nombre = obj.nombre;
	}
	
	//GETTER Y SETTER:
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//to string
	//los atributos solo permite utilizarlos dentro de getter de setter, por eso
	//hay que modificas nombre por this.getNombre()
	@Override
	public String toString() {
		return "EjemploEquals [nombre=" + this.getNombre() + "]";
	}
	
	
	
	//METODOS Equals: //recuerda borra el hascode()

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //this aqui se refiere al obj1 (al copiado) y obj es la copia.
			return true;
		if (obj == null)
			return false;
		//COMPARA SI PERTENECEN A CLASE DIFERENTES
		if (this.getClass() != obj.getClass())//el this LO HEMOS AÑADIDO, para referenciar al obj1 (el copiado)
			return false;
		//aqui comparamos los atributos de obj1 con obj2 
		//recuerda cambiar el atributo (nombre) por this.getNombre() en la parte izq.
		EjemploEquals other = (EjemploEquals) obj;
		return Objects.equals(this.getNombre(), other.getNombre());
	}
	
	//MAIN
	public static void main(String[] args) {
		//CASO1
		//probamos el bloque 1 de equals (el primer if)
		//EjemploEquals obj1 = new EjemploEquals("obj1");
		//EjemploEquals obj2 = obj1; //estamos creando dos objetos con la misma memoria
		
		//CASO2:
		//EjemploEquals obj1 = new EjemploEquals("obj1");
		//EjemploEquals obj2 = null;// ejecuta el segundo if
		
		//CASO3
		//Block llama a otra clase que teniamos realizada por ahi es al azar por 
		//comparar dos clases. 
		EjemploEquals obj1 = new EjemploEquals("obj1");
		Coche obj2 = new Coche(); //ejecuta el tercer if de equals 
		
		//CASO4
		//el cuarto if de equals compara los atributos 
		//EjemploEquals obj1 = new EjemploEquals("obj1");
		//EjemploEquals obj2 = new EjemploEquals("obj1");
		
		
		System.out.println("¿Los objetos son iguales? "+obj1.equals(obj2));
		

	}

}
