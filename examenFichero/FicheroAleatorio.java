package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroAleatorio {
	
	//Método que pasado un fichero, lo escribe de forma aleatorua
	public static void escribirFicheroAleatorio(File fichero) throws FileNotFoundException, IOException{
		RandomAccessFile raf = null;
		String apellido[] = {"FERNÁNDEZ", "GIL", "LÓPEZ"};
		int dept[] = {10, 20, 30};
		double salario[] = {1000.45, 2400.60, 1500.50};
		StringBuilder buffer = null;
		
		if(!fichero.exists())
			fichero.createNewFile();
		
		raf = new RandomAccessFile(fichero, "fw");
		for(int i = 0;i<apellido.length;i++) {
			raf.writeInt(i+1);
			buffer.setLength(10);
			raf.writeChars(buffer.toString());
			raf.writeInt(dept[i]);
			raf.writeDouble(salario[i]);
		}
	}
	//Método que pasado un fichero lo lee de forma aleatoria
	public static void leerFicheroAleatorio(File fichero) throws FileNotFoundException, IOException{
		RandomAccessFile raf = null;
		int id;
		int dept;
		double salario;
		String apellidoS;
		char[] apellido = new char[10];
		char aux;
		int posicion = 0;
		
		raf = new RandomAccessFile(fichero, "r");
		
		for(;;) {
			raf.seek(posicion);
			id = raf.readInt();
			
			for(int i = 0;i<apellido.length; i++) {
				aux = raf.readChar();
				apellido[i] = aux;
			}
			apellidoS = new String(apellido);
			dept = raf.readInt();
			salario = raf.readDouble();
			System.out.println("ID: " +id + ", Apellido: " + apellidoS +", Departamento " +dept+", Salario: " +salario);
			posicion = posicion + 36;
			if(raf.getFilePointer()==raf.length())
			break;
		}
		raf.close();
	}
	public static void main(String[] args) {
		File f = null;
		try {
			f = new File("Ficheros1/fichRandom.bin");
			FicheroAleatorio.escribirFicheroAleatorio(f);
			FicheroAleatorio.leerFicheroAleatorio(f);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
