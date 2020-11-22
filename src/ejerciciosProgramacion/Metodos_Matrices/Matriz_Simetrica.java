package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Matriz_Simetrica {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 3, 9 }, { 3, 2, 4 }, { 9, 3, 4 } };
		Utils.ImprimirMatriz(matriz);
		boolean simetria = MatrizSimetrica(matriz);
		System.out.println(simetria);

	}

	public static boolean MatrizSimetrica(int matriz[][]) {
		boolean simetrico = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					simetrico = true;
				} else {
					return false;
				}
			}
		}
		return simetrico;
	}

}
