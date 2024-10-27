package delSazCotalloAlicia;

public class Articulo {


	private String nombre; 
	private int cantidad; 
	private double precio;

	//constructor
	public Articulo(String nombre, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;


	}

	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	} 

	//IMPLEMENTAR

	public void vende(int num)throws NoDisponible {
		
		int stock = 0;
		

		//si no salta la excepcion es que existe entonce..comprobamos unidades..
		stock = this.getCantidad() - num;
		if(stock < 0)throw new NoDisponible("Intentas vender mas cantidades de las que dispones", -1);
		if(stock == 0)throw new NoDisponible("El stock de unidades se ha agotado", 0);

	}
}
