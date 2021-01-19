package ejercicioHerenciaObjetos.cuestionarioAbstracto;

public abstract class Preguntas {
	protected String enunciado;
	
	public Preguntas() {
	}

	public Preguntas(String enunciado) {
		this.enunciado = enunciado;
	}

	public abstract void mostrarPregunta();
	
	public abstract boolean verificarRespuesta(String respuestaDelUsuario);
	
	public String toString() {
		return "Pregunta [enunciado=" + enunciado +"]";
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	
	
	
	
}
