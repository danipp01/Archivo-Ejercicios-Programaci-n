package capitulo04.bloque01_PrimerosObjetos;

public class Baraja {
	Carta cartas[] = new Carta [52];
	int porDondeVoyDandoCartas = cartas.length - 1;
	
	public Baraja() {
		int id = 0;
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(id, i, "picas");
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(id, i, "diamantes");
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(id, i, "treboles");
			id++;
		}
		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(id, i, "corazones");
			id++;
		}
	}
	
	public void desplazarAbajoArriba(){
		Carta aux = cartas[0];
		for (int i = 0; i < cartas.length - 1; i++) {
			cartas[i] = cartas[i + 1];
		}
		cartas[cartas.length - 1] = aux;
	}
	
	public void desplazarArribaAbajo(){
		Carta aux = cartas[cartas.length - 1];
		for (int i = cartas.length - 1; i < 0; i--) {
			cartas[i] = cartas[i - 1];
		}
		cartas[0] = aux;
	}
	
	public void barajarBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			int primerIndice = (int) Math.round(Math.random() * (cartas.length - 1));
			int segundoIndice = (int) Math.round(Math.random() * (cartas.length - 1));
			
			Carta aux =  cartas[primerIndice];
			cartas[primerIndice] = cartas[segundoIndice];
			cartas[segundoIndice] = aux;
		}
	}
			
	public void ordenarBaraja() {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < cartas.length - 1; i++) {
				if (cartas[i].getId() > cartas[i + 1].getId()) {
					// Entonces hago un intercambio
					Carta aux = cartas[i+1];
					cartas[i+1] = cartas[i];
					cartas[i] = aux;
					hayIntercambios = true;
				}
			}
		}
		while (hayIntercambios == true);
	}
	
	
	
	public void repartirCartas (Jugador jugador) {
		Carta cartasJugador[] = new Carta[5];
		for (int i = 0; i < cartasJugador.length; i++) {
			cartasJugador[i] = cartas[porDondeVoyDandoCartas];
			porDondeVoyDandoCartas--;
		}
	}
	
	

	


			
	public void mostrarBaraja(){
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());
		}
	}
}
