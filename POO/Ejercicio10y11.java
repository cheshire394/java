public class Ejercicio10y11 {
    //Atributos
    private double papas, chocos;

    //Métodos de clase o estáticos
    public static int clientes(double papas, double chocos) {
        int clientesPapas = (int) (papas * 3.0);
        int clientesChocos = (int) (chocos * 6.0);

        if(clientesPapas<clientesChocos) return clientesPapas;
        else return clientesChocos;
    }   
    

    //Ampliación ejercicio 11
    public Ejercicio10y11() {
    
    }

    public Ejercicio10y11(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }
    
    public double getPapas() {
        return this.papas;
    }

    public void setPapas(double papas) {
        this.papas = papas;
    }

    public double getChocos() {
        return this.chocos;
    }

    public void setChocos(double chocos) {
        this.chocos = chocos;
    }

    public void addChocos(int x) {
        this.chocos += x;
    }

    public void addPapas(int x) {
        this.papas += x;
    }

    public int getComensales() {
        int clientesPapas = (int) (this.papas * 3.0);
        int clientesChocos = (int) (this.chocos * 6.0);

        if(clientesPapas<clientesChocos) return clientesPapas;
        else return clientesChocos;        
    }

    public void showChocos() {
        System.out.println(this.getChocos()+" kg de chocos en el almacén");
    }

    public void showPapas() {
        System.out.println(this.getPapas()+" kg de chocos en el almacén");
    }

    //Método main
    public static void main(String[] args) {
        double papas = 2.5, chocos = 2;
        //System.out.println("Con "+papas+" kg de papas y "+chocos+" kg de chocos, Israel atiende a "+Ejercicio10y11.clientes(papas,chocos)+" clientes");
        
        Ejercicio10y11 israel = new Ejercicio10y11(papas,chocos);
        System.out.println("Con "+papas+" kg de papas y "+chocos+" kg de chocos, Israel atiende a "+israel.getComensales()+" clientes");
        israel.addPapas(5);
        israel.showPapas();
    }
}
