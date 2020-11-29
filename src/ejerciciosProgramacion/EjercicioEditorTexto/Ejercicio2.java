package EjercicioEditorTexto;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import ejerciciosProgramacion.Utils;

public class Ejercicio2 {
			/**
			 * 
			 * @param args
			 */

		public static void main(String[] args) {
			// Declaro variables necesarias
			int opcion;
			List<Integer> listanum = new ArrayList<Integer>();

				
			listanum.add(1);
			listanum.add(2);
			listanum.add(3);

				
			do {
					
				opcion = menu();

					
				switch (opcion) {
				case 0: 
					System.out.println("Adios!");
					break;
				case 1:
					inicializarListaAletoriamente(listanum);
					break;
				case 2:
					operacionesMatematicas(listanum);
					break;
				case 3:
					agregarNumAzar(listanum);
					break;
				case 4:
					eliminaValores(listanum);
					break;
				case 5:
					visualizaLista(listanum);
					break;
				default:
					System.out.println("Opción no válida");
				}

			} while (opcion != 0);

		}

			/**
			 * 
			 * 
			 * @return
			 */
		public static int menu() {
			String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Crear aleatoriamente la lista de valores"
						+ "\n2.- Calcular suma, media, mayor y menor" + "\n3.- Agregar una cantidad de nuevos valores"
						+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo" + "\n5.- Imprimir la lista de valores"
						+ "\n\nIntroduzca su opción: ";
				
			int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
				
			return opcionUsuario;
		}

			/**
			 * 
			 * @param lista
			 */
		public static void visualizaLista(List<Integer> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}

		public static void inicializarListaAletoriamente(List<Integer> lista) {
			if (!lista.isEmpty())
				lista.removeAll(lista);
			System.out.println("Escribe la longitud de la lista");
			int longitud = Utils.obtenerEntero();
			System.out.println("Valor minimo");
			int min = Utils.obtenerEntero();
			System.out.println("Valor máximo");
			int max = Utils.obtenerEntero();
			for (int i = 0; i < longitud; i++) {
				lista.add(i, Utils.obtenerNumeroAzar(min, max));
			}
		}

		public static void operacionesMatematicas(List<Integer> lista) {
			String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Suma" + "\n2.- Media" + "\n3.- Mayor" + "\n4.- Menor"
						+ "\n\nIntroduzca su opción: ";
			int opcionOperacion = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
			switch (opcionOperacion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				opcionSuma(lista);
				break;
			case 2:
				opcionMedia(lista);
				break;
			case 3:
				opcionMayor(lista);
				break;
			case 4:
				opcionMenor(lista);
				break;
			}

		}

		public static void opcionSuma(List<Integer> lista) {
			int total = 0;
			for (int i = 0; i < lista.size(); i++) {
				total += lista.get(i);
			}
			System.out.println("Suma total: " + total);
		}

		public static void opcionMedia(List<Integer> lista) {
			int total = 0;
			for (int i = 0; i < lista.size(); i++) {
				total += lista.get(i);
			}
			System.out.println("La media es " + (total / lista.size()));
		}

		public static void opcionMayor(List<Integer> lista) {
			int numMax = lista.get(0);
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i) > numMax) {
					numMax = lista.get(i);
				}
			}
			System.out.println("El mayor es: " + numMax);
		}

		public static void opcionMenor(List<Integer> lista) {
			int numMen = lista.get(0);
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i) < numMen) {
					numMen = lista.get(i);
				}
			}
			System.out.println("El menor es: " + numMen);
		}

		public static void agregarNumAzar(List<Integer> lista) {
			System.out.println("Escribe cuantos valores deseas agregar");
			int numvalores = Utils.obtenerEntero();
			System.out.println("Escribe la posicion donde deseas agregarlos");
			int posicion = Utils.obtenerEntero();
			System.out.println("Valor minimo");
			int min = Utils.obtenerEntero();
			System.out.println("Valor máximo");
			int max = Utils.obtenerEntero();
			for (int i = 0; i < numvalores; i++) {
				lista.add(posicion, Utils.obtenerNumeroAzar(min, max));
			}
		}

		public static void eliminaValores(List<Integer> lista) {
			System.out.println("Escribe el inicio del intervalo a eliminar");
			int num = Utils.obtenerEntero();
			System.out.println("Escribe el final del intervalo a eliminar");
			int num1 = Utils.obtenerEntero();
			for (int i = num; i <= num1; i++) {
				lista.remove(num);
			}
		}
		

}


