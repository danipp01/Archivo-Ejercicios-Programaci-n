package ejercicioHerenciaObjetos.cuestionarioAbstracto;

import ejerciciosProgramacion.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuestionario {
	
	static List<Preguntas> preguntas = new ArrayList<Preguntas>();
	
	public static void main(String[] args) {
		PreguntasVF pregunta1 = new PreguntasVF ("1.) ¿La capital de España es Bilbao?" , "F");
		preguntas.add(pregunta1);
		PreguntaOpcionUnica pregunta2 = new PreguntaOpcionUnica(
				"2.) ¿Cuáles de estos animales no es un mamífero? \n 1.Ballena \n 2.Delfín \n 3.Tortuga \n 4.Girafa", 
				new String[] {"1","2","3","4"}, 3); 
		preguntas.add(pregunta2);
		
		int aciertos = 0;
		for (Preguntas p : preguntas) {
			p.mostrarPregunta();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			boolean correcta = p.verificarRespuesta(respuestaUsuario);
			if (correcta) {
				aciertos++;
			}
		}
		
		float puntuacion = aciertos / (float)preguntas.size() * 100;
		System.out.println("Puntuación: " + puntuacion);
		
	}

}
