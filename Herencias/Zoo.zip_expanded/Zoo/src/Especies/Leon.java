package Especies;

public class Leon extends Animal {

	public Leon(String nombre) {
		this.nombre = nombre;		
	}
	
	public void Alimentar(EnumAlimento alimento) {
		
		if(alimento != EnumAlimento.carnivora) {
			System.out.println("Estás alimentando mal al leon: " + nombre);
		}
		else
		{
			hambriento = false;
		}
	}
	
	public boolean Equal(Object obj) {
		
		boolean equals = true;
		
		if(obj.getClass() == Leon.class) {
			Leon objLeon = (Leon)obj;
			
			
			if(objLeon.nombre != this.nombre) {
				equals = false;
			}
		}
		else
		{
			equals = false;
		}
		
		return equals;
	}
}
