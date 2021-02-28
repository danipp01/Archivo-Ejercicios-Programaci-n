package excepciones;

public class PalabraOfensiva extends Exception{
	public PalabraOfensiva() {
		
	}

	public PalabraOfensiva(String message) {
		super(message);
		
	}

	public PalabraOfensiva(Throwable cause) {
		super(cause);
	
	}
	
	
}
