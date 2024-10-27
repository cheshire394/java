package ejercicio11;

public class MiTele implements Televisor {
	private int numCanales;
	private int canalActual;
	private boolean	encendida;
	
	public MiTele(int numCanales, int canalActual, boolean encendida) {
		this.numCanales = numCanales;
		this.canalActual = canalActual;
		this.encendida = encendida;
	}
	
	public void encender ( ) {
		this.encendida = true;
	}
	public void apagar ( ) {
		this.encendida = false;
	}
	public void cambiarCanal (int canal) {
		if (canal<numCanales)
			this.canalActual = canal;
	}
}
