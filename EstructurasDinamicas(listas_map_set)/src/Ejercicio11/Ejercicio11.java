package Ejercicio11;

import java.util.TreeSet;

/*
 * Ejercicio 11
 * Crea la clase Vehículo formada por los atributos: matrícula, marca,
 * modelo, km, caballos. Crea 4 vehículos y añádelos a una colección
 * ordenada (TreeSet), ordenados por la matrícula.
 * Supongamos que ahora queremos ordenar los vehículos por los km.
 * Modifica lo que corresponda para mostrar los vehículos ordenados por
 * este atributo.
 * Ampliación: intenta ordenar por km y, en caso de empate, por los caballos.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        TreeSet<Vehiculo> coches = new TreeSet<Vehiculo>();
        Vehiculo v1 = new Vehiculo("8372BLS", "Lamborghini", "A1", 10000, 450);
        Vehiculo v2 = new Vehiculo("2795PKL", "Maserati", "A1", 10000, 400);
        Vehiculo v3 = new Vehiculo("2845JSA", "Ferrari", "A1", 50000, 550);
        Vehiculo v4 = new Vehiculo("8942ASD", "McLaren", "A1", 10000, 600);
        coches.add(v1);
        coches.add(v2);
        coches.add(v3);
        coches.add(v4);
        System.out.println(coches);
    }

}