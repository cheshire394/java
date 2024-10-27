package delSazCotalloAlicia;

public class NoExiste extends Exception {

	
	private String msg; 

	
	
	public NoExiste(String msg) {
		super();
		this.msg = msg;
		
	} 
	
	public String mensaje() {
		
		
		return this.msg;
	}
	
}
