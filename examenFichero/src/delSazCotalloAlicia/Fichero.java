package delSazCotalloAlicia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero {
	final static int LONGITUD_APELLIDO = 10;
	/**
	 * Longitud del registro de cada empleado (id - 4bytes, apellido - 10x2bytes,
	 * departamento - 4bytes, salario - 8bytes)
	 */
	final static int LONGITUD_REGISTRO = 36;

	/**
	 * 
	 * Este metodo escribe unos datos fijos en la ruta indicada en el fichero (File)
	 * que se recibe
	 * 
	 * @param fichero Fichero creado en la ruta completa donde se va a escribir
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void cargarFicheroAleatorio(Empleado... e) throws FileNotFoundException, IOException {
		File fichero = new File("ficheros", "fich.dat");
		// Si el fichero no existe lo creamos
		if (!fichero.exists())
			fichero.createNewFile();

		// Abrimos fichero para acceso aleatorio (lectura/escritura)
		RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

		long posicion = 0;

		for (Empleado aux : e) {
			posicion = raf.length();
			raf.seek(posicion);

			raf.writeInt(aux.getId());

			// Escribo el apellido limitado a 10 caracteres
			StringBuilder buffer = new StringBuilder(aux.getApellidos());
			buffer.setLength(LONGITUD_APELLIDO);
			// Aqui reemplazo todos los caracteres \0 (fin de String) por espacios para
			// evitar
			// problemas al leer
			String a = buffer.toString();
			a = a.replace('\0', ' ');
			raf.writeChars(a);

			// Escribo numero de departamento y salario
			raf.writeInt(aux.getDept());
			raf.writeDouble(aux.getSalario());
			
		}

		raf.close();
	}
}
