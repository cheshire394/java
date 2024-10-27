
public class Almacen {
/* En un almacén se guarda fruta para su posterior
 venta. Por cada
cargamento se tiene la siguiente información:
 nombre de la fruta,
procedencia, número de kilos, precio coste por kilo y precio venta por
kilo. Codificar una clase para manejar esta información de forma que
contenga las siguientes operaciones:
●●●●Constructor
Método que devuelva la información de cada cargamento de fruta.
Método “rebajar” que rebaja el precio de venta en una cantidad
pasada como parámetro, (el precio de venta nunca puede ser
menor que el precio de coste).
Método “vender”: se le pasa el número de kilos a vender y si hay
suficiente cantidad, se decrementa el número de kilos y se
devuelve el importe de la venta, sino da error.
●●Método que nos diga si dos cargamentos de fruta tienen la misma
procedencia.
Llevar en todo momento el beneficio obtenido por el almacén.
Para probar dicha clase hacer un main que:
● Dé de alta 3 cargamentos y muestre su información.
● Diga si los dos primeros tienen la misma procedencia.
● Rebaje el precio del tercero.
● Realice ventas de los tres cargamentos.
● Muestre el beneficio obtenido por el almacén.
*/
	private String nombre;
	private String procedencia;
	private int kilos;
	private int precioCoste;
	private int precioVenta;

	//creamos constructor sin parametro:
	public Almacen() {
		
	}
	//creamos constructor con parametro:
	public Almacen(String nombre, String procedencia, int kilos, int precioCoste, int precioVenta) {
		
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.kilos = kilos;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}
	
	
	//creamos getter y setter:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public int getKilos() {
		return kilos;
	}
	public void setKilos(int kilos) {
		this.kilos = kilos;
	}
	public int getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(int precioCoste) {
		this.precioCoste = precioCoste;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	//metodos que operan:
	public void rebaja (int p_rebaja) {
		int precioRebajado = ((precioVenta * p_rebaja)/100);
		int preciofinal = precioVenta - precioRebajado;
		//si el precio final es menor que el precio de coste, no se puede vender asi:
		if (preciofinal < precioCoste) {
			System.out.println("El precio no se puede rebajar tanto:modifica la rebaja ");
			
		}else {
			System.out.println("El precio final es " + preciofinal);
		}
		
		/*Método “vender”: se le pasa el número de kilos a vender y si hay
		suficiente cantidad, se decrementa el número de kilos y se
		devuelve el importe de la venta, sino da error.*/
		
				
			}
		}
	}
	
	
}
