package capitulo04.bloque01_PrimerosObjetos;

public class Poker {
	Jugador jugadores[] = new Jugador[5];
	
	Baraja baraja;


	public Poker(Baraja baraja) {
		this.baraja = baraja;
		jugadores[0] = new Jugador("Jugador1");
		jugadores[1] = new Jugador("Jugador2");
		jugadores[2] = new Jugador("Jugador3");
		jugadores[3] = new Jugador("Jugador4");
		jugadores[4] = new Jugador("Jugador5");
		
		for (int i = 0; i < jugadores.length; i++) {
			baraja.repartirCartas(jugadores[i]);
			System.out.println("Jugador/a: " + jugadores[i].getNombre());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t " + jugadores[i].getMano()[j].toString());
			}
		}
		
		
	}
}
