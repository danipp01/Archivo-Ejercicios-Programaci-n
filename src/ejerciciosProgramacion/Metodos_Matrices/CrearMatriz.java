package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class CrearMatriz {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		CrearMatrizAzar(matriz);
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void CrearMatrizAzar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}

	}

}
