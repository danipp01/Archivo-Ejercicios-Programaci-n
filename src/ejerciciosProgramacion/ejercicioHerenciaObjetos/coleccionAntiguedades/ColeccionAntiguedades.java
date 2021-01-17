package ejercicioHerenciaObjetos.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Joya joya = new Joya(909, "Europa", 3500, "Bronce");
				Libro libro = new Libro(1320, "Inglaterra", 11.50f, "LosCien", "Tarzán");
				Jarron jarron = new Jarron(1310, "Japón", 213.32f, "Moderno", "Soca");
				Mueble mueble = new Mueble(1999, "Asiático", 3200.12f, "Pino", "Azul");
				
				System.out.println(joya.toString());
				System.out.println(libro.toString());
				System.out.println(jarron.toString());
				System.out.println(mueble.toString());
				
	}

}
