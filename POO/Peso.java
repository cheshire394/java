
public class Peso {

	/*7. Crea la clase peso, la cual tendrá las siguientes características:
a. Deberá tener un atributo donde se almacene el peso de un
objeto.
b. En el constructor se le pasará el peso y la medida en la que se
ha tomado ('Lb' para libras, 'Li' para lingotes, 'Oz' para onzas,
'P' para peniques, 'K' para kilos, 'G' para gramos y 'Q' para
quintales.
c. Deberá tener los siguientes métodos:
i. getLibras. Devuelve el peso en libras
ii. getLingotes. Devuelve el peso en lingotes
iii. convertirPeso(String medida). Devuelve el peso en la
medida que se pase como parámetro.
d. Para la realización del ejercicio toma como referencia los
siguientes datos:
i. 1 Libra = 16 onzas = 453 gramos
ii. 1 Lingote = 32.17 libras = 14.59 kg
iii. 1 Onza = 0.0625 libras= 28.35 gramos
iv. 1 Penique = 0.05 onzas = 1.55 gramos
v. 1 Quintal = 100 libras = 43.3 kg
e. Crea además una clase de prueba para testear y verificar los
métodos de esta clase.
	 */    // Constantes
	    final static int ERROR_MEDIDA = -1;

	    // Atributos
	    private double peso;
	    private String medida;

	    // Métodos constructores
	    public Peso() {
	    }

	    public Peso(double p_peso, String p_medida) {
	        this.peso = p_peso;
	        this.medida = p_medida;
	    }

	    public double getLibras() {
	        double pesoLibras;

	        switch (this.medida) {
	            case "Lb":
	                pesoLibras = this.peso;
	                break;
	            case "Li":
	                pesoLibras = this.peso * 32.17;
	                break;
	            case "Oz":
	                pesoLibras = this.peso * 0.0625;
	                break;
	            case "P":
	                pesoLibras = this.peso * 0.05 * 0.0625;
	                break;
	            case "K":
	                pesoLibras = this.peso * 453 / 1000;
	                break;
	            case "G":
	                pesoLibras = this.peso * 453;
	                break;
	            case "Q":
	                pesoLibras = this.peso * 100;
	                break;
	            default:
	                pesoLibras = ERROR_MEDIDA;
	        }

	        return pesoLibras;
	    }

	    public double getLingotes() {
	        double pesoLingotes = -1;

	        switch (this.medida) {
	            case "Li":
	                pesoLingotes = this.peso;
	                break;
	            case "Lb":
	                pesoLingotes = this.peso / 32.17;
	                break;
	            case "Oz":
	                pesoLingotes = getLibras() / 32.17;
	                break;
	            case "P":
	                pesoLingotes = getLibras() / 32.17;
	                break;
	            case "K":
	                pesoLingotes = getLibras() / 32.17;
	                break;
	            case "G":
	                pesoLingotes = getLibras() / 32.17;
	                break;
	            case "Q":
	                pesoLingotes = getLibras() / 32.17;
	                break;
	        }

	        return pesoLingotes;
	    }

	    public double convertirPeso(String medida) {

	        double pesoCalculado = -1;

	        switch (this.medida) {
	            case "Li":
	                pesoCalculado = getLingotes();
	                break;
	            case "Lb":
	                pesoCalculado = getLibras();
	                break;
	            case "Oz":
	                pesoCalculado = getLibras() * 0.0625;
	                break;
	            case "P":
	                pesoCalculado = getLibras() / 0.0625 / 0.05;
	                break;
	            case "K":
	                pesoCalculado = getLibras() * 453 / 1000;
	                break;
	            case "G":
	                pesoCalculado = getLibras() * 453;
	                break;
	            case "Q":
	                pesoCalculado = getLibras() / 100;
	                break;
	        }

	        return pesoCalculado;
	    }
	}
