package excepciones;

public class Main {

	public static void main(String[] args) {
		private static String fraseBombilla() throws PalabraClave, 
		 EspaciosEnBlanco, 
		 Menosde3palabras,
		 PalabraOfensiva {

			String frase = JOptionPane.showInputDialog("Inserte una frase con la palabra bombilla: ");

			if (frase.trim().equals("")) {
				throw new EspaciosEnBlanco("No hay palabras en la frase introducida");
			}

			String palabras[] = frase.split("[ ]{1,}");
			if (palabras.length < 3) {
				throw new Menosde3palabras(3);
			}

			if (frase.toUpperCase().indexOf("BOMBILLA") == -1) {
				throw new PalabraClave("La frase introducida no contiene la palabra -bombilla-");
			}

			String palabrasOfensivas[] = new String[] {"tonto", "tonta", "idiota"};
			for (String palabraOfensiva : palabrasOfensivas) {
				if (frase.toUpperCase().indexOf(palabraOfensiva) != -1) {
					throw new PalabraOfensiva("Palabra " + palabraOfensiva + " encontrada");
				}
			}

			return frase;

		}




		public static void main(String[] args) {

			try {
				System.out.println(fraseBombilla());

			}catch (EspaciosEnBlanco e) {
				e.printStackTrace();
			}
			catch (PalabraClave e) {
				e.printStackTrace();
			}
			catch (Menosde3palabras e) {
				e.printStackTrace();
			}
			catch (PalabraOfensiva e) {
				e.printStackTrace();
			}

		}

	}

}
