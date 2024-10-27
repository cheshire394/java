
public class Strings8 {

	public static void main(String[] args) {
	/*Compara si el String “Java” es igual que el String “JavaScript”. Usa el método equals
	de la clase String.*/
		String java = "Java", js = "JavaScript";
		
		//tanto contains como equals devuelven valores bool,
		//contains está destinado a comprobar si contiene un String un caracter concreto.
		//equals compara dos valores de variable, deben ser iguales para que retorne true
		// con equalsIgnoreCase(); no tendrá en cuanta si el valor es mayuscula o minuscula.
		
		System.out.println(	java.equals(js));
		System.out.println(java.equalsIgnoreCase(js));
		System.out.println(java.contains("j"));
		System.out.println(java.contains("J"));
		
	}

}
