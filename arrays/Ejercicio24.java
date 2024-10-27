import java.util.*;
public class Ejercicio24 {

	/*
	 * Realiza un programa que detecte posibles errores en la construcción de una password. 
	 * Las reglas que determinan su construcción sintáctica son: 
	        a. No debe tener más de 15 ni menos de 5 caracteres 
	        b. El juego de caracteres utilizables es: 
	            i. Letras (Mayúsculas y minúsculas) 
	            ii. Dígitos (0,9) 
	            iii. Guión (-) 
	        c. El guión no puede estar ni al principio ni al final, pero puede haber varios consecutivos. 
	        d. Debe contener al menos un carácter alfabético 
	   Estructura el programa haciendo uso de la modularidad para que los métodos puedan ser reutilizados 
	   en cualquier otra situación.
	 */


	    public static boolean lenghtString(String st){
	        if(st.length()>4 && st.length()<16) return true;
	        else return false;
	    }

	    public static boolean character(String st) {
	        boolean res = false;
	        for (int i=0; i<st.length();i++) {
	            if(Character.isLetter(st.charAt(i)) ||
	               Character.isDigit(st.charAt(i)) ||
	               st.charAt(i)=='-') 
	               res = true;
	            else {
	                res = false;
	                break;
	            }       
	        }
	        return res;
	    }

	    public static boolean startsHyphen(String st) {
	        boolean res = false;
	        if(st.startsWith("-")) res = true;
	        return res;
	    }

	    public static boolean endsHyphen(String st) {
	        boolean res = false;
	        if(st.endsWith("-")) res = true;
	        return res;
	    }

	    public static boolean alphabet(String st) {
	        int count = 0;
	        for (int i=0; i<st.length();i++) {
	            if(Character.isLetter(st.charAt(i))) 
	               count++;       
	        }
	        if(count>0) return true;
	        else return false;
	    }
	    public static void main(String[] args) {
	        String password = "12h6546543";
	        if(lenghtString(password) && 
	           character(password) && 
	           !startsHyphen(password) && 
	           !endsHyphen(password) &&
	           alphabet(password))
	            System.out.println("password valid!");
	        else System.out.println("password no valid!");    
	    }
	}
	
	
	


	

