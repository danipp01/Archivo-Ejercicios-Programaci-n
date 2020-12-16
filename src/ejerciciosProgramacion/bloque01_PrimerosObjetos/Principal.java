package capitulo04.bloque01_PrimerosObjetos;

public class Principal {
		
	public static void main(String[]args) {
		Baraja baraja = new Baraja();
		


		baraja.barajarBaraja();
		
		baraja.ordenarBaraja();

	
		Poker poker = new Poker(baraja);
	}
		
		baraja.mostrarBaraja();
	}
	

