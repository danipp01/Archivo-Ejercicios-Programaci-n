package ejercicioHerenciaObjetos.cuestionarioAbstracto;

public class PreguntaOpcionUnica extends Preguntas {
	protected String opcion[] = new String[4];
	protected int respuestaUnica;

	public PreguntaOpcionUnica() {
	}

	public PreguntaOpcionUnica(String enunciado, String opcion[], int respuestaUnica) {
		super();
		this.opcion = opcion;
		this.respuestaUnica = respuestaUnica;
	}
	
	public void mostrarPregunta() {
		System.out.println("\n" + this.enunciado + "\n Elige la respuesta: \n");
		for (int i = 0; i < opcion.length; i++) {
			System.out.println(opcion[i] + ".-");
		}
	}
	
	public boolean verificarRespuesta(String respuestaUsuario) {
		if (this.respuestaUnica == Integer.parseInt(respuestaUsuario)) {
			return true;
		}
		return false;
	}
}
