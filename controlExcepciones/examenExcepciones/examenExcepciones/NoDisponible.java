package delSazCotalloAlicia;

public class NoDisponible extends Exception{

	
	private String msg;
	private int error;
	
	
	public NoDisponible(String msg, int error) {
		super();
		this.msg = msg;
		this.error = error;
	}
	
	public int error() {
		
		return this.error; 
	}
	
	public String mensaje() {
		return this.msg + " codigo error:  "+ this.error;
	}
}
