package capitulo04.bloque01_PrimerosObjetos;

public class Carta {
	int id;
	int numero;
	String palo;
	
	public Carta() {
		super();
	}
	
	public Carta(int id, int numero, String palo) {
		super();
		this.id = id;
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [id=" + id + ", numero=" + numero + ", palo=" + palo + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	
	





	
	
	
	
	
	
	
	
}
