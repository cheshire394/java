package ejercicio7;

import ejercicio6.*;

public class Principal {
	public static void main(String[] args) {
		
		
		Universidad uni = new Universidad(8);
		// Inicializo objetos
		Profesor profe0 = new Profesor("Iago","11111111A","Desconocido",2015,1,Departamento.informatica);
		Profesor profe1 = new Profesor("Ana","22222222B","Desconocido",2010,3,Departamento.informatica);
		Estudiante estu2 = new Estudiante("Pedro","44444444C","Desconocido",1);
		Estudiante estu3 = new Estudiante("Juan","55555555C","Desconocido",1);
		PersonalServicio pers4 = new PersonalServicio("Esteban", "77777777D", "Casado", 1990, 1, Seccion.biblioteca);
		PersonalServicio pers5 = new PersonalServicio("Horacio", "99999999D", "Casado", 1995, 2, Seccion.decanato);
		Profesor profe6 = new Profesor("Eustaquia","33333333A","Soltera",2000,2,Departamento.arquitectura);
		Estudiante estu7 = new Estudiante("Juana","66666666C","Desconocido",2);
		
		// Añado personas
		uni.addPersona(profe0);
		uni.addPersona(profe1);
		uni.addPersona(estu2);
		uni.addPersona(estu3);
		uni.addPersona(pers4);
		uni.addPersona(pers5);
		uni.addPersona(profe6);
		uni.addPersona(estu7);

		if (pers5.getNombre().equals("Esteban") || pers4.getNombre().equals("Esteban")) {
			System.out.println();
		}
		
		// Muestro todos los empleados
		System.out.println("Empleados de la universidad:");
		uni.listarEmpleados();

		// Muestro todos los profes de informática
		System.out.println("\n\nProfesores de informática:");
		uni.listarProfesoresDepartamento(Departamento.informatica);
	
		// Pruebo el resto de métodos
		uni.cambiarCurso("44444444C", 2);
		uni.cambiarDepartamento("33333333A", Departamento.lenguajes);
		uni.cambiarSeccion("Esteban", Seccion.secretaria);
	
		System.out.println("\n\nUniversidad:");
		uni.listarTodos();
	}
}
