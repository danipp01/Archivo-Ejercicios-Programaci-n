package excepciones;

public class MenosPalabras extends Exception{
	private int minimoNumeroPalabras;
	
	public MenosPalabras(int minimoNumeroPalabras) {
		this.minimoNumeroPalabras = minimoNumeroPalabras;
	}
	
	public MenosPalabras(String message) {
		super(message);
	}

	public MenosPalabras(Throwable cause) {
		super(cause);
	}

	public MenosPalabras(String message, Throwable cause) {
		super(message, cause);
		
	}
}
