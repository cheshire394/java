
public class Strings2 {

	
	    public static void main(String[] args) {
	        String texto = "Hola, mundo!"; // Cambia esta cadena por la que desees imprimir verticalmente
	      
	        
	        imprimirVerticalmente(texto);
	        //no olvidemos declarar la funcion en main
	        
	       
	    }

	    //creamos una funcion (type + nombrevariable)
	    public static void imprimirVerticalmente(String texto) {
	    	//creamos un ciclo for que inicie en 0 y vaya iterando la variable texto caracter por caracter:
	        for (int i = 0; i < texto.length(); i++) {
	        	//imprimimos con charAt(i) char at optiene el caracter en la posición adecuada.
	            System.out.println(texto.charAt(i));
	        }
	    }
	    
	  
	    	
	    }

	 
	    
	    
	    
	    
	    
	