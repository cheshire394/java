import Especies.Animal;
import Especies.Elefante;
import Especies.Leon;

public class Zoo {

	private Animal[] animales = new Animal[0];

	public int GetNumberAnimales() {
		return animales.length;
	}
	
	public int GetNumberAnimales(Class<?> type) {
		int numero = 0;

		for (Animal animalEnZoo : animales) {
			if (animalEnZoo.getClass() == type) {
				numero++;
			}
		}

		return numero;
	}
	
	public int GetAnimalesHambrientos() {
		int numero = 0;

		for (Animal animalEnZoo : animales) {
			if (animalEnZoo.GetHambriento()) {
				numero++;
			}
		}

		return numero;
	}
	
	public void ConocerEstadoHambre() {	
		for (Animal animalEnZoo : animales) {
			animalEnZoo.IsHambriento();
		}
	}

	public int GetAnimalesHambrientos(Class<?> type) {
		int numero = 0;

		for (Animal animalEnZoo : animales) {
			if (animalEnZoo.getClass() == type) {
				if(animalEnZoo.GetHambriento()) {
					numero++;
				}
			}
		}

		return numero;
	}
	
	
	public void Add(Animal animal) {

		boolean existe = false;

		for (Animal animalEnZoo : animales) {
			if (animal.equals(animalEnZoo)) {
				existe = true;
			}
		}

		if (!existe) {
			Animal[] animalesBis = new Animal[animales.length + 1];
			System.arraycopy(animales, 0, animalesBis, 0, animales.length);
			animalesBis[animalesBis.length - 1] = animal;

			animales = animalesBis;
		} else {
			System.out.println("El animal ya estaba contabilizado en el zoo");
		}
	}

	public static void main(String[] args) {

		Zoo zoo = new Zoo();

		Elefante elefante1 = new Elefante("Dumbo");
		Elefante elefante2 = new Elefante("Dumbo2");
		Elefante elefante3 = new Elefante("Dumbo3");
		Elefante elefante4 = new Elefante("Dumbo4");

		Leon leon1 = new Leon("Simba");
		Leon leon2 = new Leon("Simba2");
		Leon leon3 = new Leon("Simba3");
		Leon leon4 = new Leon("Simba4");

		zoo.Add(elefante1);
		zoo.Add(leon1);
		zoo.Add(elefante2);
		zoo.Add(leon2);
		zoo.Add(elefante3);
		zoo.Add(leon3);

		zoo.Add(elefante1);

		zoo.Add(elefante4);	
		zoo.Add(leon4);

		
		// TODO Auto-generated method stub
		System.out.println("En el zoo hay: " + zoo.GetNumberAnimales() + " animales");
		System.out.println("En el zoo hay: " + zoo.GetNumberAnimales(Elefante.class) + " elefantes");
		System.out.println("En el zoo hay: " + zoo.GetNumberAnimales(Leon.class) + " leones");
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("En el zoo hay: " + zoo.GetAnimalesHambrientos() + " animales hambrientos");
		elefante1.Alimentar(Especies.Animal.EnumAlimento.carnivora);
		elefante2.Alimentar(Especies.Animal.EnumAlimento.vegetal);	
		elefante3.Alimentar(Especies.Animal.EnumAlimento.carnivora);	
		leon1.Alimentar(Especies.Animal.EnumAlimento.vegetal);
		leon2.Alimentar(Especies.Animal.EnumAlimento.carnivora);	
		leon3.Alimentar(Especies.Animal.EnumAlimento.vegetal);

		System.out.println();
		System.out.println("En el zoo quedan: " + zoo.GetAnimalesHambrientos() + " animales hambrientos");
		System.out.println("En el zoo quedan: " + zoo.GetAnimalesHambrientos(Elefante.class) + " elefantes hambrientos");
		System.out.println("En el zoo quedan: " + zoo.GetAnimalesHambrientos(Leon.class) + " leones hambrientos");

		System.out.println();
		System.out.println();

		zoo.ConocerEstadoHambre();	
		
		
		System.out.println("ADN Elefante 1: " + elefante1.GetGenoma());
		System.out.println("ADN Elefante 2: " + elefante2.GetGenoma());
		
		Elefante elefante5 = elefante1.Criar(elefante2);
		
		// Visualizar ADN hijo
		System.out.println("ADN Elefante 5: " + elefante5.GetGenoma());
	}

}
