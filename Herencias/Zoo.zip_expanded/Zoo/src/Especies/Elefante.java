package Especies;

public class Elefante extends Animal {

	public Elefante(String nombre) {
		this.nombre = nombre;
	}
	
	public Elefante(String nombre, EnumBasesADN[] adn) {
		super(adn);
		this.nombre = nombre;
	}

	public void Alimentar(EnumAlimento alimento) {

		if (alimento != EnumAlimento.vegetal) {
			System.out.println("Estás alimentando mal al elefante: " + nombre);
		} else {
			hambriento = false;
		}
	}

	public Elefante Criar(Elefante elefante) {

		EnumBasesADN[] nuevoElefanteADN = new EnumBasesADN[128];

		// Generación número aleatorios. Inicializamos el geenrador de números
		// aleatorios
		java.util.Random aleatorio = new java.util.Random(System.currentTimeMillis());

		// Lo rellenamos
		for (int i = 0; i < nuevoElefanteADN.length; i++) {

			// Número aleatorio entero entre [0 - 1], el 2 no está incluído
			int intAletorio = aleatorio.nextInt(2);

			switch (intAletorio) {
			case 0:
				nuevoElefanteADN[i] = this.ADN_Nuclear[i];
				break;
			case 1:
				nuevoElefanteADN[i] = elefante.ADN_Nuclear[i];
				break;
			case 2:
			}
		}
		
		Elefante newElefante = new Elefante(this.nombre + "_" + elefante.nombre, nuevoElefanteADN);

		return newElefante;
	}
}
