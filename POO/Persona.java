
public class Persona {
 public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getEdad() {
		return edad;
	}





	public void setEdad(int edad) {
		this.edad = edad;
	}





	public String getDni() {
		return dni;
	}





	public void setDni(String dni) {
		this.dni = dni;
	}





	public String getSexo() {
		return sexo;
	}





	public void setSexo(String sexo) {
		this.sexo = sexo;
	}





	public double getPeso() {
		return peso;
	}





	public void setPeso(double peso) {
		this.peso = peso;
	}





	public double getAltura() {
		return altura;
	}





	public void setAltura(double altura) {
		this.altura = altura;
	}





String nombre;
 int edad;
 String dni;
 String sexo;
 double peso;
 double altura;
 
 
 
 
 
	public static void main(String[] args) {
	Persona alumno1 = new Persona();
	Persona alumno2 = new Persona();
	
	alumno1.edad = 19;
	alumno1.nombre = "Jaime";
	alumno1.dni = "5759599-L";
	alumno1.sexo = "Hombre";
	alumno1.peso = 75.6;
	alumno1.altura = 1.71;
	
	alumno2.edad = 29;
	alumno2.nombre = "Juan";
	alumno2.dni = "57594499-L";
	alumno2.sexo = "Hombre";
	alumno2.peso = 85.6;
	alumno2.altura = 1.81;
		
	System.out.println("nombre"+alumno1.nombre);	
	System.out.println("nombre"+alumno2.nombre);	
	System.out.println("edad"+alumno1.edad);	
	System.out.println("edad"+alumno2.edad);	
	System.out.println("dni"+alumno1.dni);	
	System.out.println("dni"+alumno2.dni);	
	System.out.println("altura"+alumno1.altura);	
	System.out.println("altuta"+alumno2.altura);	
	
		
	}

}
