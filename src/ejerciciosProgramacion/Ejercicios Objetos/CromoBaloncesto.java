package capitulo04.bloque01_PrimerosObjetos;

static class CromoBaloncesto implements Comparable<CromoBaloncesto> {

		public String nombreJugador, equipoJugador;
		public int alturaCm, pesoKg, puntosMediosPorpartido;

		public CromoBaloncesto(String nombreJugador, int alturaCm, int pesokg, int puntosMediosPorpartido,
				String equipoJugador) {
			this.nombreJugador = nombreJugador;
			this.alturaCm = alturaCm;
			this.pesoKg = pesokg;
			this.puntosMediosPorpartido = puntosMediosPorpartido;
			this.equipoJugador = equipoJugador;

		}

		/**
		 * 
		 */
		public CromoBaloncesto() {
			System.out.println("Han construido un cromo de baloncesto");
		}

		/**
		 * 
		 */
		public String toString() {
			return "Nombre [nombre=" + nombreJugador + ", altura en cm =" + alturaCm + ", peso en kg =" + pesoKg
					+ ", puntos medios por partido =" + puntosMediosPorpartido;

		}
		
		// Getters y Setter
		/**
		 * 
		 */
		public String getNombre() {
			return nombreJugador;
		}

		/**
		 * 
		 */
		public void setNombre(String nombre) {
			this.nombreJugador = nombre;
		}

		/**
		 * 
		 */
		public int getalturaenccm() {
			return alturaCm;
		}

		/**
		 * 
		 */
		public void setalturaencm(int alturaCm) {
			this.alturaCm = alturaCm;
		}

		/**
		 * 
		 */
		public int getpesoKg() {
			return pesoKg;
		}

		/**
		 * 		 */
		public void setPesokg(int pesoKg) {
			this.pesoKg = pesoKg;
		}

		public int getppuntosMediosPorpartido() {
			return pesoKg;
		}

		/**
		 *  
		 */
		public void setpuntosMediosPorpartido(int puntosMediosPorpartido) {
			this.puntosMediosPorpartido = puntosMediosPorpartido;
		}

		public static void visualizaLista(List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}

		
		public int compareTo(CromoBaloncesto o) {
			if (puntosMediosPorpartido < o.puntosMediosPorpartido) {
				return -1;
			}
			if (puntosMediosPorpartido > o.puntosMediosPorpartido) {
				return 1;
			}
			return 0;
		}
	}

	static void imprimeArrayCromoBaloncesto(CromoBaloncesto[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". " + array[i].nombreJugador + " - Altura(cm): " + array[i].alturaCm
					+ " - Peso(kg): " + array[i].pesoKg + " - Puntos medios por partido: "
					+ array[i].puntosMediosPorpartido + " - Equipo: " + array[i].equipoJugador);
		}
	}

	public static void main(String[] args) {
		CromoBaloncesto[] arrayCromoBaloncesto = new CromoBaloncesto[5];
		arrayCromoBaloncesto[0] = new CromoBaloncesto("Myke", 180, 80, 60, "Boston Celtic");
		arrayCromoBaloncesto[1] = new CromoBaloncesto("Amador", 200, 60, 50, "Boston Celtic");
		arrayCromoBaloncesto[2] = new CromoBaloncesto("Aurelio", 200, 70, 41, "Red Sox");
		arrayCromoBaloncesto[3] = new CromoBaloncesto("Kobe", 197, 70, 49, "Lakers");
		arrayCromoBaloncesto[4] = new CromoBaloncesto("Mark", 203, 76, 49, "Lakers");

		System.out.println("Array sin ordenar por puntos medios por partido");
		imprimeArrayCromoBaloncesto(arrayCromoBaloncesto);
		// Ordeno por punto medios por partido (de menor a mayor).
		Arrays.sort(arrayCromoBaloncesto);
		System.out.println("Array ordenado por puntos medios por partido");
		imprimeArrayCromoBaloncesto(arrayCromoBaloncesto);
	}}