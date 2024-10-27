package Especies;

public abstract class Especie {

	public String modoAlimentacion;
	
	/***
	 * Todo ser vivo tiene un modo de alimentación.
	 * Simplificamos que los seres vivos son autótrofos (Fabrican sus propios alientos. Extracción
	 * de sales minerales de la tierra y mediante fotosíntesis y respiración se alimentan) y
	 * heterótrofos (Extraen sus energía a partir de otros seres vivos).
	 * Como comprendereis, esta división no es real, los hongos son vegetales y heterótrofos
	 * @param modoAlimentacion
	 */
	public Especie(String modoAlimentacion) {
		this.modoAlimentacion = modoAlimentacion;
	}
	
	/**
	 * Esto es un ejemplo del uso avanzado de un enumerado.
	 * Un enumerado es un tipo especial de clase.
	 * 
	 * Como podeis observar tienen constructor, en este caso es privado ya que un enumerado no admite 
	 * que le añadamos nuevos elementos en fase de ejecución ni compilación, los elementos sólo los podemos
	 * definir en la fase de codificación.
	 * Como podeis observar tiene un constructor con el mismo nombre que el enumerado, igual que las clases,
	 * pero su inicialización es usando el alias del elemento enumerado que queremos almacenar, con los parámetros
	 * que tiene el constructor.
	 */
	public enum EnumBasesADN {
		Guanina('G'), Timina('T'), Adenina('A'), Citosina('C');
		
		private char value;
		
		private EnumBasesADN(char inicial) {
			value = inicial;
		}
		
		public char Value() {
			return value;
		}
	}
	
	
	/**
	 * Este es un ejemplo simplificado del uso de un enumerado
	 */
	public enum EnumGenero {
		macho, hembra, hermafrodita
	}

	protected EnumGenero genero;
}
