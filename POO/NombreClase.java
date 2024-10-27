
 /*public class NombreClase {
		
	private int atributo1;
	private String atributo2;
	private boolean atributo3;
	
	1//METODO QUE INICA OBJ ANONIMO
	public static NombreClase metodoCreaObj() {
		return new NombreClase (0,0,0);}
	// EN MAIN --> NombreClase objNuevo = nombreClase.metodoCreaObj();
	
	2//METODO QUE COMPARA SI los atributos de dos OBJ SON IGUALES(SIN EQUALS creo que solo vale int)
	public boolean compruebaIgual (NombreClase p_aliasObj) {
		if ((p_aliasObj.getAtributo1()== this.atributo1)&&
				(p_aliasObj.getAtributo2()== this.atributo2)) {
			return true;}
		}else {return false;}
		//en main --> boolean resultado = obj1.compruebaIgual(obj2); sop(respuesta);
		
	3//EQUALS, source solo modificar 3ºif --> this.getClass()
	y return objects.equals(this.getAtributo1(), other.getAtributo());
	MAIN --> SOP(obj1.equals(obj2));
	// tambien crear variable main boolean comparacion = obj1.equals(obj2); sop(comparacion);
	  
	PARAMETROS A CONSTRUCTOR SIN PARAMETROS:
	public NombreClase(){
		this.atributo2 = "nombre";}
	MAIN--> SOP(objsinParametros.getAtributo2());
	
	PARAMETROS VALORES NO CONTRUCTOR:
	public void pasoParametros(int P_num){
			p_num = p_num + 5;}
	MAIN --> NombreObj.pasoParametro(NombreVariabledeMain); SOP(variabledemain);
	
	PARAMETROS REFERENCIA OBJ-PARAMETRO
	public void pasoReferencia(NombreClase objParametrizado){
		int numAux = objParametrizado.getAtributo1() + 5;}
		objparametrizado.setAtributo1(numAux);
	MAIN --> nombreObj.pasoReferencia(nombreObj); SOP(nombreObj.getAtributo());
	
	PARAMETROS PARA VARIABLE DE MAIN(NO ATRIB CLASE)
	public static void parametrosVariables (String...parametros){
	for(String ejemplo:parametros) SOP ("parametros son:"+ ejemplo)}
	MAIN --> nombreClase.parametrosVariables("uno"); 
			nombreClase.parametrosVariables("uno", "dos");
	
	CONTRUCTOR COPIA
	public nombreClase (nombreClase p_aliasObj){
		this.atributo1 = p_aliasObj.getAtributo1();
		this.atributo2 = p_aliasObj.getAtributo2();}
		MAIN--> NombreClase		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	*/

