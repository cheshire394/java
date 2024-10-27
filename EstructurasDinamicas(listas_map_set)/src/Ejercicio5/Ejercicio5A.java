package Ejercicio5;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ejercicio5A {

    // Atributos
    private int dato1;
    private String dato2;

    // Constructor
    public Ejercicio5A(int dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    // Getter y setter
    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    // Métodos para manipular la lista
    public void putInicio(LinkedList<Object> lista) {
        lista.addFirst(this);
    }

    public void putFinal(LinkedList<Object> lista) {
        lista.addLast(this);
    }

    // Mostrar lista
    public static void mostrarLista(LinkedList<Object> lista) {
        Iterator<Object> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Métodos para eliminar elementos
    public static Ejercicio5A popPrincipio(LinkedList<Object> lista) {
        return (Ejercicio5A) lista.removeFirst();
    }

    public static Ejercicio5A popFinal(LinkedList<Object> lista) {
        return (Ejercicio5A) lista.removeLast();
    }

    public static Ejercicio5A getAt(LinkedList<Object> lista, int posicion) {
        if (posicion >= lista.size()) {
            System.out.println("Posición fuera de rango");
            return null;
        }
        return (Ejercicio5A) lista.remove(posicion);
    }

    // Contar elementos
    public static int count(LinkedList<Object> lista) {
        return lista.size();
    }

    // Mostrar lista en orden descendente
    public static void mostrarReverse(LinkedList<Object> lista) {
        ListIterator<Object> iterator = lista.listIterator(lista.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Ejercicio5A [dato1=" + dato1 + ", dato2=" + dato2 + "]";
    }

    // Método main
    public static void main(String[] args) {
        Ejercicio5A objeto1 = new Ejercicio5A(1, "A");
        Ejercicio5A objeto2 = new Ejercicio5A(2, "B");
        Ejercicio5A objeto3 = new Ejercicio5A(3, "C");
        Ejercicio5A objeto4 = new Ejercicio5A(4, "D");
        Ejercicio5A objeto5 = new Ejercicio5A(5, "E");
        Ejercicio5A objeto6 = new Ejercicio5A(6, "F");

        LinkedList<Object> lista = new LinkedList<>();

        objeto6.putInicio(lista);
        objeto1.putInicio(lista);
        objeto2.putFinal(lista);
        objeto3.putFinal(lista);
        objeto4.putFinal(lista);
        objeto5.putFinal(lista);

        mostrarLista(lista);

        System.out.println("Número de elementos: " + count(lista));

        mostrarReverse(lista);

        getAt(lista, 1);
        popPrincipio(lista);
        popFinal(lista);

        mostrarLista(lista);
    }
}
