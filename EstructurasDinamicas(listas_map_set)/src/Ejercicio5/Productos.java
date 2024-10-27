package Ejercicio5;


import java.util.LinkedList;
import java.util.Scanner;

public class Productos {

    private String nombre;
    private int cantidad;
    private double precio;

    // Constructores
    public Productos(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Productos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Productos() {
    }

    public void comprobarInventario(LinkedList<Productos> inventario, LinkedList<Productos> cesta) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("¿Quieres comprar productos? (si/no): ");
        String respuesta = terminal.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            while (true) {
                System.out.println("Introduce el nombre del producto ('FIN' para terminar): ");
                String nombre = terminal.nextLine();

                if (nombre.equalsIgnoreCase("FIN")) {
                    break;
                }

                System.out.println("Introduce la cantidad: ");
                int cantidad = terminal.nextInt();
                terminal.nextLine(); // Consumir la nueva línea

                boolean productoEncontrado = false;

                for (Productos producto : inventario) {
                    if (producto.getNombre().equalsIgnoreCase(nombre) && producto.getCantidad() >= cantidad) {
                        productoEncontrado = true;

                        double precioProducto = producto.getPrecio() * cantidad;
                        producto.setCantidad(producto.getCantidad() - cantidad);

                        cesta.add(new Productos(nombre, cantidad, precioProducto));
                        System.out.println("Producto añadido a la cesta.");
                        break;
                    }
                }

                if (!productoEncontrado) {
                    System.out.println("El producto no está disponible en el inventario o no hay suficiente cantidad.");
                }
            }
        } else {
            System.out.println("FIN");
        }

        terminal.close();
    }

    public void mostrarTicket(LinkedList<Productos> cesta) {
        double total = 0;
        System.out.println("Producto   Cantidad   Precio/Unitario   Total");
        for (Productos cp : cesta) {
            total += cp.getPrecio();
            System.out.printf("%-10s %-10d %-17.2f %-10.2f\n", cp.getNombre(), cp.getCantidad(), cp.getPrecio() / cp.getCantidad(), cp.getPrecio());
        }
        System.out.println("Total a pagar: " + total);
    }

    // Getters y Setters
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

    public static void main(String[] args) {
        LinkedList<Productos> inventario = new LinkedList<>();

        // Creación de los productos
        inventario.add(new Productos("leche", 10, 10));
        inventario.add(new Productos("azucar", 5, 24.99));
        inventario.add(new Productos("miel", 20, 9.99));
        inventario.add(new Productos("Productos 4", 8, 18.50));
        inventario.add(new Productos("Productos 5", 15, 12.75));
        inventario.add(new Productos("Productos 6", 3, 35.00));
        inventario.add(new Productos("Productos 7", 12, 7.49));
        inventario.add(new Productos("Productos 8", 6, 28.99));

        LinkedList<Productos> cesta = new LinkedList<>();
        Productos productos = new Productos();
        productos.comprobarInventario(inventario, cesta);
        productos.mostrarTicket(cesta);
    }
}
