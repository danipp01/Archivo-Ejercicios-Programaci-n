package ejercicioHerenciaObjetos.cuestionarioAbstracto;

public class PreguntasVF extends Preguntas {
	
	protected String respuestaVF;
	
	public PreguntasVF() {
	}

	public PreguntasVF(String enunciado, String respuestaVF) {
		super();
		this.respuestaVF = respuestaVF;
	}
	
	public void mostrarPregunta() {
		System.out.println("\n" + this.enunciado + "Elige la respuesta: V o F: \n");
	}
				
	public boolean verificarRespuesta(String respuestaUsuario) {
		if (this.respuestaVF.equals(respuestaUsuario.toUpperCase())) {
			return true;
		}
		return false;
	}
	
	
}
