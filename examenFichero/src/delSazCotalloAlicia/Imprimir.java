package delSazCotalloAlicia;

import java.io.*;

public class Imprimir {

	public static void imprimirFichero() throws FileNotFoundException, IOException {

		File fichero = new File("ficheros", "fich.dat");
		//cuando usamos try con (with-resouce) no es necesario incluir close, ni finally ya que java
		//cierra todos los objetos internamente.(por eso no esta implementado), aunque en este caso se cierra
		//en el test.

		File ficheroCopia = new File("ficheros","fichero.txt");

		if(!ficheroCopia.exists())System.out.println("fichero copia creado: "+ficheroCopia.createNewFile());

		try(RandomAccessFile random = new RandomAccessFile(fichero, "r")
				; BufferedWriter bufferW = new BufferedWriter(new FileWriter(ficheroCopia))){
			
			//random va a leer un fichero binario y bufferW va a escribir el codigo en texto. 
			
			//recorremos los 7 registros con un for
			for(int i = 0; i < 7; i++) {
				
				bufferW.write("ID: "+random.readInt()+" ,"); 

				//imprimir Strings, es mas complejo en binarios ya que todos deben tener el mismo
				//tamaño de registro, por eso recorreremos el String caracter a caracter hasta 10 como max
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 10; j++) {
					sb.append(random.readChar());
				}
				
				//usamos to strig para cambiar los char a Strin, y con trim ajustamos los espacios sobrantes
				bufferW.write("apellido:" +sb.toString().trim() +" ,"); 

				bufferW.write("departamento: "+random.readInt()+" ,"); 
				
				bufferW.write("salario: "+random.readDouble());

				bufferW.newLine(); //imprime una linea por empleado.

			}
		}
	}	




	public static void imprimirEmpleado(int identificador) throws FileNotFoundException, IOException {

		File fichero = new File("ficheros", "fich.dat");
		//cuando usamos try con (with-resouce) no es necesario incluir close, ni finally ya que java
		//cierra todos los objetos internamente.(por eso no esta implementado)

		File ficheroCopia = new File("ficheros","empleado.txt");

		if(!ficheroCopia.exists())System.out.println("fichero copia creado: "+ficheroCopia.createNewFile());
		
		try(RandomAccessFile random = new RandomAccessFile(fichero, "r")
				; BufferedWriter bufferW = new BufferedWriter(new FileWriter(ficheroCopia))){
			
			int registro = 36;
			
			//como por parametro no se introduce una posicion de fichero diractamente
			//sino su id, ajustamos cada empleado, a la posicion binaria que ocupa cada registro. 
			//no utilizo estructura(if-else if -else) por que he leido en varios fuentes que los if aislados
			//son mas eficientes.
			if (identificador == 1)random.seek(0);
			if (identificador == 2)random.seek(registro);
			if (identificador == 3)random.seek(registro*2);
			if (identificador == 4)random.seek(registro*3);
			if (identificador == 5)random.seek(registro*4);
			if (identificador == 6)random.seek(registro*5);
			if (identificador == 7)random.seek(registro*6);
			
				//imprimimos la posicion  que captado el if:
				bufferW.write("ID: "+random.readInt()+" ,"); 

				//imprimir Strings
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 10; j++) {
					sb.append(random.readChar());
				}

				bufferW.write("apellido:" +sb.toString().trim() +" ,");

				bufferW.write("departamento: "+random.readInt()+" ,");
				bufferW.write("salario: "+random.readDouble());

				bufferW.newLine();

			
		}


	}
}
