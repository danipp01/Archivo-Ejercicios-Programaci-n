package capitulo04.bloque01_PrimerosObjetos;

import java.util.Arrays;

public class Jugador {
	
	String nombre;
	Carta mano[] = new Carta[5];
	
	
	public Jugador() {
		super();
	}


	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Carta[] getMano() {
		return mano;
	}


	public void setMano(Carta[] mano) {
		this.mano = mano;
	}


	
}
