

public class EjArrayCopia {

	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,5,6,7,8,9,0};
		int[] array2 = new int[10];

		//pasamos los datos del 1 al 2
		for(int i = 0; i< array1.length; i++) {
			//array2[i] = array1[i];
		}
		//recorremos el array2 para comprobar los datos
		
		//Se lo pasamos en metodo arraycopia
		System.arraycopy(array1, 0, array2, 0, 10);
		for(int i = 0; i< array2.length; i++) {
			System.out.print(array2[i]+"\t");

		}
	
	}

}



/*
do{
			System.out.println("Dime un numero entre 1 y 100 incluidos");

			numeroPedido = sc.nextInt();
			for(int i = 0; i<=1 ; i++) {
				if(numeroPedido <101 && numeroPedido>0) {
					if(numeroPedido != numeros[i]) {
						System.out.println("hola");
					}else {
						System.out.println("no");

					}
				}
			}
		}while (numeroPedido < 101 && numeroPedido > 0);
*/