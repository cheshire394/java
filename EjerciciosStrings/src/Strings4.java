
public class Strings4 {

	public static void main(String[] args) {
	/*Elimina los espacios del texto: “James Gosling Created Java”. Utiliza los métodos
	replace y replaceAll de la clase String.
	*/
		
	
	
		        String frase = "Este es un ejemplo de una cadena con espacios";
		        
		        //Es fácil, es crear una variable y darle como valor nombrefrase.replace/replaceAll(" ", "");
		        
		        // Eliminar espacios usando el método replace
		        
		        String sinEspaciosReplace = frase.replace(" ", "");
		        System.out.println("Usando replace: " + sinEspaciosReplace);
		        
		        // Eliminar espacios usando el método replaceAll
		        String sinEspaciosReplaceAll = frase.replaceAll(" ", "");
		        System.out.println("Usando replaceAll: " + sinEspaciosReplaceAll);
		    }
		}
