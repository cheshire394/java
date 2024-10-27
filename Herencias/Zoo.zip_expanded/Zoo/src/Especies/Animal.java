package Especies;
import java.util.Map;

public abstract class Animal extends Especie {
	
	protected EnumBasesADN[] ADN_Nuclear;

	protected String nombre;

	protected Map.Entry<Integer, Integer> Area;

	public enum EnumAlimento {
		vegetal, carnivora, omnivora
	}

	protected boolean hambriento = true;

	/**
	 * Constructor de animal.
	 * Todo animal tiene un material genético. Si no lo definimos, lo generamos aleatoriamente.
	 */
	public Animal() {
		super("Heterótrofo");
		
		// Generación número aleatorios. Inicializamos el geenrador de números aleatorios
		java.util.Random aleatorio = new java.util.Random(System.currentTimeMillis());
				
		// Supongamos que el ADN transcrito con 128 elementos
		ADN_Nuclear = new EnumBasesADN[128];
		
		// Lo rellenamos
		for(int i = 0; i < ADN_Nuclear.length; i++) {
			
			// Número aleatorio entero entre [0 - 3], el 4 no está incluído
			int intAletorio = aleatorio.nextInt(4);
			
			switch (intAletorio) {
				case 0: ADN_Nuclear[i] = EnumBasesADN.Guanina; break;
				case 1: ADN_Nuclear[i] = EnumBasesADN.Timina; break;
				case 2: ADN_Nuclear[i] = EnumBasesADN.Adenina; break;
				case 3: ADN_Nuclear[i] = EnumBasesADN.Citosina; break;
			}
		}
	}
	
	public Animal(EnumBasesADN[] adn) {
		super("Heterótrofo");
		ADN_Nuclear = adn;
	}

	public abstract void Alimentar(EnumAlimento alimento);
	
	public boolean GetHambriento() {
		return hambriento;
	}

	public void IsHambriento() {
		System.out.println("El " + this.getClass().getName() + " llamado " + nombre + (GetHambriento() ? "" : " no") + " está hambriento");
	}
	
	public boolean Equal(Object obj) {

		boolean equals = true;

		if (obj.getClass() == this.getClass()) {
			Animal objAnimal = (Animal) obj;

			if (objAnimal.nombre != nombre) {
				equals = false;
			}
		} else {
			equals = false;
		}

		return equals;
	}
	
	public String GetGenoma() {
		
		String genoma = "";
		
		for(EnumBasesADN base : ADN_Nuclear) {
			genoma += base.Value();
		}

		return genoma;
	}
}
